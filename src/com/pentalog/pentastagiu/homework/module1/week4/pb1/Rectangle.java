package com.pentalog.pentastagiu.homework.module1.week4.pb1;

public class Rectangle extends Shapes {
    protected double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    protected double calculateArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
