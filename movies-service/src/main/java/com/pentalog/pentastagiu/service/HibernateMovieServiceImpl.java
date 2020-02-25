package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.model.movie.HibernateMovieRepository;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.api.HibernateMovieService;
import com.pentalog.pentastagiu.service.api.MapperService;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import com.pentalog.pentastagiu.web.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HibernateMovieServiceImpl implements HibernateMovieService {
    private final HibernateMovieRepository movieRepository;
    private final MapperService mapperService;

    @Autowired
    public HibernateMovieServiceImpl(HibernateMovieRepository movieRepository, MapperService mapperService) {
        this.movieRepository = movieRepository;
        this.mapperService = mapperService;
    }

    @Override
    public List<MovieDTO> getAll() {
        List<Movie> movies = movieRepository.findAll();
        return mapperService.mapListMovieToMovieDTOList(movies);
    }

    @Override
    public MovieDTO getById(String id) {
        Movie seekMovie = movieRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Movie", id));
        return mapperService.mapMovieToMovieDTO(seekMovie);
    }

    @Override
    public MovieDTO create(MovieDTO movieDTO) {
        Movie movie = mapperService.mapMovieDTOToMovie(movieDTO);
        movie.setId(null);
        Movie savedMovie = movieRepository.save(movie);
        return mapperService.mapMovieToMovieDTO(savedMovie);
    }

    @Override
    public void delete(String movieId) {
        MovieDTO movieDTO = getById(movieId);
        Movie movie = mapperService.mapMovieDTOToMovie(movieDTO);
        movieRepository.delete(movie);
    }

    @Override
    public void update(String movieId, MovieDTO movieDTO) {
        MovieDTO dbMovieDTO = getById(movieId);
        updateMovieDTOFields(dbMovieDTO, movieDTO);
        Movie dbMovie = mapperService.mapMovieDTOToMovie(dbMovieDTO);
        movieRepository.save(dbMovie);
    }

    @Override
    public List<MovieDTO> search(String startsWith) {
        List<Movie> movies = movieRepository.findAllByNameStartingWith(startsWith);
        return mapperService.mapListMovieToMovieDTOList(movies);
    }

    private void updateMovieDTOFields(MovieDTO dbMovieDTO, MovieDTO movieDTO) {
        dbMovieDTO.setName(movieDTO.getName());
        dbMovieDTO.setPosterUrl(movieDTO.getPosterUrl());
        dbMovieDTO.setRating(movieDTO.getRating());
    }
}
