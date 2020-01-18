package com.pentalog.pentastagiu.homework3.ex1;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();
        Triangle triangle=new Triangle();
        double area_max=0;
        int k=0;
        double[] areas = { circle.calculateArea(), rectangle.calculateArea(),square.calculateArea(), triangle.calculateArea()};


        circle.calculateArea();
        circle.calculatePermieter();
        rectangle.calculateArea();
        rectangle.calculatePermieter();
        square.calculateArea();
        square.calculatePermieter();
        triangle.calculateArea();
        triangle.calculatePermieter();

        for(int i=0; i<areas.length; i++) {
            if (areas[i] > area_max) {
                area_max=i;
                k=0;
                k++;
            }
        }
        System.out.println("The biggesst area is "+ area_max);
        if(k==0) {
            System.out.println(circle.toString());
        }
        else if(k==1) {
            System.out.println(rectangle.toString());
        }
        else if(k==2) {
            System.out.println(square.toString());
        }
        else if(k==3) {
            System.out.println(triangle.toString());
        }

    }
}
