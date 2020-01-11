package com.pentalog.pentastagiu.homework3.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public  Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) throw new IllegalArgumentException();
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException();
        this.height = height;
    }

    @Override

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
