package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.api.MapperService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.service.dto.MovieDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MapperServiceImpl implements MapperService {
    @Override
    public Actor mapActorDTOToActor(ActorDTO actorDTO) {
        return new Actor.ActorBuilder()
                .withId(actorDTO.getId())
                .withName(actorDTO.getName())
                .withFacebookAccountUrl(actorDTO.getFacebookAccountUrl())
                .withNumberOfOscars(actorDTO.getNumberOfOscars())
                .build();
    }

    @Override
    public ActorDTO mapActorToActorDTO(Actor actor) {
        return new ActorDTO.ActorDTOBuilder()
                .withId(actor.getId())
                .withName(actor.getName())
                .withFacebookAccountUrl(actor.getFacebookAccountUrl())
                .withNumberOfOscars(actor.getNumberOfOscars())
                .build();
    }

    @Override
    public List<ActorDTO> mapListActorToActorDTOList(List<Actor> actors) {
        return actors.stream()
                .map(this::mapActorToActorDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Movie mapMovieDTOToMovie(MovieDTO movieDTO) {
        return new Movie.MovieBuilder()
                .withId(movieDTO.getId())
                .withName(movieDTO.getName())
                .withPosterUrl(movieDTO.getPosterUrl())
                .withRating(movieDTO.getRating())
                .withActors(mapSetActorDTOToSetActor(movieDTO))
                .build();
    }

    @Override
    public MovieDTO mapMovieToMovieDTO(Movie movie) {
        return new MovieDTO.MovieDTOBuilder()
                .withId(movie.getId())
                .withName(movie.getName())
                .withPosterUrl(movie.getPosterUrl())
                .withRating(movie.getRating())
                .withActors(mapSetActorToSetActorDTO(movie))
                .build();
    }


    @Override
    public List<MovieDTO> mapListMovieToMovieDTOList(List<Movie> movies) {
        return movies.stream()
                .map(this::mapMovieToMovieDTO)
                .collect(Collectors.toList());
    }

    private Set<ActorDTO> mapSetActorToSetActorDTO(Movie movie) {
        return movie.getActors()
                .stream()
                .map(this::mapActorToActorDTO)
                .collect(Collectors.toSet());
    }

    private Set<Actor> mapSetActorDTOToSetActor(MovieDTO movieDTO) {
        return movieDTO.getActors()
                .stream()
                .map(this::mapActorDTOToActor)
                .collect(Collectors.toSet());
    }

}
