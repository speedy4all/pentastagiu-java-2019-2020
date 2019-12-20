package com.pentalog.pentastagiu.homework3.shapes;

import java.text.DecimalFormat;

public class Triangle implements Shape{

    private double length;
    private double height;
    DecimalFormat df = new DecimalFormat(".##");

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }


    @Override
    public double getArea() {
        double result = 0.5 * length * height;
        System.out.println("Triangle area: " + df.format(result));
        return result;
    }

    @Override
    public double getPerimeter() {
        double result = 3 * length;
        System.out.println("Triangle perimeter: " + df.format(result));
        return result;
    }
}
