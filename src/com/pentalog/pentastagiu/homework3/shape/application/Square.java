package com.pentalog.pentastagiu.homework3.shape.application;

public class Square extends Shape {

    private Double length;

    public Double getLength() {
        return length;
    }

    public Square(Double length) {
        this.length = length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Double getArea() {
        return length * length;
    }

    @Override
    public Double getPerimeter() {
        return 4 * length;
    }
}
