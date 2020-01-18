package com.pentalog.pentastagiu.homework3.ex4;

public class Artifact {
    protected double xPosition;
    protected double yPosition;
    protected double extraPoints;

    public Artifact(double extraPoints) {
        this.extraPoints = extraPoints;
    }

    public void setPosition(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public double getxPosition() {
        return xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }
}
