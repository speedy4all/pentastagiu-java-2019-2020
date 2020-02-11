package com.pentalog.pentastagiu.service.api;

import com.pentalog.pentastagiu.service.dto.ActorDTO;

import java.util.List;

public interface ActorService {
    List<ActorDTO> getAllActors();
    ActorDTO createActor(ActorDTO actorDTO);
    ActorDTO getActorById(String id);
}
