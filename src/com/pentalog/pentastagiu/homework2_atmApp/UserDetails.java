package com.pentalog.pentastagiu.homework2_atmApp;

public class UserDetails {
    private String username;
    private String nume;
    private String prenume;

    //constructors
    public UserDetails() {

    }

    public UserDetails(String username, String nume, String prenume) {
        this.username = username;
        this.nume = nume;
        this.prenume = prenume;
    }

    //getters and setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
