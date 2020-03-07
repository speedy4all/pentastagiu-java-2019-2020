package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.movie.HibernateMovieRepository;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.api.HibernateMovieService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import com.pentalog.pentastagiu.web.exception.EntityNotFoundException;
import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Service
public class HibernateMovieServiceImpl implements HibernateMovieService {

    private final HibernateMovieRepository movieRepository;

    public HibernateMovieServiceImpl(HibernateMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getById(String id) {
        return movieRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Movie", id));
    }

    @Override
    public Movie create(MovieDTO movieDTO) {
        Movie movie = new Movie();
        // when creating a new entity, we don't set the id, we let it to be managed by the db  implementation

 //       Actor actor = new Actor();
//        actor
//                .setName("Vasile1")
//                .setSurname("Popescu")
//                .setPosterURL("url");

        movie
                .setName(movieDTO.getName())
                .setPosterUrl(movieDTO.getPosterUrl())
                .setRating(movieDTO.getRating());
                //.setActors(new HashSet<Actor>());

                //.setActors(new org.hibernate.mapping.List(Actor));
                //.setActors(new HashSet<>(Collections.singletonList(actor)));


        //saved movie contains id also
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie;
    }


    @Override
    public void delete(String movieId) {
        Movie movie = getById(movieId);
        movieRepository.delete(movie);
    }

    @Override
    public void update(String movieId, MovieDTO movieDTO) {
        Movie dbMovie = getById(movieId);
        dbMovie
                .setName(movieDTO.getName())
                .setPosterUrl(movieDTO.getPosterUrl())
                .setRating(movieDTO.getRating());

        Movie updatedMovie = movieRepository.save(dbMovie);
    }

    @Override
    public List<Movie> search(String startsWith) {
        List<Movie> movies = movieRepository.findAllByNameStartingWith(startsWith);
        return movies;
    }



}
