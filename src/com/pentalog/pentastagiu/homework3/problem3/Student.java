package com.pentalog.pentastagiu.homework3.problem3;

public class Student {
    private String name = "Maria";
    private int age = 15;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }


}
