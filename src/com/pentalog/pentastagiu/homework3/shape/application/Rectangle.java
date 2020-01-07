package com.pentalog.pentastagiu.homework3.shape.application;

public class Rectangle extends Shape {

    private Double width, length;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getArea() {
        return width * length;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (width + length);
    }
}
