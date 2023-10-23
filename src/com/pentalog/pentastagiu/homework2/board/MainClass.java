package com.pentalog.pentastagiu.homework2.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Message> messages=new ArrayList<>();
        List<UserRegistration>users=new ArrayList<>();
        Message message=new Message();
        UserRegistration user= new UserRegistration();

        UserRegistration user1=new UserRegistration("bobleancadana@yahoo.com", "Bobleanca Dana");
        UserRegistration user2=new UserRegistration("axinteana@yahoo.com", "Axinte Ana");
        users.add(user1);
        users.add(user2);
        Message message1=new Message(users.get(0).getFullName(), "First message");
        Message message2=new Message(users.get(1).getFullName(), "Second message");

        messages.add(message1);
        messages.add(message2);

        String email="", userFullName="", description="";
        Integer userOption;
        Boolean anotherMessage=true, anotherUser=true;

        //print the messages from the board
        for(Message u:messages) {
            System.out.println("Author: " + u.getUserName() + "\nMessage: " + u.getDescription()+ "\n");
        }
        System.out.println("-----------------------------------------------------------------------");

        while(anotherUser==true) {
            //user has  register if he wants to post a message
            System.out.println("If you want to post a message on the board, you have to register.");
            System.out.println("REGISTER");
            email=user.email();
            userFullName=user.fullName();
            for(int i=0;i<users.size();i++) {
                while(users.get(i).getEmail().equals(email)) {
                    System.out.println("This email already exists. Register with other email");
                    email=user.email();
                    userFullName=user.fullName();
                }
            }
            System.out.println("Registered successfully");

            UserRegistration userRegistration=new UserRegistration(email, userFullName);
            users.add(userRegistration);
            while(anotherMessage==true) {
                System.out.println("-----------------------------------------------------------------------");
                message.postMessage(userFullName, description);
                description=scan.nextLine();
                Message usersMsg=new Message(userFullName, description);
                System.out.println("-----------------------------------------------------------------------");
                messages.add(usersMsg);
                for(Message u:messages) {
                    System.out.println("Author: " + u.getUserName() + "\nMessage: " + u.getDescription()+ "\n");
                }
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Do you want to print another message?\n1 - YES\n2 - NO");
                userOption=scan.nextInt();
                scan.nextLine();
                if(userOption==1) {
                    anotherMessage=true;
                }else if(userOption==2) {
                    anotherMessage=false;
                }

            }
            System.out.println("Do you want to register as another user?\n1 - YES\n2 - NO");
            userOption=scan.nextInt();
            scan.nextLine();
            System.out.println("-----------------------------------------------------------------------");
            if(userOption==1) {
                anotherUser=true;
                anotherMessage=true;
            }else if(userOption==2) {
                anotherUser=false;
                System.out.println("ALL MESSAGES");
                for(Message u:messages) {
                    System.out.println("Author: " + u.getUserName() + "\nMessage: " + u.getDescription()+ "\n");
                }
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }

}
