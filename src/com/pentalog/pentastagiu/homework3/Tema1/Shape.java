package com.pentalog.pentastagiu.homework3.Tema1;


public abstract class Shape {
    private int xPosition;
    private int yPosition;

    public abstract void calculatePerimeter();
    public abstract void calculateArea();

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();

        Triangle triangle = new Triangle();
        triangle.calculatePerimeter();
        triangle.calculateArea();

        Square square = new Square();
        square.calculatePerimeter();
        square.calculateArea();

        Circle circle = new Circle();
        circle.calculatePerimeter();
        circle.calculateArea();
        

    }
}