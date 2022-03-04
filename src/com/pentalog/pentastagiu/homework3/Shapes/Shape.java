package com.pentalog.pentastagiu.homework3.Shapes;

public abstract class Shape {
    private int xPosition;
    private int yPosition;

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

    public abstract void calculatePerimeter();
    public abstract void calculateArea();
    public abstract double getArea();

}
