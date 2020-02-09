package com.pentalog.pentastagiu.controller;

import com.pentalog.pentastagiu.data.MovieProvider;
import com.pentalog.pentastagiu.dto.MovieDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    //@RequestMapping(value = "/api/v1/movies", method = RequestMethod.GET)
    @GetMapping
    public List<MovieDTO> getAll() {
        return MovieProvider.getAll();
    }

    @GetMapping("/{id}")
    public MovieDTO getById(@PathVariable String id) {
        return MovieProvider.getById(id);
    }

    @PostMapping
    public MovieDTO createMovie(@RequestBody MovieDTO movieDTO) {
        return MovieProvider.create(movieDTO);
    }
}
