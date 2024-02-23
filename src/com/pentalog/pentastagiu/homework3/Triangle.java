package com.pentalog.pentastagiu.homework3;

Import java.util.Scanner;
public class Triangle {
    public class Triangle extends Shape {

        private double side1;
        private double side2;
        private double side3;
        private double semiperimeter;

        public Triangle(){
            System.out.println("Introduce the first side of the triangle: ");
            side1 = sc.nextDouble();
            System.out.println("Introduce the second side of the triangle: ");
            side2 = sc.nextDouble();
            System.out.println("Introduce the third side of the triangle: ");
            side3 = sc.nextDouble();
            while(side1 < 0){
                System.out.println("The side of the triangle should be bigger than 0!");
                System.out.println("Introduce the first side of the triangle: ");
                side1 = sc.nextDouble();
            }
            while(side2 < 0){
                System.out.println("The side of the triangle should be bigger than 0!");
                System.out.println("Introduce the second side of the triangle: ");
                side2 = sc.nextDouble();
            }
            while(side3 < 0){
                System.out.println("The side of the triangle should be bigger than 0!");
                System.out.println("Introduce the third side of the triangle: ");
                side3 = sc.nextDouble();
            }
        }

        @Override
        public double calculateArea() {
            semiperimeter = (side1 + side2 + side3)/2;
            area = Math.sqrt(semiperimeter *(semiperimeter - side1) *(semiperimeter - side2) *(semiperimeter - side3));
            return area;
        }

        @Override
        public double calculatePerimeter() {
            perimeter = side1 + side2 + side3;
            return perimeter;
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 +
                    ", semiperimeter=" + semiperimeter +
                    ", area=" + area +
                    ", perimeter=" + perimeter +
                    '}';
        }
    }
}
