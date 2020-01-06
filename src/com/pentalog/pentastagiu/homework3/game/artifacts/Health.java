package com.pentalog.pentastagiu.homework3.game.artifacts;

public class Health {

    private int xPositionHealth;
    private int yPositionHealth;
    private int extraPointsHealth;

    public Health(int extraPointsHealth){
        this.extraPointsHealth = extraPointsHealth;

    }

    public Health(int xPositionHealth, int yPositionHealth, int extraPointsHealth) {
        this.xPositionHealth = xPositionHealth;
        this.yPositionHealth = yPositionHealth;
        this.extraPointsHealth = extraPointsHealth;
    }

    public int getxPositionHealth() {
        return xPositionHealth;
    }

    public void setxPositionHealth(int xPositionHealth) {
        this.xPositionHealth = xPositionHealth;
    }

    public int getyPositionHealth() {
        return yPositionHealth;
    }

    public void setyPositionHealth(int yPositionHealth) {
        this.yPositionHealth = yPositionHealth;
    }

    public int getExtraPointsHealth() {
        return extraPointsHealth;
    }

    public void setExtraPointsHealth(int extraPointsHealth) {
        this.extraPointsHealth = extraPointsHealth;
    }
}
