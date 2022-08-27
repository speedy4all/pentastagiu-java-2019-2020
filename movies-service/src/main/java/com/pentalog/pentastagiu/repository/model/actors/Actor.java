package com.pentalog.pentastagiu.repository.model.actors;

import com.pentalog.pentastagiu.repository.model.movie.Movie;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @NotEmpty(message = "Name must be not empty!")
    private String name;
    @NotEmpty(message = "Surname must be not empty!")
    private String surname;
    @NotEmpty(message = "PosterURL must be not null!")
    private String posterURL;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "actor_id")
    private Set<Movie> movies= new HashSet<>();

    public Set<Movie> getMovies() {
        return movies;
    }

    public Actor setMovies(Set<Movie> movies) {
        this.movies = movies;
        return this;
    }

    public Actor() {
    }

    public String getId() {
        return id;
    }

    public Actor setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Actor setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Actor setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public Actor setPosterURL(String posterURL) {
        this.posterURL = posterURL;
        return this;
    }
}
