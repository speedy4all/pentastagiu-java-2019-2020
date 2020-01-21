package com.pentalog.pentastagiu.homework4.CircleList;

public class Circle {
    private double radius;
    private double area;

    public double getArea() {
        return Math.pow(radius,2)*3.14;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
