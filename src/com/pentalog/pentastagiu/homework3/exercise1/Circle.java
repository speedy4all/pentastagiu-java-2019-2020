package com.pentalog.pentastagiu.homework3.exercise1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 1;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
