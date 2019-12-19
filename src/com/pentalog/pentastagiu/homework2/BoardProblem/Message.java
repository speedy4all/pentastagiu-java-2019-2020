package com.pentalog.pentastagiu.homework2.BoardProblem;

public class Message {
    private String authorEmail;
    private String description;

    public Message(String authorEmail, String description) {
        this.authorEmail = authorEmail;
        this.description = description;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "authorEmail='" + authorEmail + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
