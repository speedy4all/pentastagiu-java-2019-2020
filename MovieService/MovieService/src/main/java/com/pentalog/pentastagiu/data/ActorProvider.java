package com.pentalog.pentastagiu.data;

import com.pentalog.pentastagiu.dto.ActorDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class ActorProvider {
    private static HashMap<String, ActorDTO> actors = new HashMap<>();

    static{
        ActorDTO a1 = new ActorDTO(UUID.randomUUID().toString(),"Dean-Charles","Chapman","https://www.imdb.com/name/nm2835616/mediaviewer/rm2635001856");
        ActorDTO a2 = new ActorDTO(UUID.randomUUID().toString(),"Adam","Sandler","https://www.imdb.com/name/nm0001191/mediaviewer/rm1292077056");
        ActorDTO a3 = new ActorDTO(UUID.randomUUID().toString()," Joaquin","Phoenix","https://www.imdb.com/name/nm0001618/mediaviewer/rm521242113");

        actors.put(a1.getId(),a1);
        actors.put(a2.getId(),a2);
        actors.put(a3.getId(),a3);
    }

   public static List<ActorDTO> getAllActors() {
        return new ArrayList<>(actors.values());
    }

    public static ActorDTO getActorById (String id){
        return actors.get(id);
    }

    public static ActorDTO addActor(ActorDTO actorDTO){
        actorDTO.setId(UUID.randomUUID().toString());
        actors.put(actorDTO.getId(),actorDTO);
        return actorDTO;
    }
}
