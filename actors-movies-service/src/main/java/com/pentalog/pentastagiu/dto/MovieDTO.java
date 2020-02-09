package com.pentalog.pentastagiu.dto;

public class MovieDTO {
    private String id;
    private String name;
    private String posterUrl;

    public MovieDTO() {
    }
    public MovieDTO(String id, String name, String posterUrl) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
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

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
