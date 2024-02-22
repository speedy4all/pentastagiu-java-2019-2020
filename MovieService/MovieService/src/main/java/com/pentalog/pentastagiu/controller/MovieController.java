package com.pentalog.pentastagiu.controller;

import com.pentalog.pentastagiu.data.MovieProvider;
import com.pentalog.pentastagiu.dto.MovieDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    @GetMapping
    public List<MovieDTO> getAllMovies() {
        return MovieProvider.getAllMovies();
    }

    @GetMapping("/{id}")
    public MovieDTO getMovieById(@PathVariable String id){
        return MovieProvider.getMovieById(id);
    }

    @PostMapping
    public MovieDTO addMovie(@RequestBody MovieDTO movieDTO){
        return MovieProvider.addMovie(movieDTO);
    }
}
