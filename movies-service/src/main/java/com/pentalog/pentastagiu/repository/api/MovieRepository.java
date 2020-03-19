package com.pentalog.pentastagiu.repository.api;

import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.List;

public interface MovieRepository {
    List<MovieDTO> getAll();
    MovieDTO getById(String id);
    MovieDTO create(MovieDTO movieDTO);

    MovieDTO save(MovieDTO movieDTO);

    void delete(String movieId);

    void update(String movieId, MovieDTO movieDTO);

    List<MovieDTO> findAllByNameStartingWith(String startsWith);
}
