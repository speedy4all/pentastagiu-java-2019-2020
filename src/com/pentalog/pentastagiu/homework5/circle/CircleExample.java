package com.pentalog.pentastagiu.homework5.circle;

import com.pentalog.pentastagiu.homework5.circle.Circle;

import java.util.ArrayList;
import java.util.List;

public class CircleExample {

    public static void main(String[] args){
    /* Make a List of Circle objects. Use a random radius.
    Keep adding circles to the list until Math.random() returns less than 0.01.
    Then, loop down the list and print out each area.
    Note: To generate a random number use the following:
    double rand = Math.random();
    To generate a random integer number in a range use:
    (int)(Math.random*100); */

        List<Circle> circles = new ArrayList<>();
        double radius = 0;
        do {
            radius = Math.random();
            Circle circle = new Circle(radius);
            circles.add(circle);
            System.out.println("For radius: " + radius + " area is: " + circle.getArea());
        } while (radius > 0.01);
    }
}
