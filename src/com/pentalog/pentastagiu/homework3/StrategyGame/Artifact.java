package com.pentalog.pentastagiu.homework3.StrategyGame;

public abstract class Artifact {
    private int xArtifactCoordonate;
    private int yArtifactCoordonate;
    private int ExtraPoints;
    public abstract int setExtraPoints();

    public Artifact(int xArtifactCoordonate, int yArtifactCoordonate) {
        this.xArtifactCoordonate = xArtifactCoordonate;
        this.yArtifactCoordonate = yArtifactCoordonate;
    }

    public int getxArtifactCoordonate() {
        return xArtifactCoordonate;
    }

    public void setxArtifactCoordonate(int xArtifactCoordonate) {
        this.xArtifactCoordonate = xArtifactCoordonate;
    }

    public int getyArtifactCoordonate() {
        return yArtifactCoordonate;
    }

    public void setyArtifactCoordonate(int yArtifactCoordonate) {
        this.yArtifactCoordonate = yArtifactCoordonate;
    }

    public int getExtraPoints() {
        return ExtraPoints;
    }



}
