package com.pentalog.pentastagiu.data;

import com.pentalog.pentastagiu.dto.ActorDTO;
import com.pentalog.pentastagiu.dto.MovieDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class ActorProvider {

    private static HashMap<String, ActorDTO> actors = new HashMap<>();

    static {
        ActorDTO firstActor = new ActorDTO(UUID.randomUUID().toString(), "Joaquin", "Phoenix", "https://www.imdb.com/name/nm0001618/mediaviewer/rm521242113");
        ActorDTO secondActor = new ActorDTO(UUID.randomUUID().toString(), "Leonardo", "DiCaprio", "https://www.imdb.com/name/nm0000138/mediaviewer/rm2260951808");
        ActorDTO thirdActor = new ActorDTO(UUID.randomUUID().toString(), "Margot", "Robbie", "https://www.imdb.com/name/nm3053338/mediaviewer/rm1008443648");
        ActorDTO fourthActor = new ActorDTO(UUID.randomUUID().toString(), "Brad", "Pitt", "https://www.imdb.com/name/nm0000093/mediaviewer/rm864335360");

        actors.put(firstActor.getId(), firstActor);
        actors.put(secondActor.getId(), secondActor);
        actors.put(thirdActor.getId(), thirdActor);
        actors.put(fourthActor.getId(), fourthActor);
    }

    public static List<ActorDTO> getAll() {
        return new ArrayList<>(actors.values());
    }

    public static ActorDTO getById(String id) {
        return actors.get(id);
    }

    public static ActorDTO create(ActorDTO actorDTO) {
        actorDTO.setId(UUID.randomUUID().toString());
        actors.put(actorDTO.getId(), actorDTO);

        return actorDTO;
    }
}
