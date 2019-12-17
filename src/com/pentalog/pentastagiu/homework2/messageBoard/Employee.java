package com.pentalog.pentastagiu.homework2.messageBoard;

public class Employee {

    private String name;

    private String message;


    public Employee(String name, String message) {
        this.name = name;
        this.message = message;


    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getmessage() {
        return this.message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
