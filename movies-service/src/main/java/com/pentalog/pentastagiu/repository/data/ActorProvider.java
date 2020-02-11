package com.pentalog.pentastagiu.repository.data;

import com.pentalog.pentastagiu.service.dto.ActorDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class ActorProvider {
    private static HashMap<String, ActorDTO> actors = new HashMap<>();
    static {
        ActorDTO oneActor = new ActorDTO(UUID.randomUUID().toString(),"CHRIS", "EVANS","https://images.fandango.com/ImageRenderer/300/0/redesign/static/img/default_poster.png/0/images/masterrepository/performer%20images/p302167/chrisevans12.jpg");
        ActorDTO twoActor = new ActorDTO(UUID.randomUUID().toString(),"ROBERT","DOWNEY","https://images.fandango.com/ImageRenderer/300/0/redesign/static/img/default_poster.png/0/images/masterrepository/performer%20images/p19966/robert162574544.jpg");
        ActorDTO threeActor = new ActorDTO(UUID.randomUUID().toString(),"JENNIFER","LAWRENCE","https://images.fandango.com/ImageRenderer/300/0/redesign/static/img/default_poster.png/0/images/masterrepository/performer%20images/p562566/lawrencejennifer.jpg");
        ActorDTO fourActor =new ActorDTO(UUID.randomUUID().toString(),"CHANNING", "TATUM","https://images.fandango.com/ImageRenderer/300/0/redesign/static/img/default_poster.png/0/images/masterrepository/performer%20images/p419915/channing162613136.jpg");
        actors.put(oneActor.getId(),oneActor);
        actors.put(twoActor.getId(),twoActor);
        actors.put(threeActor.getId(),threeActor);
        actors.put(fourActor.getId(),fourActor);
    }

    public static List<ActorDTO> getAllActors (){
        return new ArrayList<>(actors.values());
    }

    public static ActorDTO getActorById(String id){
        return actors.get(id);
    }

    public static ActorDTO create (ActorDTO actorDTO){
        actorDTO.setId(UUID.randomUUID().toString());
        actors.put(actorDTO.getId(),actorDTO);
        return actorDTO;
    }
}
