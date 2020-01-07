package com.pentalog.pentastagiu.homework3.Tema1;

public class Triangle extends Shape {
    //  lengthC is base of the triangle
    private int lengthC = 7;

    @Override
    public void calculatePerimeter() {
        int lengthA = 5;
        int lengthB = 6;
        int perimeter = lengthA + lengthB + lengthC;
        System.out.println("Perimeter of triangle is: " + perimeter);

    }

    @Override
    public void calculateArea() {
        int height = 9;
        double area = (lengthC * height)/2;
        System.out.println("Area of triangle is: " + area);

    }
}
