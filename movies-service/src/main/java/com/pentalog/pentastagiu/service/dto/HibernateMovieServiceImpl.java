package com.pentalog.pentastagiu.service.dto;

import com.pentalog.pentastagiu.repository.model.actor.Actors;
import com.pentalog.pentastagiu.repository.model.actor.HibernateActorRepository;
import com.pentalog.pentastagiu.repository.model.movie.HibernateMovieRepository;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.api.HibernateMovieService;
import com.pentalog.pentastagiu.web.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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

        movieNew.setName(movie.getName());
        movieNew.setPosterUrl(movie.getPosterUrl());
        movieNew.setRating(movie.getRating());

        Set<Actors> actorsSet = movie.getActors().stream().map(dto -> {
            Actors actor = new Actors();
            actor.setName(dto.getName());
            actor.setSurname(dto.getSurname());
            actor.setPosterUrl(dto.getPosterUrl());
            return actor;
        }).collect(Collectors.toSet());

        movieNew.setActors(actorsSet);

        return hibernateMovieRepository.save(movieNew);
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
