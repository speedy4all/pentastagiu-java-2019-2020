package com.pentalog.pentastagiu.homework3.StrategyGame;

public class EnergyArtifact extends Artifact {
    public EnergyArtifact(int xArtifactCoordonate, int yArtifactCoordonate) {
        super(xArtifactCoordonate, yArtifactCoordonate);
    }

    @Override
    public int setExtraPoints() {
        return 5;
    }
}
