package com.pentalog.pentastagiu.homework4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListOfCircles {

    public static void main(String[] args) {
        double PI = Math.PI;
        List<Object> circles = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.###");
        while (true) {
            double radius = Math.random();
            double area = PI * (radius * radius);
            circles.add(radius);
            System.out.print(circles);
            if (radius < 0.01) {
                break;
            }
        }
        for (Object item : circles) {
            System.out.println("Area = " + df.format(item));
        }
    }//end of Main method
}
