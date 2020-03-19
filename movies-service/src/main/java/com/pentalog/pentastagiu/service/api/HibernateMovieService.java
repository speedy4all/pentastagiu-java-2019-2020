package com.pentalog.pentastagiu.service.api;

import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.List;

public interface HibernateMovieService {
    List<Movie> getAll();

    Movie getById(String id);

    Movie create(MovieDTO movie);

    Movie save(Movie movie);

    void delete(String movieId);

    void update(String movieId, MovieDTO movie);

    List<Movie> search(String startsWith);
}
