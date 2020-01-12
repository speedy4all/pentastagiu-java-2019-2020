package com.pentalog.pentastagiu.week4.shapes;

public class Rectangle extends Shape {
    private int length;
    private int width;

    @Override
    public void calculatePerimeter() {
        int perimeter = 2*(length+width);
        System.out.println("Perimeter is: " + perimeter);
    }
}
