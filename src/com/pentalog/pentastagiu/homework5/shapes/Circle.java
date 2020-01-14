package com.pentalog.pentastagiu.homework5.shapes;

import com.pentalog.pentastagiu.homework5.exceptions.IllegalRadiusException;

public class Circle implements Shape {
    private double radius;
    private Point center;

    public Circle(double radius, double xCenter, double yCenter) {
        if (radius <= 0) {
            throw new IllegalRadiusException("Raza primita nu poate fi negativa sau 0");
        }
        this.radius = radius;
        this.center = new Point(xCenter, yCenter);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalRadiusException("Raza primita nu poate fi negativa");
        }
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }


}
