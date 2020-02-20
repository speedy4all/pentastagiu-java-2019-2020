package com.pentalog.pentastagiu.homework3.shape;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) throw new IllegalArgumentException();
        if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2)
            throw new IllegalArgumentException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 <= 0 || side1 >= side2 + side3) throw new IllegalArgumentException();
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 <= 0 || side2 >= side1 + side3) throw new IllegalArgumentException();
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 <= 0 || side3 >= side1 + side2) throw new IllegalArgumentException();
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }
}
