package com.pentalog.pentastagiu.homework3;

public class Square extends Shape {
    private double length;

    @Override
    public double calculatePerimeter() {
        return 4* length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
