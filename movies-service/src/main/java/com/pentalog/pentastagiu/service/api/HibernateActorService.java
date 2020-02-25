package com.pentalog.pentastagiu.service.api;

import com.pentalog.pentastagiu.service.dto.ActorDTO;

import java.util.List;

public interface HibernateActorService {
    List<ActorDTO> getAll();

    ActorDTO getById(String id);

    ActorDTO create(ActorDTO actorDTO);

    void delete(String actorId);

    void update(String actorId, ActorDTO actorDTO);
}
