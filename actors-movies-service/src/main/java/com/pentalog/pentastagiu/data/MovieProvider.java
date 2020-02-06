package com.pentalog.pentastagiu.data;

import com.pentalog.pentastagiu.dto.MovieDTO;

import java.util.*;

public class MovieProvider {
    private static HashMap<String, MovieDTO> movies = new HashMap<>();
    static {
        MovieDTO horror = new MovieDTO(UUID.randomUUID().toString(),"The Blancheville Monster", "https://m.media-amazon.com/images/M/MV5BYjE0ZWI0YWUtYjgyOC00ZmZlLWFjODgtNWE3MzFkMzcwYjQ4XkEyXkFqcGdeQXVyNTA2NDc4OA@@._V1_SY1000_CR0,0,708,1000_AL_.jpg");
        MovieDTO comedy  = new MovieDTO(UUID.randomUUID().toString(), "Scary Movie", "https://m.media-amazon.com/images/M/MV5BMGEzZjdjMGQtZmYzZC00N2I4LThiY2QtNWY5ZmQ3M2ExZmM4XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg" );
        MovieDTO scienceFiction = new MovieDTO(UUID.randomUUID().toString(), "Science Fiction", "https://m.media-amazon.com/images/M/MV5BMjk4OTAxYzgtN2EwNi00NTUxLThmZTktNDQ3NTI1YTlmODFmXkEyXkFqcGdeQXVyNTIzNDEzMzU@._V1_SY1000_CR0,0,772,1000_AL_.jpg");
        movies.put(horror.getId(), horror);
        movies.put(comedy.getId(), comedy);
        movies.put(scienceFiction.getId(), scienceFiction);
    }

    public static List<MovieDTO> getAllMovies(){
        return new ArrayList<>(movies.values());
    }

    public static MovieDTO getMovieById(String id){
        return movies.get(id);
    }

    public static MovieDTO create(MovieDTO movieDTO){
        Objects.requireNonNull(movieDTO, "Movie object can't be null");
        movieDTO.setId(UUID.randomUUID().toString());

        movies.put(movieDTO.getId(), movieDTO);

        return movieDTO;
    }
}
