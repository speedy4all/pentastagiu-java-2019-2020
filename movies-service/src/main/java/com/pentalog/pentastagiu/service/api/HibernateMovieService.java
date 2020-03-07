package com.pentalog.pentastagiu.service.api;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.List;

public interface HibernateMovieService {

    List<Movie> getAll();

    Movie getById(String id);

    Movie create(MovieDTO movieDTO);

    void delete(String movieId);

    void update(String movieId, MovieDTO movieDTO);

    List<Movie> search(String startsWith);

}
