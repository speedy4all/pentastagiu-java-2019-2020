package com.pentalog.pentastagiu.homework3.problem1;

public class Circle implements Shape {
    private double radius;
    private String name = "Circle";

    public Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter : " + perimeter);
    }

    @Override
    public double area() {
        double area = Math.PI * radius * radius;
        return area;

    }

    @Override
    public String getName() {
        return name;
    }



}


