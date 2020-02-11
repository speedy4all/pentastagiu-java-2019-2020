package com.pentalog.pentastagiu.repository;

import com.pentalog.pentastagiu.repository.api.MovieRepository;
import com.pentalog.pentastagiu.repository.data.MovieProvider;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MovieRepositoryImpl implements MovieRepository {
    @Override
    public List<MovieDTO> getAll() {
        return MovieProvider.getAll();
    }

    @Override
    public MovieDTO getById(String id) {
        return MovieProvider.getById(id);
    }

    @Override
    public MovieDTO create(MovieDTO movieDTO) {
        return MovieProvider.create(movieDTO);
    }
}
