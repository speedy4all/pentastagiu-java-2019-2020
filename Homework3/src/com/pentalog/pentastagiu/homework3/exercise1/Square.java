package com.pentalog.pentastagiu.homework3.exercise1;

public class Square extends Shape{

    private double side;

    public Square(){
        System.out.println("Introduce the side of the square: ");
        side = sc.nextDouble();
        while(side < 0){
            System.out.println("The side should be bigger than 0!");
            System.out.println("Introduce the side of the square: ");
            side = sc.nextDouble();
        }
    }

    @Override
    public double calculateArea() {
        area = side * side;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side+
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

