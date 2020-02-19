package com.pentalog.pentastagiu.web.exception;

import com.pentalog.pentastagiu.web.controller.MovieController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestControllerAdvice(basePackageClasses = MovieController.class)
public class RestExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Map<String, String>> handleValidationException(MethodArgumentNotValidException e) {
        HashMap<String, String> errors = new HashMap<>();

        e.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(fieldName, message);
        });

        return ResponseEntity.of(Optional.of(errors));
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ApiError> handeEntityNotFound(EntityNotFoundException e, HttpServletResponse response) {
        ResponseEntity<ApiError> responseEntity = buildResponseEntity(new ApiError(e.getStatus(), e.getName() + " was not found", e));
        response.setStatus(e.getStatus().value());
        return responseEntity;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGenericException(Exception e, HttpServletResponse response) {
        LOGGER.error("Untreated exception occurred! ", e);
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        response.setStatus(status.value());
        return this.buildResponseEntity(new ApiError(status, "Internal Server Error: Unexpected exception", e));
    }

    private ResponseEntity<ApiError> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

}
