package com.pentalog.pentastagiu.homework2_usersMessagesOnBoard;

import java.util.Objects;
import java.util.Scanner;

public class UserRegistration {
    private String userEmail;
    private String userFullName;
    Scanner scan=new Scanner(System.in);

    //constructors
    public UserRegistration() {
    }

    public UserRegistration(String userEmail, String userFullName) {
        this.userEmail = userEmail;
        this.userFullName = userFullName;
    }

    public String userEmail() {
        System.out.println("Please enter your email");
        userEmail=scan.nextLine();
        return userEmail;
    }

    public String userFullName() {
        System.out.println("Please enter full name");
        userFullName=scan.nextLine();
        return userFullName;
    }

    //getters and setters
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserFullName() {
        return userFullName;
    }
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRegistration)) return false;
        UserRegistration that = (UserRegistration) o;
        return userEmail.equals(that.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail);
    }
}
