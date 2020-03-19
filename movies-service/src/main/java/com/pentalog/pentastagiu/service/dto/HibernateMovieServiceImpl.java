package com.pentalog.pentastagiu.service.dto;

import com.pentalog.pentastagiu.repository.model.actor.Actors;
import com.pentalog.pentastagiu.repository.model.actor.HibernateActorRepository;
import com.pentalog.pentastagiu.repository.model.movie.HibernateMovieRepository;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.api.HibernateMovieService;
import com.pentalog.pentastagiu.web.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HibernateMovieServiceImpl implements HibernateMovieService {
    private final HibernateMovieRepository hibernateMovieRepository;
    public HibernateMovieServiceImpl(HibernateMovieRepository hibernateMovieRepository) {
        this.hibernateMovieRepository = hibernateMovieRepository;
    }


    @Override
    public List<Movie> getAll() {
      return   hibernateMovieRepository.findAll();
    }

    @Override
    public Movie getById(String id) {
        return hibernateMovieRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Movie",id));
    }

    @Override
    public Movie create(MovieDTO movie) {
        Movie movieNew= new Movie();
        Actors actor = new Actors();
        actor.setName(actor.getName());
        actor.setSurname(actor.getSurname());
        actor.setPosterUrl(actor.getPosterUrl());

        movieNew.setName(movie.getName());
        movieNew.setPosterUrl(movie.getPosterUrl());
        movieNew.setRating(movie.getRating());
        movieNew.setActors(new HashSet<>(Collections.singletonList(actor)));

        Movie savedMovie = hibernateMovieRepository.save(movieNew);
        return savedMovie;
    }

    @Override
    public Movie save(Movie movie) {
        return null;
    }

    @Override
    public void delete(String movieId) {
    Movie movie=getById(movieId);
    hibernateMovieRepository.delete(movie);
    }

    @Override
    public void update(String movieId, MovieDTO movie) {
    Movie dbmovie= getById(movieId);
    dbmovie.setName(movie.getName());
    dbmovie.setPosterUrl(movie.getPosterUrl());
    dbmovie.setRating(movie.getRating());
    hibernateMovieRepository.save(dbmovie);
    }

    @Override
    public List<Movie> search(String startsWith) {
        List<Movie> movies = hibernateMovieRepository.findAllByNameStartingWith(startsWith);
        return movies;
    }
}
