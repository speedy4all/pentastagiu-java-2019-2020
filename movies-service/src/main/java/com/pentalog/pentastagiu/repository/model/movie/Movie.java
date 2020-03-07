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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Set<Actor> actors = new HashSet<>();

    public Set<Actor> getActors() {
        return actors;
    }

    public Movie setActors(Set<Actor> actors) {
        this.actors = actors;
        return this;
    }

    public Movie() {
    }

    public String getId() {
        return id;
    }

    public Movie setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public Movie setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
        return this;
    }

    public Double getRating() {
        return rating;
    }

    public Movie setRating(Double rating) {
        this.rating = rating;
        return this;
    }
}
