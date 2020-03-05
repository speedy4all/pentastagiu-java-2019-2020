package com.pentalog.pentastagiu.homework3.Tema1;

public class Circle extends Shape {
    private double pi = 3.14;

    @Override
    public void calculatePerimeter() {
        int diameter = 10;
        double perimeter = pi * diameter;
        System.out.println("Perimeter of circle is: " + perimeter);

    }

    @Override
    public void calculateArea() {
        int radius = 5;
        double area = pi * (radius * radius);
        System.out.println("Area of circle is: " + area);

    }
}
