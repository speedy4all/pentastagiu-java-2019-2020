package com.pentalog.pentastagiu.homework4.ex1;

public class Square implements IShapeMethods {

    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calculateArea() {
        return lenght * lenght;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * lenght;
    }

    @Override
    public void getInfo() {
        System.out.println("Square: length = " + this.lenght + "; Area = " + calculateArea() + "; Perimeter = " + calculatePerimeter() );

    }

}

