package com.pentalog.pentastagiu.dto;

public class ActorDTO {
    private String id;
    private String name;
    private String surName;
    private String imdbUrl;

    public ActorDTO() {
    }

    public ActorDTO(String id, String name, String surName, String imdbUrl) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.imdbUrl = imdbUrl;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getImdbUrl() {
        return imdbUrl;
    }

    public void setImdbUrl(String imdbUrl) {
        this.imdbUrl = imdbUrl;
    }
}
