//Create a console application from the following requirements:
//We have some users that can register into an app with name & email
//Users are able to post messages on a board
//Each message has a description and an author
//The board can display messages from all the users

package com.pentalog.pentastagiu.homework2.messageBoard;


import java.util.ArrayList;



public class MessageBoardApp {



    public static void main(String[] a) {
        ArrayList<RegisteredEmail> registeredEmailList = new ArrayList<>();
        registeredEmailList.add(new RegisteredEmail("test@ro.ro"));


        ArrayList<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Ass", "test@ro.ro","povesti"));
        usersList.add(new Users("Ass", "test@ro.ro","povesti2"));
        usersList.add(new Users("T", "wa@345.rt","werewr"));
        usersList.add(new Users("K", "qw@rg.ro","sdfgfdsg"));


        ArrayList<Employee> employees = new ArrayList<Employee>();
        for(Users users : usersList) {
            for(RegisteredEmail registeredEmail : registeredEmailList) {
                if (users.getEmail().equals(registeredEmail.getEmail()) ) {
                    employees.add(new Employee(users.getName(),users.getMessage()));
                }
            }
        }

        System.out.println(employees);

    }
}






