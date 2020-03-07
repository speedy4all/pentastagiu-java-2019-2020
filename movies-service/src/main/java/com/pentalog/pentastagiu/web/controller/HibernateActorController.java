package com.pentalog.pentastagiu.web.controller;


import com.pentalog.pentastagiu.repository.model.actors.Actor;
import com.pentalog.pentastagiu.service.api.HibernateActorService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hibernate/actors")
public class HibernateActorController {
    private final HibernateActorService hibernateActorService;

    public HibernateActorController(HibernateActorService hibernateActorService) {
        this.hibernateActorService = hibernateActorService;
    }

    @GetMapping
    public List<Actor> getAll() {
        return hibernateActorService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Actor> getById(@NotEmpty @PathVariable String id){
        return ResponseEntity.ok(hibernateActorService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Actor create(@Valid @RequestBody ActorDTO actorDTO){
        return hibernateActorService.create(actorDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@NotEmpty @PathVariable ("id") String actorId){
        hibernateActorService.delete(actorId);
    }

    @PutMapping("/{id}")
    public void update(@NotEmpty @PathVariable ("id") String actorId, @Valid @RequestBody ActorDTO actorDTO){
        hibernateActorService.update(actorId, actorDTO);
    }
}
