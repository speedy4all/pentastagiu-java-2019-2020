package com.pentalog.pentastagiu.repository.model.movie;

import com.pentalog.pentastagiu.repository.model.actor.Actors;
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
    @NotEmpty(message = "Name can not be empty!")
    private String name;
    @NotEmpty(message = "URL can not be empty!")
    private String posterUrl;
    @Min(value = 0,message = "Rating can not be lower than 0!")
    @Max(value = 10, message = "Rating can not be higher than 10")
    @NotNull(message = "Rating can not be null!")
    private Double rating;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private  Set<Actors> actors = new HashSet<>();

    public  Set<Actors> getActors() {
        return actors;
    }

    public Movie setActors(Set<Actors> actors) {
        this.actors = actors;
        return this;
    }

    public Movie() {
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
}
