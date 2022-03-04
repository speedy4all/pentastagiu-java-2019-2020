package com.pentalog.pentastagiu.homework2.registration;

public class RegistrationApp {
    public static void main(String[] args){
        User user1 = new User("George", "george_user@app.com");
        User user2 = new User("Jane", "jane_user@app.com");
        User user3 = new User("Mike", "mike_user@app.com");

        Message testMessage1 = new Message("Here is user 1: " + user1.getName(), user1.getEmail());
        Message testMessage2 = new Message("Here is user 2: " + user2.getName(), user2.getEmail());
        Message testMessage3 = new Message("Here is user 3: " + user3.getName(), user3.getEmail());

        Board board = new Board();

        board.writeMessage(testMessage1.getDescription());
        board.writeMessage(testMessage2.getDescription());
        board.writeMessage(testMessage3.getDescription());
        System.out.println("Users' messages" +board.getBoardMessage());

    }
}
