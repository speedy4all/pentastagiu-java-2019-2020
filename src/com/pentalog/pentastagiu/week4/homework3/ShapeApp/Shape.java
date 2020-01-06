package com.pentalog.pentastagiu.week4.homework3.ShapeApp;

public abstract class Shape {
    private int xPosition;
    private int yPosition;

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public Shape(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

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
}
