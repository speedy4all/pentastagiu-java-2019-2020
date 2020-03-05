package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public abstract class Artifact extends GameObject {
    public int pointsGiven;

    public Artifact(MapLocation currLocation, int pointsGiven) {
        super(currLocation);
        this.pointsGiven = pointsGiven;
    }
}
