package com.pentalog.pentastagiu.homework4.shapes;

public class Rectangle extends Shapes implements Perimeter, Area{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimiter() {
        return 2*(length + width);
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle length: " + String.valueOf(getLength()) + " width: " + String.valueOf(getWidth())+ " Perimiter: " + String.valueOf(calculatePerimiter()) + " Area: " + String.valueOf(calculateArea());
    }
}
