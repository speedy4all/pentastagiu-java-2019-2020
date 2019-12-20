package com.pentalog.pentastagiu.homework3.shapes;

import java.text.DecimalFormat;

public class Rectangle implements Shape {
    private double height;
    private double width;
    DecimalFormat df = new DecimalFormat(".##");

    public Rectangle(double height, double width) {
        if (height != width) {
            this.height = height;
            this.width = width;
        } else
            System.out.println("You define a square");
    }

    @Override
    public double getArea() {
        double result = height * width;
        System.out.println("Rectangle area: " + df.format(result));
        return result;
    }

    @Override
    public double getPerimeter() {
        double result = 2 * (height + width);
        System.out.println("Rectangle perimeter: " + df.format(result));
        return result;
    }
}
