package com.pentalog.pentastagiu.controller;

import com.pentalog.pentastagiu.data.MovieProvider;
import com.pentalog.pentastagiu.dto.MovieDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping
    public List<MovieDTO> getAll() {
        return MovieProvider.getAllMovies();
    }

    @GetMapping("/{id}")
    public MovieDTO getById(@PathVariable String id) {
        return MovieProvider.getMovieById(id);
    }

    @PostMapping
    public MovieDTO create(@RequestBody MovieDTO movieDTO) {
        return MovieProvider.create(movieDTO);
    }
}
