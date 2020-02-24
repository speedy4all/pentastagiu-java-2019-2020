package com.pentalog.pentastagiu.service.api;



import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.service.dto.ActorDTO;

import java.util.List;

public interface HibernateActorService {
    List<Actor> getAll();

    Actor getById(String id);

    Actor create(ActorDTO actorDTO);

    void delete(String actorID);

    void update(String actorId, ActorDTO actorDTO);
}
