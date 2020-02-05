package com.pentalog.pentastagiu.data;

import com.pentalog.pentastagiu.dto.MovieDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class MovieProvider {
    private static HashMap<String, MovieDTO> movies = new HashMap<>();
    static{

        MovieDTO m1 = new MovieDTO(UUID.randomUUID().toString(),"1917","https://www.imdb.com/title/tt8579674/mediaviewer/rm144738817");
        MovieDTO m2 = new MovieDTO(UUID.randomUUID().toString(),"Uncut Gems","https://www.imdb.com/title/tt5727208/mediaviewer/rm1399035137");
        MovieDTO m3 = new MovieDTO(UUID.randomUUID().toString(),"Joker","https://www.imdb.com/title/tt7286456/mediaviewer/rm3353122305");

    movies.put(m1.getId(),m1);
    movies.put(m2.getId(),m2);
    movies.put(m3.getId(),m3);
    }

    public static List<MovieDTO> getAllMovies (){
        return new ArrayList<>(movies.values());
    }

    public static MovieDTO getMovieById(String id){
        return movies.get(id);
    }

    public static MovieDTO addMovie(MovieDTO movieDTO) {
        movieDTO.setId(UUID.randomUUID().toString());
        movies.put(movieDTO.getId(),movieDTO);
        return movieDTO;
    }
}
