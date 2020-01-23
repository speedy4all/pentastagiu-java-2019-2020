package com.pentalog.pentastagiu.homework4.problem1;

import java.util.ArrayList;
import java.util.List;

public class Problem1App {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<Circle>();
        while (Math.random() > 0.01) {
            circles.add(new Circle(Math.random()));
        }

        for (Circle c : circles) {
            System.out.println("Circle area: " + c.getArea());
        }
    }
}
