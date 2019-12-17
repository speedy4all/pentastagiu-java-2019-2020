package com.pentalog.pentastagiu.homework2.messageBoard;


import java.util.ArrayList;



public class MessageBoard {



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






