package com.pentalog.pentastagiu.homework4.ex1;

import java.util.Scanner;

public class Circle {

    Scanner sc = new Scanner(System.in);
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        area = Math.PI * (radius * radius);
        return this.area;
    }

    public double calculatePerimeter() {
        perimeter = Math.PI * 2 * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}

