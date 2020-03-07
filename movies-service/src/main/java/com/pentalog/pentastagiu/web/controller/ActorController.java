package com.pentalog.pentastagiu.web.controller;
import com.pentalog.pentastagiu.repository.data.Actors;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/actors")
public class ActorController {
    @GetMapping
    public List<ActorDTO> getAllActors(){
        return Actors.getAll();
    }

    @GetMapping("/{id}")
    public ActorDTO getById(@PathVariable String id){
        return Actors.getById(id);
    }

    @PostMapping
    public ActorDTO createActor(@RequestBody ActorDTO actorDTO){
        return Actors.createActor(actorDTO);
    }
}
