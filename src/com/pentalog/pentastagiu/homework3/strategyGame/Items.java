package com.pentalog.pentastagiu.homework3.strategyGame;

public class Items {

    private int x,y,healthPoint,energyPoint;

    public Items(int x, int y, int healthPoint, int energyPoint) {
        this.x = x;
        this.y = y;
        this.healthPoint = healthPoint;
        this.energyPoint = energyPoint;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getEnergyPoint() {
        return energyPoint;
    }

    public void setEnergyPoint(int energyPoint) {
        this.energyPoint = energyPoint;
    }
}
