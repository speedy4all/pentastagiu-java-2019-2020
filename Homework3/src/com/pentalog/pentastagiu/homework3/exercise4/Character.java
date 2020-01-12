package com.pentalog.pentastagiu.homework3.exercise4;

public class Character {
    protected String name;
    protected double healthPoints;
    protected double energyPoints;
    protected double positionX;
    protected double positionY;
    protected double distance;

    public Character(String name, double energyPoints, double healthPoints) {
        this.name = name;
        this.energyPoints = energyPoints;
        this.healthPoints = healthPoints;
    }

    public void setPosition(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getPositionX() {
        return this.positionX;
    }

    public double getPositionY() {
        return this.positionY;
    }

    public void getExtraPoints(Artifact artifact) {
        if (artifact instanceof HealthArtifact) {
            healthPoints += artifact.extraPoints;
        } else if (artifact instanceof EnergyArtifact) {
            energyPoints += artifact.extraPoints;
        }
    }
    public double verifyDistance(Character character, Character character2){
        distance = Math.sqrt(Math.pow(character.getPositionX() - character2.getPositionX(),2) +
                (Math.pow(character.getPositionY() - character2.getPositionY(),2)));
        return distance;
    }
}
