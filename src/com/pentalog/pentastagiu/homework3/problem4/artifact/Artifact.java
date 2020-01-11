package com.pentalog.pentastagiu.homework3.problem4.artifact;

public class Artifact {
    protected int xPosition;
    protected int yPosition;
    protected int extraPoints;

    public Artifact(int xPosition, int yPosition, int extraPoints){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.extraPoints = extraPoints;
    }
    public int getExtraPoints() {
        return extraPoints;
    }

    public void setExtraPoints(int extraPoints) {
        this.extraPoints = extraPoints;
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
