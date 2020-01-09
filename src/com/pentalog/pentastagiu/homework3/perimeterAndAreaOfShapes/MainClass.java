package com.pentalog.pentastagiu.homework3.perimeterAndAreaOfShapes;


import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Double radius;
        Double squareSide;
        Double side1, side2, side3;
        Double rectangleLength, rectangleWidth;
        Double circleArea, circlePerimeter;
        Double squareArea,squarePerimeter;
        Double rectangleArea, rectanglePerimeter;
        Double triangleArea=0.00, trianglePerimeter;
        Double[]areas;
        Double biggestArea;

        //creating objects
        Circle circle=new Circle();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        Triangle triangle=new Triangle();



        System.out.println("CALCULATE AREA AND PERIMETER OF SHAPES");
        //area and perimeter of circle
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("CIRCLE\nEnter the radius of circle");
        radius=scan.nextDouble();
        circle.setRadius(radius);

        circleArea=circle.calculateArea();
        circlePerimeter=circle.calculatePerimeter();
        System.out.println("\nArea of circle: " + circleArea + "\nPerimeter  of circle: " + circlePerimeter);
        System.out.println("-----------------------------------------------------------------------------------------");


        //area and perimeter of square
        System.out.println("SQUARE\nEnter the side of square");
        squareSide=scan.nextDouble();
        square.setSide(squareSide);
        squareArea=square.calculateArea();
        squarePerimeter=square.calculatePerimeter();
        System.out.println("\nArea of sqare: " + squareArea + "\nPerimeter  of square: " + squarePerimeter);
        System.out.println("-----------------------------------------------------------------------------------------");


        //area and perimeter of rectangle;
        System.out.println("RECTANGLE\nEnter the length of rectangle");
        rectangleLength=scan.nextDouble();
        rectangle.setLength(rectangleLength);
        System.out.println("Enter the width of rectangle");
        rectangleWidth=scan.nextDouble();
        rectangle.setWidth(rectangleWidth);
        rectangleArea=rectangle.calculateArea();
        rectanglePerimeter=rectangle.calculatePerimeter();
        System.out.println("\nArea of rectangle: " + rectangleArea + "\nPerimeter  of rectangle: " + rectanglePerimeter);
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println("\nTRIANGLE WITH 3 SIDES");
        System.out.println("Enter the length of firs side");
        side1=scan.nextDouble();
        triangle.setSide1(side1);
        System.out.println("Enter the length of second side");
        side2=scan.nextDouble();
        triangle.setSide2(side2);
        System.out.println("Enter the length of third side");
        side3=scan.nextDouble();
        triangle.setSide3(side3);
        triangleArea=triangle.calculateArea();
        trianglePerimeter=triangle.calculatePerimeter();
        System.out.println("\nArea of  3 sides  triangle: " + triangleArea+ "\nPerimeter  of 3 sides triangle: " + trianglePerimeter);
        System.out.println("-----------------------------------------------------------------------------------------");


        //display the shape with the biggest area
        areas=areaOfShapes(circleArea, squareArea, rectangleArea, triangleArea);
        biggestArea=biggestArea(areas);

    }

    //adding the areas to an array
    public static Double[] areaOfShapes(Double circleArea, Double squareArea, Double rectangleArea, Double triangleArea) {
        Double[] areas=new Double[4];
        areas[0]=circleArea;
        areas[1]=squareArea;
        areas[2]=rectangleArea;
        areas[3]=triangleArea;
        return areas;
    }
    //finding the max area
    public static Double biggestArea(Double[]areas) {
        Double maxArea = areas[0];
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] > maxArea) {
                maxArea=areas[i];
            }
        }
        if(maxArea==areas[0]) {
            System.out.println("The biggest area is area of the circle :" + maxArea);
        }else if(maxArea==areas[1]) {
            System.out.println("The biggest area is area of the square :" + maxArea);
        }else if(maxArea==areas[2]) {
            System.out.println("The biggest area is area of the rectangle :" + maxArea);
        }else if(maxArea==areas[3]) {
            System.out.println("The biggest area is area of the triangle :" + maxArea);
        }
        return maxArea;
    }


}
