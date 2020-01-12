package com.pentalog.pentastagiu.homework4.ex1;

public class Rectangle implements IShapeMethods{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public void getInfo() {
        System.out.println("Rectangle: length = " + this.length + "; width = " + this.width + "; Area = " + calculateArea() + "; Perimeter = " + calculatePerimeter() );

    }

}