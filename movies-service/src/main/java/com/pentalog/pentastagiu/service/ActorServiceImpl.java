package com.pentalog.pentastagiu.service;

import com.pentalog.pentastagiu.repository.api.ActorRepository;
import com.pentalog.pentastagiu.service.api.ActorService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import com.pentalog.pentastagiu.web.exception.NoActorFound;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {
    @Resource
    private ActorRepository actorRepository;

    @Override
    public List<ActorDTO> getAllActors() {
        return actorRepository.getAllActors();
    }

    @Override
    public ActorDTO createActor(ActorDTO actorDTO) {
        return actorRepository.createActor(actorDTO);
    }

    @Override
    public ActorDTO getActorById(String id) {
        ActorDTO actorDto = actorRepository.getActorById(id);
        if (actorDto==null){
            throw new NoActorFound(id);
        }
        return actorDto;
    }
}
