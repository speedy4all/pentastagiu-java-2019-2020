package com.pentalog.pentastagiu.service.api;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.movie.Movie;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.service.dto.MovieDTO;

import java.util.List;

public interface MapperService {
    Actor mapActorDTOToActor(ActorDTO actorDTO);

    ActorDTO mapActorToActorDTO(Actor actor);

    Movie mapMovieDTOToMovie(MovieDTO movieDTO);

    MovieDTO mapMovieToMovieDTO(Movie movie);

    List<ActorDTO> mapListActorToActorDTOList(List<Actor> actors);

    List<MovieDTO> mapListMovieToMovieDTOList(List<Movie> movies);

}
