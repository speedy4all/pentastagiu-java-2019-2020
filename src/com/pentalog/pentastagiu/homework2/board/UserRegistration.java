package com.pentalog.pentastagiu.homework2.board;

import java.util.Objects;
import java.util.Scanner;

public class UserRegistration {
    private String email;
    private String fullName;
    Scanner scan=new Scanner(System.in);

    public UserRegistration() {
    }

    public UserRegistration(String email, String fullName) {
        super();
        this.email = email;
        this.fullName = fullName;
    }

    public String email() {
        System.out.println("Please enter your email");
        email=scan.nextLine();
        return email;
    }

    public String fullName() {
        System.out.println("Please enter full name");
        fullName=scan.nextLine();
        return fullName;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserRegistration other = (UserRegistration) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }



}