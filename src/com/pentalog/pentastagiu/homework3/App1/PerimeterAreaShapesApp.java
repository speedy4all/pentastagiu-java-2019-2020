package com.pentalog.pentastagiu.homework3.App1;

import com.pentalog.pentastagiu.homework3.App4.Artifact;

import java.util.ArrayList;

public class PerimeterAreaShapesApp {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(12.2, 13.7, 15);
        Triangle triangle2 = new Triangle(140, 150, 10);
//        System.out.println("Perimeter of the first triangle is: " + triangle.calculatePerimeter());
//        System.out.println("Area of the first triangle is: " + triangle.calculateArea());
//        System.out.println("Perimeter of the second triangle is: " + triangle2.calculatePerimeter());
//        System.out.println("Area of the first triangle is: " + triangle2.calculateArea());

        Rectangle rectangle = new Rectangle(20,30);
//        System.out.println("Perimeter of rectangle = " + rectangle.calculatePerimeter());
//        System.out.println("Area of rectangle " + rectangle.calculateArea());

        Square square = new Square(16.7);
//        System.out.println("Perimeter of square = " + square.calculatePerimeter());
//        System.out.println("Area of square= " + square.calculateArea());

        Circle circle = new Circle(10);
//        System.out.println("Perimeter of circle = " + circle.calculatePerimeter());
//        System.out.println("Area of circle = " + circle.calculateArea());

        Triangle triangle3 = new Triangle(30, 14, 25);
        Triangle triangle4 = new Triangle(50, 44, 30);
        Triangle triangle5 = new Triangle(20, 4, 22);
        Rectangle rectangle2 = new Rectangle(12, 34);
        Rectangle rectangle3 = new Rectangle(22, 4);
        Rectangle rectangle4 = new Rectangle(2, 3.4);
        Square square2 = new Square(31);
        Square square3 = new Square(5);
        Square square4 = new Square(90);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(89);
        Circle circle4 = new Circle(17);
        Circle circle5 = new Circle(23);

        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(triangle);
        triangles.add(triangle2);
        triangles.add(triangle3);
        triangles.add(triangle4);
        triangles.add(triangle5);

        ArrayList<Square> squares = new ArrayList<>();
        squares.add(square);
        squares.add(square2);
        squares.add(square3);
        squares.add(square4);

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        rectangles.add(rectangle4);

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(circle);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);

        double maxT = triangle.calculateArea();
        for (Triangle t:
             triangles) {
            if (maxT < t.calculateArea()){
                maxT = t.calculateArea();
            }
        }
        System.out.println("Triangle maximum area: " + maxT);

        double maxSquare = square.calculateArea();
        for (Square s:
             squares) {
            if (maxSquare < s.calculateArea()){
                maxSquare = s.calculateArea();
            }
        }

        System.out.println("Square maximum area: " + maxSquare);

        double maxRectangle = rectangle.calculateArea();
        for (Rectangle r:
             rectangles) {
            if (maxRectangle < r.calculateArea()){
                maxRectangle = r.calculateArea();
            }
        }

        System.out.println("Rectangle maximum area: " + maxRectangle);

        double maxCircle = circle.calculateArea();
        for (Circle c:
             circles) {
            if (maxCircle < c.calculateArea()){
                maxCircle = c.calculateArea();
            }

        }

        System.out.println("Circle maximum area: " + maxCircle);
    }

}
