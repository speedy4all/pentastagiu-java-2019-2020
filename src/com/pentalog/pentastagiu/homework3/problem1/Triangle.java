package com.pentalog.pentastagiu.homework3.problem1;

public class Triangle implements IShape{

    int length1;
    int length2;
    int base;
    int height;

    public Triangle(int length1, int length2, int base, int height) {
        this.length1 = length1;
        this.length2 = length2;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return this.length1 + this.length2 + this.base;
    }

    @Override
    public double calculateArea() {
        return this.base*this.height/2;
    }
}
