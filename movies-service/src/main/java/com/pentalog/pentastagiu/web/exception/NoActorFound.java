package com.pentalog.pentastagiu.web.exception;

public class NoActorFound extends RuntimeException {
    private String id;

    public NoActorFound(String id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "No actor found with this id: " + id;
    }
}
