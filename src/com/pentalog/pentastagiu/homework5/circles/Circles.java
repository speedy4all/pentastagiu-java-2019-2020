package com.pentalog.pentastagiu.homework5.circles;

import java.util.ArrayList;
import java.util.List;

public class Circles {
    public static void main(String[] args) {
        List<Object> CirclesList = new ArrayList<>();
        Circle c = new Circle();
        double radius;
        do {
            radius = Math.random();
            System.out.println("Radius: " + radius);
            c.setArea(Math.PI * radius * radius);
            CirclesList.add(c);
            System.out.println("Circle area: " + c.getArea()+'\n');
        }while (radius>0.01);
        System.out.println(CirclesList);
    }
}
