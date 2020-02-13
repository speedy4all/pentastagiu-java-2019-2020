package com.pentalog.pentastagiu.web.controller;

import com.pentalog.pentastagiu.service.api.MovieService;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Resource
    private MovieService movieService;

    @GetMapping
    public List<MovieDTO> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDTO> getById(@PathVariable String id) {
        return ResponseEntity.ok(movieService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDTO create(@Valid @RequestBody MovieDTO movieDTO) {
        return movieService.create(movieDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String movieId) {
        movieService.delete(movieId);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String movieId, @Valid @RequestBody MovieDTO movieDTO) {
        movieService.update(movieId, movieDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MovieDTO>> search(
            @RequestParam("startsWith") String startsWith,
            @RequestParam ("intParam") Integer intParam
    ) {
//        Optional example
//        String s;
//        Optional<String> optionalS = Optional.of(s);
//
//        optionalS.ifPresent(String::toLowerCase);
//        String orElseGet = optionalS.orElseGet(() -> "default");
//        optionalS.orElseThrow(() -> new RuntimeException("Optional runtime exception"));

        return ResponseEntity.of(Optional.of(movieService.search(startsWith)));

    }


    @GetMapping("/searchWithBox")
    public ResponseEntity<List<MovieDTO>> search(RequestParamBox searchParameters) {
//        Optional example
//        String s;
//        Optional<String> optionalS = Optional.of(s);
//
//        optionalS.ifPresent(String::toLowerCase);
//        String orElseGet = optionalS.orElseGet(() -> "default");
//        optionalS.orElseThrow(() -> new RuntimeException("Optional runtime exception"));

        return ResponseEntity.of(Optional.of(movieService.search(searchParameters.getStartsWith())));

    }


}
