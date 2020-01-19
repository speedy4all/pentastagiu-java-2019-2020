package com.pentalog.pentastagiu.homework5.problem1;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Circle> circleObjects = new ArrayList<>();

        while ((double)Math.random() > 0.01){
            Circle circle = new Circle();
            circleObjects.add(circle);
        }

        circleObjects.forEach(circle -> System.out.println("The circle area is : " + circle.area()));
    }
}
