package com.pentalog.pentastagiu.homework3.problem1;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.area();

        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.area();

        Square square = new Square(5);
        square.area();

        Triangle triangle = new Triangle(3, 5, 4, 6);
        triangle.area();

        ArrayList<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(rectangle);
        list.add(square);
        list.add(triangle);

        double MAX_AREA = (list.get(0)).area();
        String objectName = list.get(0).getName();
        for (Shape shape : list){
            if (MAX_AREA < shape.area()){
                MAX_AREA = shape.area();
                objectName = shape.getName();
            }
        }

        System.out.println("The object with the biggest area is: " + objectName);

    }

}
