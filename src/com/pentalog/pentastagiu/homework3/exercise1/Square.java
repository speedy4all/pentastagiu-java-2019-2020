package com.pentalog.pentastagiu.homework3.exercise1;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side > 0 ? side : 1;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
