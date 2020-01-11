package com.pentalog.pentastagiu.homework3.shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
