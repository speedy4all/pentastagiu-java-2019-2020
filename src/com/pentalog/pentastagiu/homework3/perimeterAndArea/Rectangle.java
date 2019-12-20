package com.pentalog.pentastagiu.homework3.perimeterAndArea;

public class Rectangle extends Shape {

    private static int width;
    private static int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int perimeter() {
        return 2*(width+length);
    }


    public int area() {
        return width*length;
    }



    @Override
    public String toString() {
        return "Square{" +
                "length" +length+
                "width= " + width + "area "+area()+"peimetru  "+perimeter();
    }
}
