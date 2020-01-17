package com.pentalog.pentastagiu.homework5.circle;

public class Circle {

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

    public Double getArea() {
        return PI * Math.pow(radius, 2);
    }

}
