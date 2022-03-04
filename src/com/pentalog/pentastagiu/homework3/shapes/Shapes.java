package com.pentalog.pentastagiu.homework3.shapes;

public class Shapes implements Perimeter, Area{
    @Override
    public double calculatePerimiter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Area maxima: " + String.valueOf(calculateArea());
    }
}
