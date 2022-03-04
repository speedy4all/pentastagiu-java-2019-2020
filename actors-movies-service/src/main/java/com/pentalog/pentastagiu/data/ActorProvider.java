package com.pentalog.pentastagiu.data;

import com.pentalog.pentastagiu.dto.ActorDTO;

import java.util.*;

public class ActorProvider {
    private static HashMap<String, ActorDTO> actors = new HashMap<>();
    static {
        ActorDTO firstActor = new ActorDTO(UUID.randomUUID().toString(), "Robert" ,"De Niro", "https://m.media-amazon.com/images/M/MV5BMjAwNDU3MzcyOV5BMl5BanBnXkFtZTcwMjc0MTIxMw@@._V1_.jpg");
        ActorDTO secondActor = new ActorDTO(UUID.randomUUID().toString(), "Joaquin", "Phoenix", "https://m.media-amazon.com/images/M/MV5BZGMyY2Q4NTEtMWVkZS00NzcwLTkzNmQtYzBlMWZhZGNhMDhkXkEyXkFqcGdeQXVyNjk1MjYyNTA@._V1_.jpg");
        actors.put(firstActor.getId(), firstActor);
        actors.put(secondActor.getId(), secondActor);
    }

    public static List<ActorDTO> getAllActors(){
       return new ArrayList<>(actors.values());
    }

    public static ActorDTO getActorById(String id){
        return actors.get(id);
    }

    public static ActorDTO create(ActorDTO actorDTO){
        Objects.requireNonNull(actorDTO, "Actor object can't be null");
        actorDTO.setId(UUID.randomUUID().toString());
        actors.put(actorDTO.getId(), actorDTO);

        return  actorDTO;

    }

}
