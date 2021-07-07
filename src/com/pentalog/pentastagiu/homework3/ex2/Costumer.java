package com.pentalog.pentastagiu.homework3.ex2;

public class Costumer {
    private int id;
    private String name;
    private Status status;

    public Costumer(int id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
