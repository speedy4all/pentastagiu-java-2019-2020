package com.pentalog.pentastagiu.controller;

import com.pentalog.pentastagiu.data.ActorProvider;
import com.pentalog.pentastagiu.dto.ActorDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/actors")
public class ActorController {
    @GetMapping
    public List<ActorDTO> getAllActors() {
        return ActorProvider.getAllActors();
    }

    @GetMapping("/{id}")
    public ActorDTO getActorById(@PathVariable String id){
        return ActorProvider.getActorById(id);
    }

    @PostMapping
    public ActorDTO addActor(@RequestBody ActorDTO actorDTO){
        return ActorProvider.addActor(actorDTO);
    }
}

