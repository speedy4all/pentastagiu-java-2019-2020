package com.pentalog.pentastagiu.homework3.ex1;

public class Square extends Shape{

    private double side;
    public Square() {
        System.out.println("Introduce teh side : ");
         side = sc.nextDouble();
    }


    @Override
    public double calculateArea() {
        area= side*side;
        return area;
    }

    @Override
    public double calculatePermieter() {
        perimeter=side*4;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side+ ", area=" + area + ", perimeter=" + perimeter + "}";
    }
}

