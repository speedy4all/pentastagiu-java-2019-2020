package com.pentalog.pentastagiu.service.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    //@NotEmpty(message = "You need to specify one or more actors")
    private ActorDTO actorDTO;


    public MovieDTO() {
    }

    public MovieDTO(String id, String name, String posterUrl) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
    }

    public MovieDTO(String id, @NotEmpty(message = "Movie name must be provided!") String name, @NotEmpty(message = "Poster url must not be empty!") String posterUrl, @Min(value = 0, message = "Rating cannot be lower than 0!") @Max(value = 10, message = "Rating cannot be greater than 10!") @NotNull(message = "You need to specify a rating!") Double rating) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
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
}
