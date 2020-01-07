package com.pentalog.pentastagiu.homework3.Tema1;

public class Rectangle extends Shape{
     private int length = 10;
     private int width = 5;


    @Override
    public void calculatePerimeter() {
        int perimeter = 2*(length+width);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }


    @Override
    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }
}

