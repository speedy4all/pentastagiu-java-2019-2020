package com.pentalog.pentastagiu.homework3.strategyGame;

public class Artifact extends positionOnMap{

    private  int extraPoints;

        public Artifact(int x, int y, int extraPoints) {
        super(x, y);
        this.extraPoints = extraPoints;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

    public void setExtraPoints(int extraPoints) {
        this.extraPoints = extraPoints;
    }
}
