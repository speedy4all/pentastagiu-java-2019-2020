package com.pentalog.pentastagiu.homework3.App4;

public class Character {
    private String name;
    protected int healthPoints;
    protected int energyPoints;
    private int positionX;
    private int positionY;
    Character character;


    public Character(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.positionX = positionX;
        this.positionY = positionY;
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

    public int calculateDistanceBetweenPoints(int positionX, int positionY, int positionX2, int positionY2)
    {return (int)Math.sqrt((positionY2 - positionY) * (positionY2 - positionY) + (positionX2 - positionX) * (positionX2 - positionX));
    }


    public void increasePoints(Artifact artifact){
        if (artifact instanceof EnergyArtifact){
            this.energyPoints += ((EnergyArtifact) artifact).getExtraPoints();
        } else if (artifact instanceof HealthArtifact){
            this.healthPoints += ((HealthArtifact) artifact).getExtraPoints();
        }
    }
}
