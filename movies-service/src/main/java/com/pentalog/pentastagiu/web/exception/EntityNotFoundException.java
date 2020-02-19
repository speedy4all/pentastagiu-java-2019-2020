package com.pentalog.pentastagiu.web.exception;

import org.springframework.http.HttpStatus;

public class EntityNotFoundException extends RuntimeException {
    private String name;
    private String id;

    public EntityNotFoundException(String name, String id) {
        this.name = name;
        this.id = id;
    }

    private HttpStatus status = HttpStatus.NOT_FOUND;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
