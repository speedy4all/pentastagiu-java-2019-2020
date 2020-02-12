package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.api.MovieRepository;
import com.pentalog.pentastagiu.repository.data.MovieProvider;
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

    @Override
    public List<MovieDTO> getAll() {
        return movieRepository.getAll();
    }

    @Override
    public MovieDTO getById(String id) {
        MovieDTO movieDTO = movieRepository.getById(id);
        if(movieDTO == null) {
            throw new NoMovieException(id);
        }
        return movieDTO;
    }

    @Override
    public MovieDTO create(MovieDTO movieDTO) {
        return null;
    }
}
