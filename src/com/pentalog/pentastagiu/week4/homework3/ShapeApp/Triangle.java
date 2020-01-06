package com.pentalog.pentastagiu.week4.homework3.ShapeApp;

import com.pentalog.pentastagiu.week4.homework3.ShapeApp.Shape;

public class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(int xPosition, int yPosition, double firstSide, double secondSide, double thirdSide) {
        super(xPosition, yPosition);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=firstSide+secondSide+thirdSide;
        System.out.println("Perimeter is"+perimeter);
        return perimeter;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter=(firstSide+secondSide+thirdSide)/2;
        double area=Math.sqrt(semiPerimeter*(semiPerimeter-firstSide)*(semiPerimeter-secondSide)*(semiPerimeter-thirdSide));
        System.out.println("Area is :" +area);
        return area;
    }
}
