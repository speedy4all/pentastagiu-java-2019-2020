package com.pentalog.pentastagiu.homework3.strategyGame;

public class Character extends positionOnMap {
    private String name;
    private int healthPoints, energyPoints;

    public Character(int x, int y, String name, int healthPoints, int energyPoints) {
        super(x, y);

        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public void receiveArtifact(){
        
    }

}
