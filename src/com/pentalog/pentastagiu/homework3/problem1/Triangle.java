package com.pentalog.pentastagiu.homework3.problem1;

public class Triangle implements Shape {
    private double sideOne;
    private double sideTwo;
    private double base;
    private double height;
    private String name = "Triangle";

    public Triangle(double sideOne, double sideTwo, double base, double height){
        if (sideOne <= 0 || sideTwo <= 0 || base <= 0 || height <= 0){
            throw new IllegalArgumentException();
        }
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.base = base;
        this.height = height;
    }

    @Override
    public void perimeter() {
        double perimeter = sideOne + sideTwo + base;
        System.out.println("Triangle perimeter : " + perimeter);
    }

    @Override
    public double area() {
        double area = (base * height)/2;
        return area;
    }

    @Override
    public String getName() {
        return name;
    }




}
