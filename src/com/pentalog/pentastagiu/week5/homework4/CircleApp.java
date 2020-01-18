package com.pentalog.pentastagiu.week5.homework4;

import java.util.ArrayList;
import java.util.List;

public class CircleApp {
    public static void main(String[] args) {

        double randomRadius;

        List<Circle> myCircleList= new ArrayList<>();
        do{
            randomRadius = Math.random();
            myCircleList.add(new Circle(randomRadius));
        } while (randomRadius>=0.01);

        myCircleList.forEach(p-> System.out.println(p.calculateAria()));
    }
}
