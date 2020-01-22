/*Make a List of Circle objects. Use a random radius. Keep adding circles to the list until Math.random()
 returns less than 0.01. Then, loop down the list and print out each area.
Note: To generate a random number use the following:
double rand = Math.random();
To generate a random integer number in a range use:
(int)(Math.random*100);*/


package com.pentalog.pentastagiu.homework4.circlelist;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        List<Circle> circleList = new ArrayList<>();
        Double radius = 0.1;
        while (radius != 0.01) {

            radius = Double.valueOf(df.format(Math.random()));

            System.out.println("radius = " + radius);
            Circle circle = new Circle();
            circle.setRadius(radius);
            circleList.add(circle);
        }
        System.out.println("circleList size = " + circleList.size());

        for (Circle c : circleList) {
            System.out.println("area = " + (3.14 * c.getRadius() * c.getRadius()));
        }

    }
}
