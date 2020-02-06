package com.pentalog.pentastagiu.controller;

import com.pentalog.pentastagiu.data.ActorProvider;
import com.pentalog.pentastagiu.data.MovieProvider;
import com.pentalog.pentastagiu.dto.ActorDTO;
import com.pentalog.pentastagiu.dto.MovieDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/actors")
public class ActorController {

    @GetMapping
    public List<ActorDTO> getAll() {
        return ActorProvider.getAllActors();
    }

    @GetMapping("/{id}")
    public ActorDTO getById(@PathVariable String id) {
        return ActorProvider.getActorById(id);
    }

    @PostMapping
    public ActorDTO create(@RequestBody ActorDTO actorDTO) {
        return ActorProvider.create(actorDTO);
    }
}
