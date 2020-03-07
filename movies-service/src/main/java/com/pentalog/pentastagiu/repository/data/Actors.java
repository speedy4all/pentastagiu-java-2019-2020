package com.pentalog.pentastagiu.repository.data;
import com.pentalog.pentastagiu.service.dto.ActorDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Actors {
    private static HashMap<String, ActorDTO> actors = new HashMap<>();
    static {
        ActorDTO firstActor = new ActorDTO(UUID.randomUUID().toString(), "Tim", "Robbins", "https://m.media-amazon.com/images/M/MV5BMTI1OTYxNzAxOF5BMl5BanBnXkFtZTYwNTE5ODI4._V1_.jpg");
        ActorDTO secondActor = new ActorDTO(UUID.randomUUID().toString(), "Marlon", "Brando", "https://m.media-amazon.com/images/M/MV5BMTg3MDYyMDE5OF5BMl5BanBnXkFtZTcwNjgyNTEzNA@@._V1_.jpg");
        actors.put(firstActor.getId(), firstActor);
        actors.put(secondActor.getId(), secondActor);
    }

    public static List<ActorDTO> getAll(){
        return new ArrayList<>(actors.values());
    }

    public static ActorDTO getById(String id){
        return actors.get(id);
    }

    public static ActorDTO createActor(ActorDTO actorDTO){
        actorDTO.setId(UUID.randomUUID().toString());
        actors.put(actorDTO.getId(), actorDTO);
        return actorDTO;
    }

}
