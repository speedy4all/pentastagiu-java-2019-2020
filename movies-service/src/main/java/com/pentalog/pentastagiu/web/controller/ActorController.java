package com.pentalog.pentastagiu.web.controller;

import com.pentalog.pentastagiu.service.api.ActorService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/api/v1/actors")

public class ActorController {
    @Resource
    private ActorService actorService;
    @GetMapping
    public List<ActorDTO> getAllActors() {
        return actorService.getAllActors();
    }
    @PostMapping
    public ActorDTO createActor(@RequestBody ActorDTO actorDTO) {
        return actorService.createActor(actorDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ActorDTO> getActorById(@PathVariable String id) {
        return ResponseEntity.ok(actorService.getActorById(id));
    }
}
