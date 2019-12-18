package com.pentalog.pentatagiu.week3;

public class Student {
    private double grade;
    private String firstName;
    private String secondName;
    private boolean active = true;

    void printStudentInfotoConsole(){
        System.out.println("Student name is " + firstName + " " + secondName + " and the grade is: " + grade );

    }
    public boolean hasScolarship() {
        return grade > 8;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 1 || grade > 10) {
            System.out.println("warning : this is not a valid grade.");
            return;
        }
        this.grade = grade;
    }

}