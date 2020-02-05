package com.pentalog.pentastagiu.repository.data;

import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class MovieProvider {

    private static HashMap<String, MovieDTO> movies = new HashMap<>();
    static {
        MovieDTO firstMovie = new MovieDTO(UUID.randomUUID().toString(), "The Shawshank Redemption", "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg");
        MovieDTO secondMovie = new MovieDTO(UUID.randomUUID().toString(), "The Godfather", "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg");

        movies.put(firstMovie.getId(), firstMovie);
        movies.put(secondMovie.getId(), secondMovie);
    }

    public static List<MovieDTO> getAll() {
        return new ArrayList<>(movies.values());
    }

    public static MovieDTO getById(String id) {
        return movies.get(id);
    }

    public static MovieDTO create(MovieDTO movieDTO) {
        movieDTO.setId(UUID.randomUUID().toString());

        movies.put(movieDTO.getId(), movieDTO);

        return movieDTO;

    }
}
