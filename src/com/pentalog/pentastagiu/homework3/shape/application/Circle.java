package com.pentalog.pentastagiu.homework3.shape.application;

public class Circle extends Shape {

    private Double radius;
    private final Double PI = 3.14;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getPI() {
        return PI;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public Double getPerimeter() {
        return 2 * PI * radius;
    }
}
