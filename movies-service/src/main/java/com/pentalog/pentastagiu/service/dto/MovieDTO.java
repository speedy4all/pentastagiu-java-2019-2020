package com.pentalog.pentastagiu.service.dto;

import com.pentalog.pentastagiu.repository.model.actors.Actor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class MovieDTO {
    private String id;
    @NotEmpty(message = "Movie name must be provided!")
    private String name;
    @NotEmpty(message = "Poster url must not be empty!")
    private String posterUrl;
    @Min(value = 0, message = "Rating cannot be lower than 0!")
    @Max(value = 10, message = "Rating cannot be greater than 10!")
    @NotNull(message = "You need to specify a rating!")
    private Double rating;
    @NotNull(message = "Provide a list of actors!")
    private Set<Actor> actors = new HashSet<>();

    public MovieDTO() {
    }

    public MovieDTO(String id, String name, String posterUrl, Set<Actor> actors ) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.actors = actors;
    }

    public MovieDTO(String id, @NotEmpty(message = "Movie name must be provided!") String name, @NotEmpty(message = "Poster url must not be empty!") String posterUrl, @Min(value = 0, message = "Rating cannot be lower than 0!") @Max(value = 10, message = "Rating cannot be greater than 10!") @NotNull(message = "You need to specify a rating!") Double rating, @NotNull(message = "Provide a list of actors!") Set<Actor> actors) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
        this.actors = actors;
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

    public Double getRating() {
        return rating;
    }

    public MovieDTO setRating(Double rating) {
        this.rating = rating;
        return this;
    }

    public Set<Actor> getActors() { return actors; }

    public MovieDTO setActors(Set<Actor> actors) {
        this.actors = actors;
        return this;
    }
}
