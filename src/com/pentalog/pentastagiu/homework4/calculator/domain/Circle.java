package com.pentalog.pentastagiu.homework4.calculator.domain;

public class Circle extends Shape {

    private double radius;
    private final double PI=3.14159265359;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
}
