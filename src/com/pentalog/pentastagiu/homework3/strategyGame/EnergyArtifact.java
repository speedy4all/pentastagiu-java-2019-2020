package com.pentalog.pentastagiu.homework3.strategyGame;

public class EnergyArtifact extends Artifact {

    int energyPoint;

    public EnergyArtifact(int x, int y, int energyPointPoint) {
        super(x, y);
        this.energyPoint = energyPointPoint;
    }

    public int getEnergyPoint() {
        return energyPoint;
    }

    public void setEnergyPoint(int energyPoint) {
        this.energyPoint = energyPoint;
    }
}
