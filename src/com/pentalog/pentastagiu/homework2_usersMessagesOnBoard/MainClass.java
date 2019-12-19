package com.pentalog.pentastagiu.homework2_usersMessagesOnBoard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<UserMessage> messages=new ArrayList<>();
        List<UserRegistration>users=new ArrayList<>();
        UserMessage message=new UserMessage();
        UserRegistration user= new UserRegistration();

        //create objects and add objects to the list
        UserRegistration user1=new UserRegistration("bobleancadana@yahoo.com", "Bobleanca Dana");
        UserRegistration user2=new UserRegistration("axinteana@yahoo.com", "Axinte Ana");
        users.add(user1);
        users.add(user2);
        UserMessage message1=new UserMessage(users.get(0).getUserFullName(), "First message");
        UserMessage message2=new UserMessage(users.get(1).getUserFullName(), "Second message");
        messages.add(message1);
        messages.add(message2);

        String email="", userFullName="", description="";
        Integer userOption;
        Boolean anotherMessage=true, anotherUser=true;

        //print the messages from the board
        for(UserMessage u:messages) {
            System.out.println("Author: " + u.getUserName() + "\nMessage: " + u.getDescription()+ "\n");
        }
        System.out.println("-----------------------------------------------------------------------");

        while(anotherUser==true) {
            //user has  register if he wants to post a message
            System.out.println("If you want to post a message on the board, you have to register.");
            System.out.println("REGISTER");
            email=user.userEmail();
            userFullName=user.userFullName();
            for(int i=0;i<users.size();i++) {
                while(users.get(i).getUserEmail().equals(email)) {
                    System.out.println("This email already exists. Register with other email");
                    email=user.userEmail();
                    userFullName=user.userFullName();
                }
            }
            System.out.println("Registered successfully");

            UserRegistration userRegistration=new UserRegistration(email, userFullName);
            users.add(userRegistration);
            //post message
            while(anotherMessage==true) {
                System.out.println("-----------------------------------------------------------------------");
                message.postMessage(userFullName);
                description=scan.nextLine();
                UserMessage usersMsg=new UserMessage(userFullName, description);
                System.out.println("-----------------------------------------------------------------------");
                messages.add(usersMsg);
                for(UserMessage u:messages) {
                    System.out.println("Author: " + u.getUserName() + "\nMessage: " + u.getDescription()+ "\n");
                }
                System.out.println("-----------------------------------------------------------------------");
              //print another message
                System.out.println("Do you want to print another message?\n1 - YES\n2 - NO");
                userOption=scan.nextInt();
                scan.nextLine();
                if(userOption==1) {
                    anotherMessage=true;
                }else if(userOption==2) {
                    anotherMessage=false;
                }

            }
            //register  another user
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
                for(UserMessage u:messages) {
                    System.out.println("Author: " + u.getUserName() + "\nMessage: " + u.getDescription()+ "\n");
                }
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }
}
