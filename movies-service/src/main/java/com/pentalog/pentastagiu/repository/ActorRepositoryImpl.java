package com.pentalog.pentastagiu.repository;

import com.pentalog.pentastagiu.repository.api.ActorRepository;
import com.pentalog.pentastagiu.repository.data.ActorProvider;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ActorRepositoryImpl implements ActorRepository {
    @Override
    public List<ActorDTO> getAllActors() {
        return ActorProvider.getAllActors();
    }

    @Override
    public ActorDTO createActor(ActorDTO actorDTO) {
        return ActorProvider.create(actorDTO);
    }

    @Override
    public ActorDTO getActorById(String id) {
        return ActorProvider.getActorById(id);
    }
}
