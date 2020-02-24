package com.pentalog.pentastagiu.repository.model.actors;

import com.pentalog.pentastagiu.repository.model.movie.Movie;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @NotEmpty(message = "Movie name must be provided!")
    private String name;
    @Min(value = 1, message = "Age cannot be lower than 1!")
    @Max(value = 100, message = "Age cannot be greater than 100!")
    @NotNull(message = "Actor age must be provided!")
    private int age;
    @NotEmpty(message = "Actor birth place must be provided!")
    private String birthPlace;
    @Min(value = 0, message = "Awards cannot be lower than 0!")
    @NotNull(message = "Actor awards must be provided!")
    private  int awards;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "actors")
    private Set<Movie> movies = new HashSet<>();

    public Actor() {
    }

    public Set<Movie> getMovies() { return movies; }

    public Actor setMovies(Set<Movie> movies) {
        this.movies = movies;
        return this;
    }

    public int getAge() { return age; }

    public Actor setAge(int age) {
        this.age = age;
        return this;
    }

    public String getBirthPlace() { return birthPlace; }

    public Actor setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public int getAwards() { return awards; }

    public Actor setAwards(int awards) {
        this.awards = awards;
        return this;
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
}
