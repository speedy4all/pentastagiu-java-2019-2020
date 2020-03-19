package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.api.MovieRepository;
import com.pentalog.pentastagiu.repository.model.movie.HibernateMovieRepository;
import com.pentalog.pentastagiu.service.api.MovieService;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import com.pentalog.pentastagiu.web.exception.NoMovieException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Resource
    private MovieRepository movieRepository;

    private  final HibernateMovieRepository hibernateMovieRepository;

    public MovieServiceImpl(HibernateMovieRepository hibernateMovieRepository) {
        this.hibernateMovieRepository = hibernateMovieRepository;
    }

    @Override
    public List<MovieDTO> getAll() {
        return movieRepository.getAll();
    }

    @Override
    public MovieDTO getById(String id) {
        MovieDTO movieDTO = movieRepository.getById(id);
        if(movieDTO==null){
            throw new NoMovieException(id);
        }
        return movieDTO;
    }

    @Override
    public MovieDTO create(MovieDTO movieDTO) {
        return movieRepository.create(movieDTO);
    }

    @Override
    public MovieDTO save(MovieDTO movieDTO) {

        return movieRepository.save(movieDTO);
    }

    @Override
    public void delete(String movieId) {
        MovieDTO byId = getById(movieId);
        if(byId==null){
            throw new RuntimeException("Movie does't exists!");
        }
        movieRepository.delete(movieId);
    }

    @Override
    public void update(String movieId, MovieDTO movieDTO) {
        movieRepository.update(movieId,movieDTO);
    }

    @Override
    public List<MovieDTO> search(String startsWith) {
       return movieRepository.findAllByNameStartingWith(startsWith);
    }
}
