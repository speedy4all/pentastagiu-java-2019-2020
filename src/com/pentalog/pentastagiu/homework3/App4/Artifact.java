package com.pentalog.pentastagiu.homework3.App4;

public class Artifact {
    private int positionX;
    private int positionY;
    private int extraPoints;
    Artifact artifact;

    public Artifact(int positionX, int positionY, int extraPoints, Artifact artifact) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.extraPoints = extraPoints;
        this.artifact = artifact;
    }

    public Artifact(int positionX, int positionY, int extraPoints) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.extraPoints = extraPoints;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

    public void setExtraPoints(int extraPoints) {
        this.extraPoints = extraPoints;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }
}
