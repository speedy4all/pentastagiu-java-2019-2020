package com.pentalog.pentastagiu.homework3.Tema1;

public class Square extends Shape {
    private int side = 10;

    @Override
    public void calculatePerimeter() {
        int perimeter = 4 * side;
        System.out.println("Perimeter of square is: " + perimeter);

    }

    @Override
    public void calculateArea() {
        int area = side * side;
        System.out.println("Area of square is: " + area);

    }
}
