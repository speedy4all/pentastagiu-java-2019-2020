package com.pentalog.pentastagiu.homework3.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException();
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
