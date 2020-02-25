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
    @Min(value = 0, message = "Number of Oscars cannot be lower than 0!")
    @Max(value = 200, message = "Number of Oscars cannot be greater than 200!")
    @NotNull(message = "You need to specify a number!")
    private Integer numberOfOscars;
    @NotEmpty(message = "Facebook account url must not be empty!")
    private String facebookAccountUrl;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "actors", cascade = CascadeType.ALL)
    private Set<Movie> movies = new HashSet<>();

    public Actor() {
    }

    public Actor(String id, @NotEmpty(message = "Movie name must be provided!") String name,
                 @Min(value = 0, message = "Number of Oscars cannot be lower than 0!")
                 @Max(value = 200, message = "Number of Oscars cannot be greater than 200!")
                 @NotNull(message = "You need to specify a number!") Integer numberOfOscars,
                 @NotEmpty(message = "Facebook account url must not be empty!") String facebookAccountUrl) {
        this.id = id;
        this.name = name;
        this.numberOfOscars = numberOfOscars;
        this.facebookAccountUrl = facebookAccountUrl;
    }

    public static class ActorBuilder {
        private String id;
        private String name;
        private Integer numberOfOscars;
        private String facebookAccountUrl;

        public ActorBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public ActorBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ActorBuilder withNumberOfOscars(Integer numberOfOscars) {
            this.numberOfOscars = numberOfOscars;
            return this;
        }

        public ActorBuilder withFacebookAccountUrl(String facebookAccountUrl) {
            this.facebookAccountUrl = facebookAccountUrl;
            return this;
        }

        public Actor build() {
            return new Actor(id, name, numberOfOscars, facebookAccountUrl);
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

    public Integer getNumberOfOscars() {
        return numberOfOscars;
    }

    public void setNumberOfOscars(Integer numberOfOscars) {
        this.numberOfOscars = numberOfOscars;
    }

    public String getFacebookAccountUrl() {
        return facebookAccountUrl;
    }

    public void setFacebookAccountUrl(String facebookAccountUrl) {
        this.facebookAccountUrl = facebookAccountUrl;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
