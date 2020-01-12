package com.pentalog.pentastagiu.homework3.StrategyGame;

public class HealthArtifact extends Artifact{
    public HealthArtifact(int xArtifactCoordonate, int yArtifactCoordonate) {
        super(xArtifactCoordonate, yArtifactCoordonate);
    }

    @Override
    public int setExtraPoints() {
        return 10;
    }
}
