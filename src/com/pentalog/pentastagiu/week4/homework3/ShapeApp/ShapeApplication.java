package com.pentalog.pentastagiu.week4.homework3.ShapeApp;

public class ShapeApplication {
    public static void main(String[] args){
        Square square1= new Square(1,2,2);
        Rectangle rectangle1= new Rectangle(1, 6, 1.4,6.2);
        Circle circle1=new Circle(2, 3, 4.8);
        Triangle triangle1= new Triangle(1,2,2.4,3.1,7.2);

        if (circle1.calculateArea()>square1.calculateArea()){
            System.out.println("Aria cercului este mai mare " +circle1.calculateArea());
        }
        else{
            System.out.println("Aria patratului este mai mare: "+square1.calculateArea());
        }

        if (rectangle1.calculatePerimeter()>triangle1.calculatePerimeter()){
            System.out.println("Perimetrul dreptunghiului este mai mare : "+rectangle1.calculatePerimeter());
        }
        else{
            System.out.println("Peimetrul triungiului este mai mare: "+triangle1.calculatePerimeter());
        }
    }

}
