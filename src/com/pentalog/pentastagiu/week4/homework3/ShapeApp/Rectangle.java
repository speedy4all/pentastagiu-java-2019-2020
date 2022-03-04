package com.pentalog.pentastagiu.week4.homework3.ShapeApp;

public class Rectangle extends Shape {
   private double length;
   private double width;

    public Rectangle(int xPosition, int yPosition, double length, double width) {
        super(xPosition, yPosition);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter= 2*(width+length);
        System.out.println("The perimeter is:" + perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area= width*length;
        System.out.println("Area is:" + area);
        return area;
    }
}
