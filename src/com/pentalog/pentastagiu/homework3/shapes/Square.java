package com.pentalog.pentastagiu.homework3.shapes;

import java.text.DecimalFormat;

public class Square implements Shape {
    private double height;
    private double width;
    DecimalFormat df = new DecimalFormat(".##");

    public Square(double height, double width) {
        if (height == width) {
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Height and Width must be equals");
            return;
        }
    }

    @Override
    public double getArea() {
        double result = height * width;
        System.out.println("Square area: " + df.format(result));
        return result;
    }

    @Override
    public double getPerimeter() {
        double result = 4 * height;
        System.out.println("Square perimeter: " + df.format(result));
        return result;
    }
}
