package com.pentalog.pentastagiu.week4.shapes;

public abstract class Shape {
    private int xPosition;
    private int yPosition;

    public abstract void calculatePerimeter();

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
