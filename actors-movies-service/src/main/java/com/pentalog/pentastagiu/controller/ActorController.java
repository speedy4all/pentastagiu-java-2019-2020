package com.pentalog.pentastagiu.controller;

import com.pentalog.pentastagiu.data.ActorProvider;
import com.pentalog.pentastagiu.dto.ActorDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/actors")
public class ActorController {
    @GetMapping
    public List<ActorDTO> getAll() {
        return ActorProvider.getAll();
    }

    @GetMapping("/{id}")
    public ActorDTO getById(@PathVariable String id) {
        return ActorProvider.getById(id);
    }

    @PostMapping
    public ActorDTO createMovie(@RequestBody ActorDTO actorDTO) {
        return ActorProvider.create(actorDTO);
    }
}
