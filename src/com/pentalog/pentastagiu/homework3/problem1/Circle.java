package com.pentalog.pentastagiu.homework3.problem1;

public class Circle implements IShape {

    int ray;
    double pi = 3.14;

    @Override
    public double calculatePerimeter() {
        return 2 * pi * ray;
    }

    public Circle(int ray) {
        this.ray = ray;
    }

    @Override
    public double calculateArea() {
        return pi * ray * ray;
    }
}
