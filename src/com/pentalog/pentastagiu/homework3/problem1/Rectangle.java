package com.pentalog.pentastagiu.homework3.problem1;

public class Rectangle  implements Shape {

    private double length;
    private double width;
    private String name = "Rectangle";

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    @Override
    public double area() {
        double area = length * width;
        return area;
    }

    @Override
    public String getName() {
        return name;
    }

}
