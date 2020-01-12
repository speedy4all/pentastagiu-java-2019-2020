package com.pentalog.pentastagiu.homework4.ex1;

public class Circle implements IShapeMethods {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Circle: radius = " + this.radius + "; Area = " + calculateArea() + "; Perimeter = " + calculatePerimeter() );

    }

}


