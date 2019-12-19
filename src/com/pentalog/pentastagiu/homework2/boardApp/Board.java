package com.pentalog.pentastagiu.homework2.boardApp;

public class Board{
    private Users[] user = new Users[3];
    private Message[] messages = new Message[3];
    private String[] names = {"Andrei", "Mihai", "Radu"};
    private static String message = "";

    public void setBoard(){
        for (int i = 0; i < names.length ; i++) {
            user[i] = new Users(names[i], names[i] + "@yahoo.com");
            messages[i] = new Message(names[i], " test " + i);
        }
    }

    public void setMessage(){
        for (int i = 0; i < names.length; i++) {
            Board.message += "\n" + user[i].postMessage(messages[i]);
        }
    }

    public static String showMessages(){
        return Board.message;
    }


}
