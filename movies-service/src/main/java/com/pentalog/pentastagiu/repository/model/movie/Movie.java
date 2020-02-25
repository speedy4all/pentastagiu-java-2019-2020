package com.pentalog.pentastagiu.repository.model.movie;

import com.pentalog.pentastagiu.repository.model.actors.Actor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @NotEmpty(message = "Movie name must be provided!")
    private String name;
    @NotEmpty(message = "Poster url must not be empty!")
    private String posterUrl;
    @Min(value = 0, message = "Rating cannot be lower than 0!")
    @Max(value = 10, message = "Rating cannot be greater than 10!")
    @NotNull(message = "You need to specify a rating!")
    private Double rating;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_actor", catalog = "moviesdb", joinColumns = {
            @JoinColumn(name = "movie_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "actor_id",
                    nullable = false, updatable = false)})
    private Set<Actor> actors = new HashSet<>();

    public Movie() {
    }

    public Movie(String id, @NotEmpty(message = "Movie name must be provided!") String name,
                 @NotEmpty(message = "Poster url must not be empty!") String posterUrl,
                 @Min(value = 0, message = "Rating cannot be lower than 0!")
                 @Max(value = 10, message = "Rating cannot be greater than 10!")
                 @NotNull(message = "You need to specify a rating!") Double rating, Set<Actor> actors) {
        this.id = id;
        this.name = name;
        this.posterUrl = posterUrl;
        this.rating = rating;
        this.actors = actors;
    }

    public static class MovieBuilder {
        private String id;
        private String name;
        private String posterUrl;
        private Double rating;
        private Set<Actor> actors;

        public MovieBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public MovieBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MovieBuilder withPosterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
            return this;
        }

        public MovieBuilder withRating(Double rating) {
            this.rating = rating;
            return this;
        }

        public MovieBuilder withActors(Set<Actor> actors) {
            this.actors = actors;
            return this;
        }

        public Movie build() {
            return new Movie(id, name, posterUrl, rating, actors);
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

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }


}
