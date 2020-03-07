package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.actors.HibernateActorRepository;
import com.pentalog.pentastagiu.service.api.HibernateActorService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.web.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HibernateActorServiceImpl implements HibernateActorService {

    private final HibernateActorRepository hibernateActorRepository;

    public HibernateActorServiceImpl(HibernateActorRepository hibernateActorRepository) {
        this.hibernateActorRepository = hibernateActorRepository;
    }

    @Override
    public List<Actor> getAll() {
        return hibernateActorRepository.findAll();
    }

    @Override
    public Actor getById(String id) {
        return hibernateActorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Actor", id));
    }

    @Override
    public Actor create(ActorDTO actorDTO) {
        Actor actor = new Actor();
        actor
                .setName(actorDTO.getName())
                .setSurname(actorDTO.getSurname())
                .setPosterURL(actorDTO.getPosterURL());
        Actor saveActor = hibernateActorRepository.save(actor);
        return saveActor;
    }

    @Override
    public void delete(String actorId) {
        Actor actor = getById(actorId);
        hibernateActorRepository.delete(actor);
    }

    @Override
    public Actor update(String actorId, ActorDTO actorDTO) {
        Actor actor = getById(actorId);
        actor
                .setName(actorDTO.getName())
                .setSurname(actorDTO.getSurname())
                .setPosterURL(actorDTO.getPosterURL());
        Actor updateActor = hibernateActorRepository.save(actor);
        return updateActor;

    }

}
