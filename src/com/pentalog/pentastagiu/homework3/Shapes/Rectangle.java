package com.pentalog.pentastagiu.homework3.Shapes;

public class Rectangle extends Shape{
    private int width;
    private int lenght;

    @Override
    public void calculatePerimeter() {
        int perimeter =2*(width+lenght);
        System.out.printf("The rectangle perimeter is " + perimeter);
    }

    @Override
    public void calculateArea() {
        int area = width*lenght;
        System.out.printf("The rectangle area is " + area);

    }
    public double getArea(){
        return width*lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
