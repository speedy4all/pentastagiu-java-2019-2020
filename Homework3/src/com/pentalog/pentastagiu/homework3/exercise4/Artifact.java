package com.pentalog.pentastagiu.homework3.exercise4;

public class Artifact {
    protected double positionX;
    protected double positionY;
    protected double extraPoints;

    public Artifact(double extraPoints) {
        this.extraPoints = extraPoints;
    }

    public void setPosition(double positionX, double positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getX(){
        return positionX;
    }
    public double getY(){
        return positionY;
    }


}
