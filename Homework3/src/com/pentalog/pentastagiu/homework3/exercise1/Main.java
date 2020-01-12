package com.pentalog.pentastagiu.homework3.exercise1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        double[] array = {circle.calculatePerimeter(), square.calculateArea(), rectangle.calculateArea(), triangle.calculateArea()};
        double maxArea = 0;
        int j=0;

        square.calculateArea();
        square.calculatePerimeter();
        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();

        for(int i = 0; i < array.length; i++){
            if(array[i] > maxArea){
                maxArea = array[i];
                j = i;
            }
        }

        System.out.println("The biggest area is: " + maxArea);
        if(j == 0){
            System.out.println(circle.toString());
        }else if(j ==1){
            System.out.println(square.toString());
        }else if(j ==2){
            System.out.println(rectangle.toString());
        }else if(j == 3){
            System.out.println(triangle.toString());
        }

    }
}
