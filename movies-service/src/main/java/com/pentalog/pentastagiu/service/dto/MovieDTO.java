package com.pentalog.pentastagiu.service.dto;

import com.pentalog.pentastagiu.repository.model.actor.Actors;
import com.pentalog.pentastagiu.repository.model.movie.Movie;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class MovieDTO {
    private String id;

    @NotEmpty(message = "Name can not be empty!")
    private String name;

    @NotEmpty(message = "URL can not be empty!")
    private String posterUrl;

    @Min(value = 0,message = "Rating can not be lower than 0!")
    @Max(value = 10, message = "Rating can not be higher than 10")
    @NotNull(message = "Rating can not be null!")
    private Double rating;

    private List<ActorDTO> actors = new ArrayList<>();

    public MovieDTO() {
    }

    public MovieDTO(String id, String name, String posterUrl) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
    }

    public MovieDTO(String id, @NotEmpty(message = "Name can not be empty!") String name, @NotEmpty(message = "URL can not be empty!") String posterUrl, @Min(value = 0, message = "Rating can not be lower than 0!") @Max(value = 10, message = "Rating can not be higher than 10") @NotNull(message = "Rating can not be null!") Double rating) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
    }

    public MovieDTO(String id, @NotEmpty(message = "Name can not be empty!") String name, @NotEmpty(message = "URL can not be empty!") String posterUrl, @Min(value = 0, message = "Rating can not be lower than 0!") @Max(value = 10, message = "Rating can not be higher than 10") @NotNull(message = "Rating can not be null!") Double rating, List<ActorDTO> actors) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
        this.actors = actors;
    }

    public Double getRating() {
        return rating;
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

    public List<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(List<ActorDTO> actors) {
        this.actors = actors;
    }
}
