package com.pentalog.pentastagiu.service.dto;

import javax.validation.constraints.NotEmpty;

public class ActorDTO {

        private String id;
        @NotEmpty(message = "Name can not be empty!")
        private String name;
        @NotEmpty(message = "Surname can not be empty!")
        private String surname;
        @NotEmpty(message = "PosterURl can not be empty!")
        private String posterUrl;

        public ActorDTO() {
        }

    public ActorDTO(String id, @NotEmpty(message = "Name can not be empty!") String name, @NotEmpty(message = "Surname can not be empty!") String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public ActorDTO(String id, String name, String surname, String posterUrl) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.posterUrl = posterUrl;
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

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPosterUrl() {
            return posterUrl;
        }

        public void setPosterUrl(String posterUrl) {
            this.posterUrl = posterUrl;
        }
    }

