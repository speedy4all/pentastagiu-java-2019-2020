package com.pentalog.pentastagiu.homework5.shapes;

public class Point {
    private double xPosition;
    private double yPosition;

    public Point(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
