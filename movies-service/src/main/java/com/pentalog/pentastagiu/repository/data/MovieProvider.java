package com.pentalog.pentastagiu.repository.data;

import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MovieProvider {

    private static HashMap<String, MovieDTO> movies = new HashMap<>();
    private static final String posterUrl = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg";

    static {
        MovieDTO firstMovie = new MovieDTO(UUID.randomUUID().toString(), "The Shawshank Redemption", posterUrl, 10.0);
        MovieDTO secondMovie = new MovieDTO(UUID.randomUUID().toString(), "The Godfather", posterUrl, 8.5);
        MovieDTO thirdMovie = new MovieDTO(UUID.randomUUID().toString(), "Lord of the Rings", posterUrl, 10.0);
        MovieDTO forthMovie = new MovieDTO(UUID.randomUUID().toString(), "Gifted", posterUrl, 9.0);
        MovieDTO fifthMovie = new MovieDTO(UUID.randomUUID().toString(), "The Last Samurai", posterUrl, 10.0);


        movies.put(firstMovie.getId(), firstMovie);
        movies.put(secondMovie.getId(), secondMovie);
        movies.put(thirdMovie.getId(), thirdMovie);
        movies.put(forthMovie.getId(), forthMovie);
        movies.put(fifthMovie.getId(), fifthMovie);
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

    public static MovieDTO save(MovieDTO movieDTO) {
        movieDTO.setId(UUID.randomUUID().toString());
        movies.put(movieDTO.getId(), movieDTO);
        return movieDTO;
    }

    public static void delete(String movieId) {
        movies.remove(movieId);
    }

    public static void update(String movieId, MovieDTO movieDTO) {
        movieDTO.setId(movieId);
        movies.put(movieId, movieDTO);
    }

    public static List<MovieDTO> findAllByNameStartingWith(String startsWith) {
       return  movies.values().stream()
                .filter(it -> it.getName().toLowerCase().startsWith(startsWith))
                .collect(Collectors.toList());
    }
}
