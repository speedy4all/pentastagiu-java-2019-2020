package com.pentalog.pentastagiu.homework4.shapes;

import java.util.ArrayList;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(7, 5);
        Trinagle trinagle = new Trinagle(13, 14, 15);


        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(trinagle.calculateArea());

        ArrayList<Shapes> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(trinagle);

        Shapes shapeWithMaxArea = new Shapes();
        shapeWithMaxArea = shapes.get(0);
        for (int i = 0; i < shapes.size()-1; i++)
        if(shapes.get(i+1).calculateArea() > shapes.get(i).calculateArea()){
            shapeWithMaxArea = shapes.get(i+1);
        }

        System.out.println("\nShape with max Area is:\n" + shapeWithMaxArea);

    }
}
