package com.pentalog.pentastagiu.web.controller;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.api.HibernateMovieService;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

/**
 * This is an example of a rest controller talking with a real DB via hibernate implementation
 */

@RestController
@RequestMapping("/api/v1/hibernate/movies")
public class HibernateMovieController {
    private final HibernateMovieService movieService;

    public HibernateMovieController(HibernateMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getById(@NotEmpty @PathVariable String id) {
        return ResponseEntity.ok(movieService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@Valid @RequestBody MovieDTO movieDTO) {
        return movieService.create(movieDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@NotEmpty @PathVariable("id") String movieId) {
        movieService.delete(movieId);
    }

    @PutMapping("/{id}")
    public void update(@NotEmpty @PathVariable("id") String movieId, @Valid @RequestBody MovieDTO movieDTO) {
        movieService.update(movieId, movieDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> search(
            @NotEmpty @RequestParam(value = "startsWith", required = true) String startsWith,
            @RequestParam("intParam") Integer intParam
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
    public ResponseEntity<List<Movie>> search(@Valid RequestParamBox searchParameters) {
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
