package com.pentalog.pentastagiu.homework3.Tema1;

public class Rectangle extends Shape{
    private int length;
    private int width;

    @Override
    public void calculatePerimeter() {
        int perimeter = 2*(length+width);
        System.out.println("Perimeter is: " + perimeter);
    }

    public void calculateArea() {
        int area = length * width;
        System.out.println("Area is: " + area);
    }

}
