package com.pentalog.pentastagiu.service.api;


import com.pentalog.pentastagiu.service.dto.MovieDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MovieService {

    List<MovieDTO> getAll();

    MovieDTO getById(String id);

    MovieDTO create(MovieDTO movieDTO);
}
