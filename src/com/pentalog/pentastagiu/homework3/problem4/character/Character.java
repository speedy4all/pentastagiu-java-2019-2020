package com.pentalog.pentastagiu.homework3.problem4.character;

public class Character {
    protected String name;
    protected int healthPoints;
    protected int energyPoints;
    protected int xPosition;
    protected int yPosition;

    public Character(String name, int healthPoints, int energyPoints, int xPosition, int yPosition){
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

}
