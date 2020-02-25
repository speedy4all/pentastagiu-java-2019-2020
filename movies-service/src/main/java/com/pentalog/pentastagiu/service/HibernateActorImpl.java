package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.repository.model.actors.HibernateActorRepository;
import com.pentalog.pentastagiu.service.api.HibernateActorService;
import com.pentalog.pentastagiu.service.api.MapperService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.web.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HibernateActorImpl implements HibernateActorService {
    private final HibernateActorRepository hibernateActorRepository;
    private final MapperService mapperService;

    @Autowired
    public HibernateActorImpl(HibernateActorRepository hibernateActorRepository, MapperService mapperService) {
        this.hibernateActorRepository = hibernateActorRepository;
        this.mapperService = mapperService;
    }

    @Override
    public List<ActorDTO> getAll() {
        List<Actor> actors = hibernateActorRepository.findAll();
        return mapperService.mapListActorToActorDTOList(actors);
    }

    @Override
    public ActorDTO getById(String id) {
        Actor seekActor = hibernateActorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Actor", id));
        return mapperService.mapActorToActorDTO(seekActor);
    }

    @Override
    public ActorDTO create(ActorDTO actorDTO) {
        Actor actor = mapperService.mapActorDTOToActor(actorDTO);
        actor.setId(null);
        Actor savedActor = hibernateActorRepository.save(actor);
        return mapperService.mapActorToActorDTO(savedActor);
    }

    @Override
    public void delete(String actorId) {
        ActorDTO actorDTO = getById(actorId);
        Actor actor = mapperService.mapActorDTOToActor(actorDTO);
        hibernateActorRepository.delete(actor);
    }

    @Override
    public void update(String actorId, ActorDTO actorDTO) {
        ActorDTO dbActorDTO = getById(actorId);
        updateActorDTOFields(dbActorDTO, actorDTO);
        Actor dbActor = mapperService.mapActorDTOToActor(dbActorDTO);
        hibernateActorRepository.save(dbActor);
    }

    private void updateActorDTOFields(ActorDTO dbActorDTO, ActorDTO actorDTO) {
        dbActorDTO.setName(actorDTO.getName());
        dbActorDTO.setFacebookAccountUrl(actorDTO.getFacebookAccountUrl());
        dbActorDTO.setNumberOfOscars(actorDTO.getNumberOfOscars());
    }
}
