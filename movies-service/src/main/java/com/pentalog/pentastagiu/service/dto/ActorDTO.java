package com.pentalog.pentastagiu.service.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ActorDTO {

    private String id;
    @NotEmpty(message = "Movie name must be provided!")
    private String name;
    @Min(value = 0, message = "Number of Oscars cannot be lower than 0!")
    @Max(value = 200, message = "Number of Oscars cannot be greater than 200!")
    @NotNull(message = "You need to specify a number!")
    private Integer numberOfOscars;
    @NotEmpty(message = "Facebook account url must not be empty!")
    private String facebookAccountUrl;

    public ActorDTO() {
    }

    public ActorDTO(String id, @NotEmpty(message = "Movie name must be provided!") String name,
                    @Min(value = 0, message = "Number of Oscars cannot be lower than 0!")
                    @Max(value = 200, message = "Number of Oscars cannot be greater than 200!")
                    @NotNull(message = "You need to specify a number!") Integer numberOfOscars,
                    @NotEmpty(message = "Facebook account url must not be empty!") String facebookAccountUrl) {
        this.id = id;
        this.name = name;
        this.numberOfOscars = numberOfOscars;
        this.facebookAccountUrl = facebookAccountUrl;
    }

    public static class ActorDTOBuilder {
        private String id;
        private String name;
        private Integer numberOfOscars;
        private String facebookAccountUrl;

        public ActorDTOBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public ActorDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ActorDTOBuilder withNumberOfOscars(Integer numberOfOscars) {
            this.numberOfOscars = numberOfOscars;
            return this;
        }

        public ActorDTOBuilder withFacebookAccountUrl(String facebookAccountUrl) {
            this.facebookAccountUrl = facebookAccountUrl;
            return this;
        }

        public ActorDTO build() {
            return new ActorDTO(id, name, numberOfOscars, facebookAccountUrl);
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

}
