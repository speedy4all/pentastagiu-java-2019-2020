package com.pentalog.pentastagiu.service.dto;

import com.pentalog.pentastagiu.repository.model.movie.Movie;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ActorDTO {

    private String id;
    @NotEmpty(message = "Actor name must be provided!")
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

   @NotNull(message = "Movie list must be provided!")
    private Set<Movie> movies = new HashSet<>();
    ActorDTO(){}

    public ActorDTO(String id, @NotEmpty(message = "Actor name must be provided!") String name, @Min(value = 1, message = "Age cannot be lower than 1!") @Max(value = 100, message = "Age cannot be greater than 100!") @NotNull(message = "Actor age must be provided!") int age, @NotEmpty(message = "Actor birth place must be provided!") String birthPlace, @Min(value = 0, message = "Awards cannot be lower than 0!") @NotNull(message = "Actor awards must be provided!") int awards, @NotNull(message = "Movie list must be provided!")Set<Movie> movies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthPlace = birthPlace;
        this.awards = awards;
        this.movies = movies;
    }



    public Set<Movie> getMovies() { return movies; }

    public ActorDTO setMovies(Set<Movie> movies) {
        this.movies = movies;
        return this;
    }

    public String getId() { return id; }

    public ActorDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() { return name; }

    public ActorDTO setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() { return age; }

    public ActorDTO setAge(int age) {
        this.age = age;
        return this;
    }

    public String getBirthPlace() { return birthPlace; }

    public ActorDTO setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public int getAwards() { return awards; }

    public ActorDTO setAwards(int awards) {
        this.awards = awards;
        return this;
    }




}
