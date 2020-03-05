package com.pentalog.pentastagiu.homework3.strategyGame;

public class HealthArtifact extends Artifact {

    int healthPoint;

    public HealthArtifact(int x, int y, int healthPoint) {
        super(x, y);
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
