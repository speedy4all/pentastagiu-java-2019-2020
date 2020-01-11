package com.pentalog.pentastagiu.homework3.problem1;

public class Triangle implements Shape {
    private double sideOne;
    private double sideTwo;
    private double base;
    private double height;


    private String name = "Triangle";

    public Triangle(double sideOne, double sideTwo, double base, double height){
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

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }



}
