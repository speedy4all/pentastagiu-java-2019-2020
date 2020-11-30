package com.pentalog.pentastagiu.homework3.problem4.artifact;

public class Artifact {
    protected int xPosition;
    protected int yPosition;
    protected int extraPoints;

    public Artifact(int xPosition, int yPosition, int extraPoints){
        if (xPosition <= 0 || yPosition <= 0 || extraPoints <=0){
            throw new IllegalArgumentException();
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.extraPoints = extraPoints;
    }
    public int getExtraPoints() {
        return extraPoints;
    }


}
