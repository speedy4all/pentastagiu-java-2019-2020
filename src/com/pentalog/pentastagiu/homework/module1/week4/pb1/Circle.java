package com.pentalog.pentastagiu.homework.module1.week4.pb1;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
