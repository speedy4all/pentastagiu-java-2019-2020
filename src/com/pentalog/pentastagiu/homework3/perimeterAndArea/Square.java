package com.pentalog.pentastagiu.homework3.perimeterAndArea;

public class Square extends Shape {

    private static int a;


    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    public int perimeter() {
        return 4*a;
    }


    public int area() {
        return a*a;
    }



   /* @Override
    public String toString() {
        return "Square{" +
                "a='" + a + "area "+area()+"perimetru "+perimeter();
    }*/
}
