package com.pentalog.pentastagiu.homework3;

public class Artifact {
    private int xPosition;
    private int yPosition;
    private int points;

    public Artifact(int xPosition, int yPosition, int points) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.points = points;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getPoints() {
        return points;
    }
}
