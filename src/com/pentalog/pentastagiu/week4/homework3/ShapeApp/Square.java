package com.pentalog.pentastagiu.week4.homework3.ShapeApp;

import com.pentalog.pentastagiu.week4.homework3.ShapeApp.Shape;

public class Square extends Shape {
    private double side;

    public Square(int xPosition, int yPosition, double side) {
        super(xPosition, yPosition);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=4*side;
        System.out.println("Perimeter is:"+perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double area=Math.pow(side,2);
        System.out.println("Area is:"+area);
        return area;
    }
}
