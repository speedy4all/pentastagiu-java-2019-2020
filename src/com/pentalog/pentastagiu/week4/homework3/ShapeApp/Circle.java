package com.pentalog.pentastagiu.week4.homework3.ShapeApp;

public class Circle extends Shape {
    private double radius;

    public Circle(int xPosition, int yPosition, double radius) {
        super(xPosition, yPosition);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=2*radius*Math.PI;
        System.out.println("Perimeter is: "+perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area=Math.pow(radius,2)*Math.PI;
        System.out.println("Area is: "+area);
        return area;

    }
}
