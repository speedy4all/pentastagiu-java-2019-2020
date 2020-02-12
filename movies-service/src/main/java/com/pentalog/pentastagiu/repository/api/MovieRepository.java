package com.pentalog.pentastagiu.repository.api;

import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.List;

public interface MovieRepository {

    List<MovieDTO> getAll();

    MovieDTO getById(String id);
}
