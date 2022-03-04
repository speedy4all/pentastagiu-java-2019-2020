package homework2.problem3;

import java.util.ArrayList;

public class Board {
    //Contains all registered users.
    private ArrayList<User> users;

    public Board(){
        users = new ArrayList<>();
    }

    public void register(User user){
        if(users == null) { return;}
        if(users.contains(user)){
            System.out.println("The user " + user.getName() + " is already registered!");
        } else {
            users.add(user);
            System.out.println("The user " + user.getName() + " was successfully registered!");
        }
    }

    public void displayAllMessages(){
        if(users == null) { return;}
        System.out.println("All messages from bord:");
        for (User user : users){
            System.out.println(user.getMessage().getDescription());
        }

    }





}
