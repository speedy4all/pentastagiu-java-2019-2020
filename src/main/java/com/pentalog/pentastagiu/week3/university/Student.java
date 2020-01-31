package com.pentalog.pentastagiu.week3.university;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private boolean active = true;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 1 || grade > 10) {
            System.out.println("warning: not a valid grade!");
            return;
        }

        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean hasScholarship() {
        return grade > 7.5;
    }

    void printStudentInfoToConsole() {
        System.out.println("Student " + firstName.toUpperCase() + " " + this.lastName + " is active: " + active + ", grade: " + grade);
    }
}
