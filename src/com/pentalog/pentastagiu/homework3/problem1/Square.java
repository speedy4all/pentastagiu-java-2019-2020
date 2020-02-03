package com.pentalog.pentastagiu.homework3.problem1;

public class Square implements Shape {
    private double side;
    private String name = "Square";

    public Square(double side){
        if(side <= 0 ){
            throw new IllegalArgumentException();
        }
        this.side = side;
    }

    @Override
    public void perimeter() {
        double perimeter = 4 * side;
        System.out.println("Square perimeter : " + perimeter);
    }

    @Override
    public double area() {
        double area = side * side;
        return area;
    }

    @Override
    public String getName() {
        return name;
    }



}
