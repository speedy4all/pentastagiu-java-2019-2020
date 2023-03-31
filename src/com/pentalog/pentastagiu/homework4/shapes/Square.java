package com.pentalog.pentastagiu.homework4.shapes;

public class Square extends Shapes implements Perimeter, Area{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Square(int length){
        this.length = length;
    }

    @Override
    public double calculatePerimiter() {
        return length*4;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public String toString() {
        return "Square length: " + String.valueOf(getLength()) + " Perimiter: " + String.valueOf(calculatePerimiter()) + " Area: " + String.valueOf(calculateArea());
    }
}
