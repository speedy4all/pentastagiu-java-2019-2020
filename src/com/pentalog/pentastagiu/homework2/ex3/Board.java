package ex3;

import java.util.ArrayList;

public class Board {

    ArrayList<Message> messages = new ArrayList<>();



    public void addMessages(Message message){

        messages.add(message);

    }



    public void displayMessages() {

        for (Message message : messages) {

            System.out.println(message.getDescription());

        }

    }



}