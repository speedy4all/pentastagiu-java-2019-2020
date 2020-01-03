package com.pentalog.pentastagiu.homework3;

public class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    public double calculatePerimeter() {
        return 2*length+2*width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
