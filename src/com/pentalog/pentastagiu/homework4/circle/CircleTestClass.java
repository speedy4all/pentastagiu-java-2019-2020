package com.pentalog.pentastagiu.homework4.circle;

import java.util.ArrayList;
import java.util.List;

public class CircleTestClass {
    public static void main(String [] args) {

        Double radius=Math.random();
        List<Circle> circles=new ArrayList<>();
        Circle circle=null;
        Integer counter=0;


        while(radius>0.01) {
            circle=new Circle(radius);
            circles.add(circle);
            counter++;
            System.out.printf("\nArea of circle %d is %.3f ",counter, circle.calculateArea(radius));
            radius=Math.random();
        }

    }
}
