package com.pentalog.pentastagiu.homework3.App1;

public class Circle extends Shape {
    private static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        if (radius <= 0){
            System.out.println("Invalid value!!");
            return -1;
        }
        else {
            perimeter = 2 * Math.PI * radius;
        }
        return perimeter;
    }

    @Override
    protected double calculateArea() {
        if (radius <= 0){
            System.out.println("Invalid value!!");
            return -1;
        } else {
            area = Math.PI * (radius * radius);
        }
        return area;
    }
}
