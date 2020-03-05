package com.pentalog.pentastagiu.homework4.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> list = new ArrayList<>();
        double radius = 1;
        while (radius > 0.1) {
            radius = Math.random();
            Circle circle = new Circle(radius);
            list.add(circle);
            System.out.println("The area of the circle is: " + circle.calculateArea());
        }

    }
}

