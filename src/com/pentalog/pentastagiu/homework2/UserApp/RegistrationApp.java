package com.pentalog.pentastagiu.homework2.UserApp;

import sun.plugin2.message.Message;

public class RegistrationApp {
    public static void main(String[] args) {
        User FirstUser=new User("Tomoiaga Horatiu", "horacs@yahoo.com");
        User SecondUser=new User("Flaviu Macovei","Flaviumacovei@gmail.com");
        Board board=new Board();
        Messages FirstMessage=new Messages("First message","Tomoiaga Horatiu");
        Messages SecondMessage= new Messages("Second message","Flaviu Macovei");
         board.AddMessage(FirstMessage);
        board.AddMessage(SecondMessage);
        board.DispalyMessages();
    }
}
