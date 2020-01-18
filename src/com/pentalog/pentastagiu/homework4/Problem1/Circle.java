package com.pentalog.pentastagiu.homework4.Problem1;

public class Circle {
    private int radius;

    //Method that calculate the circle area.
    public double area(){
        radius = (int)(Math.random()*100);
        double areaValue = Math.PI * (radius * radius);
        return areaValue;
    }
}
