package com.pentalog.pentastagiu.homework3.problem1;

public class Square implements IShape{

    double lenght;

    @Override
    public double calculatePerimeter() {
        return this.lenght * 4;
    }

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calculateArea() {
        return this.lenght * this.lenght;
    }
}
