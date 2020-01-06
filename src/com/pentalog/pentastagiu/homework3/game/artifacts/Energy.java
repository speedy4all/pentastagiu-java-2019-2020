package com.pentalog.pentastagiu.homework3.game.artifacts;

public class Energy {
    private int xPositionEnergy;
    private int yPositionEnergy;
    private int extraPointsEnergy;

    public Energy(int extraPointsEnergy){
        this.extraPointsEnergy = extraPointsEnergy;
    }

    public Energy(int xPositionEnergy, int yPositionEnergy, int extraPointsEnergy) {
        this.xPositionEnergy = xPositionEnergy;
        this.yPositionEnergy = yPositionEnergy;
        this.extraPointsEnergy = extraPointsEnergy;
    }

    public int getxPositionEnergy() {
        return xPositionEnergy;
    }

    public void setxPositionEnergy(int xPositionEnergy) {
        this.xPositionEnergy = xPositionEnergy;
    }

    public int getyPositionEnergy() {
        return yPositionEnergy;
    }

    public void setyPositionEnergy(int yPositionEnergy) {
        this.yPositionEnergy = yPositionEnergy;
    }

    public int getExtraPointsEnergy() {
        return extraPointsEnergy;
    }

    public void setExtraPointsEnergy(int extraPointsEnergy) {
        this.extraPointsEnergy = extraPointsEnergy;
    }
}
