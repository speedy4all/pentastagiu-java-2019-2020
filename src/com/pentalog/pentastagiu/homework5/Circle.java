package com.pentalog.pentastagiu.homework5;

public class Circle {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        return area;
    }

    @Override
    public String toString() {
        return "The circle has the Radius: "+getRadius()+" and the Area: "+calculateArea(this);
    }
}
