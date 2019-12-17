package com.pentalog.pentastagiu.homework2.problem3;

public class Board {

    private User[] user = new User[5];
    private Message[] messageObj = new Message[5];
    private String[] names = {"Ana","Mihai","Mircea","Andreea","Diana"};
    private static String message = "";

    public void setBoard(){
        for(int i = 0; i < names.length; i++){
            user[i] = new User(names[i],names[i] + "@email.com");
            messageObj[i] = new Message("Message with number " + i ,names[i]);
        }
    }

    public void setMessage(){
        for(int i = 0; i < names.length; i++){
            Board.message += "\n" + user[i].postMessage(messageObj[i]);
        }
    }

    public static String displayMessage(){
        return Board.message;
    }
}
