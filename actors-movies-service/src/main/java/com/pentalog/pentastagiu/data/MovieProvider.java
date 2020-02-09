package com.pentalog.pentastagiu.data;

import com.pentalog.pentastagiu.dto.MovieDTO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class MovieProvider {
    private static HashMap<String, MovieDTO> movies = new HashMap<>();
    static {
        MovieDTO firstMovie = new MovieDTO(UUID.randomUUID().toString(), "Titanic", "https://www.imdb.com/title/tt0120338/mediaviewer/rm2647458304");
        MovieDTO secondMovie = new MovieDTO(UUID.randomUUID().toString(), "A quiet place II", "https://www.imdb.com/title/tt6644200/mediaviewer/rm2582992384");
        MovieDTO thirdMovie = new MovieDTO(UUID.randomUUID().toString(), "A quiet place", "https://www.imdb.com/title/tt6644200/mediaviewer/rm2582992384");

        movies.put(firstMovie.getId(), firstMovie);
        movies.put(secondMovie.getId(), secondMovie);
        movies.put(thirdMovie.getId(), thirdMovie);

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
