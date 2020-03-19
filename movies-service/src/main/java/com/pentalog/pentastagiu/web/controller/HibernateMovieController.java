package com.pentalog.pentastagiu.web.controller;

import com.pentalog.pentastagiu.repository.model.actor.HibernateActorRepository;
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
@RestController
@RequestMapping("/api/v1/hibernate/movies")
public class HibernateMovieController {
    private HibernateMovieService movieService;
    public HibernateMovieController(HibernateMovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping
    public List<Movie> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie > getById(@NotEmpty @PathVariable String id) {
        return ResponseEntity.ok(movieService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@Valid @RequestBody MovieDTO movieDTO) {
        return movieService.create(movieDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@NotEmpty @PathVariable("id") String movieId){
        movieService.delete(movieId);
    }

    @PutMapping("/{id}")
    public void update(@NotEmpty @PathVariable("id") String movieId, @Valid @RequestBody MovieDTO movieDTO) {
        movieService.update(movieId,movieDTO);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> search(@NotEmpty @RequestParam(value = "startswith", required = true)String startsWith,
                                              @RequestParam("intParam") Integer intParam){
        return ResponseEntity.of(Optional.of(movieService.search(startsWith)));
    }

}
