package com.pentalog.pentastagiu.homework3.problem1;

public class Circle implements Shape {
    private double radius;


    private String name = "Circle";
    public Circle(double radius){

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}


