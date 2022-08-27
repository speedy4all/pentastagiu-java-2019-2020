package com.pentalog.pentastagiu.service.dto;

public class ActorDTO {
    private String id;
    private String name;
    private String surname;
    private String posterURL;

    public ActorDTO(){

    }
    public ActorDTO(String id, String name, String surname, String posterURL){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.posterURL = posterURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }
}
