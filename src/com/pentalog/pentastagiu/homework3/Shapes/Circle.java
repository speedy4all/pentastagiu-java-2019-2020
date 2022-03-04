package com.pentalog.pentastagiu.homework3.Shapes;

public class Circle extends Shape {
    private int radius;

    @Override
    public void calculatePerimeter() {
        double perimeter = 2*3.14*radius;
        System.out.printf("The circle length is " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = 3.14*Math.pow(radius,2);
        System.out.printf("The circle area is " + area);
    }

    @Override
    public double getArea() {
        return 3.14*Math.pow(radius,2);
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
