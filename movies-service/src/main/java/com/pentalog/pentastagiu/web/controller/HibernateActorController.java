package com.pentalog.pentastagiu.web.controller;


import com.pentalog.pentastagiu.service.api.HibernateActorService;
import com.pentalog.pentastagiu.service.dto.ActorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hibernate/actors")
public class HibernateActorController {
    private final HibernateActorService actorService;

    @Autowired
    public HibernateActorController(HibernateActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<ActorDTO> getAll() {
        return actorService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActorDTO> getById(@NotEmpty @PathVariable String id) {
        return ResponseEntity.ok(actorService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ActorDTO create(@Valid @RequestBody ActorDTO actorDTO) {
        return actorService.create(actorDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@NotEmpty @PathVariable("id") String actorId) {
        actorService.delete(actorId);
    }

    @PutMapping("/{id}")
    public void update(@NotEmpty @PathVariable("id") String actorId, @Valid @RequestBody ActorDTO actorDTO) {
        actorService.update(actorId, actorDTO);
    }
}
