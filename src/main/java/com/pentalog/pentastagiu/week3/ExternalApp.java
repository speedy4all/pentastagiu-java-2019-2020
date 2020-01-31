package com.pentalog.pentastagiu.week3;

import com.pentalog.pentastagiu.week3.deposit.Box;
import com.pentalog.pentastagiu.week3.university.Student;

// I added this class to put here the code I created in live demo on the Homework1 class to avoid conflicts for your pull requests done on for homework 1
// (the purpose of this class is to see how import appears for Student and to test the visibility of the Student class
// if I declare it without an access modifier(default) or with public access modifier)
public class ExternalApp {

    public static void main(String[] args) {
        Student student = new Student();

        int originalValue = 10;
        System.out.println("In main method, before modify: " + originalValue);
        modify(originalValue);
        System.out.println("In main method, after modify: " + originalValue);

        Box box = new Box(100,20,50,"blue");
        System.out.println("In main method, before modify: " + box.getLength());
        modify(box);
        System.out.println("In main method, after modify: " + box.getLength());
    }

    private static void modify(Box box) {
        System.out.println("In local method, before modify: " + box.getLength());
        box.setLength(2);
        System.out.println("In local method, after modify: " + box.getLength());
    }

    private static void modify(int originalValue) {
        System.out.println("In local method, before modify: " + originalValue);
        originalValue = 5;
        System.out.println("In local method, after modify: " + originalValue);

    }
}
