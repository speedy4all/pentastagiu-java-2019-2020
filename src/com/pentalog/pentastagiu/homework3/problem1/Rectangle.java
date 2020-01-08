package com.pentalog.pentastagiu.homework3.problem1;

public class Rectangle implements IShape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return this.length*2 + this.width*2;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }
}
