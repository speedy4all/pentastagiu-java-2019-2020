package com.pentalog.pentastagiu.homework3.problem1;

import com.pentalog.pentastagiu.week4.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Problem1App {


    public static void main(String[] args) {
        /** Circle */

        Circle circleTest = new Circle(5);
        System.out.println("Circle area is " + circleTest.calculateArea() + " and perimeter is: " + circleTest.calculatePerimeter());

        /** Square */

        Square squareTest = new Square(15);
        System.out.println("Square area is " + squareTest.calculateArea() + " and perimeter is: " + squareTest.calculatePerimeter());

        /** Triangle */
        Triangle triangleTest = new Triangle(10,10,14,11);
        System.out.println("Triangle Area is " + triangleTest.calculateArea() + " and perimeter is: " + triangleTest.calculatePerimeter());

        /** Rectangle */
        IShape rectangleTest = new Rectangle(4,20);
        System.out.println("Rectangle Area is " + rectangleTest.calculateArea() + " and perimeter is: " + rectangleTest.calculatePerimeter());

        List<Double> shapes = new ArrayList<Double>();
        shapes.add(circleTest.calculateArea());
        shapes.add(squareTest.calculateArea());
        shapes.add(rectangleTest.calculateArea());
        shapes.add(triangleTest.calculateArea());
        shapes.stream().sorted();

        System.out.println("Biggest area is " +  + shapes.get(1));

    }

}
