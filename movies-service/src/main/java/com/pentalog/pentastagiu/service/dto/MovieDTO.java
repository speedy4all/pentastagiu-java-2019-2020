package com.pentalog.pentastagiu.service.dto;

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
    private Set<ActorDTO> actors = new HashSet<>();

    public MovieDTO() {
    }

    public MovieDTO(String id, String name, String posterUrl, Double rating) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
    }

    public MovieDTO(String id, @NotEmpty(message = "Movie name must be provided!") String name,
                    @NotEmpty(message = "Poster url must not be empty!") String posterUrl,
                    @Min(value = 0, message = "Rating cannot be lower than 0!")
                    @Max(value = 10, message = "Rating cannot be greater than 10!")
                    @NotNull(message = "You need to specify a rating!") Double rating, Set<ActorDTO> actors) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
        this.actors = actors;
    }

    public static class MovieDTOBuilder {
        private String id;
        private String name;
        private String posterUrl;
        private Double rating;
        private Set<ActorDTO> actors;

        public MovieDTOBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public MovieDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MovieDTOBuilder withPosterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
            return this;
        }

        public MovieDTOBuilder withRating(Double rating) {
            this.rating = rating;
            return this;
        }

        public MovieDTOBuilder withActors(Set<ActorDTO> actors) {
            this.actors = actors;
            return this;
        }

        public MovieDTO build() {
            return new MovieDTO(id, name, posterUrl, rating, actors);
        }

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

    public Set<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDTO> actors) {
        this.actors = actors;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
