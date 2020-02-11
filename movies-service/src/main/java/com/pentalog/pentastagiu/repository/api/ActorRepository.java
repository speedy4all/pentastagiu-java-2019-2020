package com.pentalog.pentastagiu.repository.api;

import com.pentalog.pentastagiu.service.dto.ActorDTO;

import java.util.List;

public interface ActorRepository {
    List<ActorDTO> getAllActors();
    ActorDTO createActor(ActorDTO actorDTO);
    ActorDTO getActorById(String id);
}
