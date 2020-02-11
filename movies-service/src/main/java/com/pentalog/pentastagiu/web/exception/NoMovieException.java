package com.pentalog.pentastagiu.web.exception;

public class NoMovieException extends RuntimeException {

    private String id;

    public NoMovieException( String id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "No movie found with id: " + id;
    }
}
