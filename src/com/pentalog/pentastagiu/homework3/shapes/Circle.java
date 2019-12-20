package com.pentalog.pentastagiu.homework3.shapes;

import java.text.DecimalFormat;

public class Circle implements Shape {
    private double PI = Math.PI;
    private int radius;
    DecimalFormat df = new DecimalFormat(".##");

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double result = PI * (radius*radius);
        System.out.println("Circle area: " + df.format(result));
        return result;
    }

    @Override
    public double getPerimeter() {
        double result = 2 * PI * radius;
        System.out.println("Circle perimeter: " + df.format(result));
        return result;
    }
}
