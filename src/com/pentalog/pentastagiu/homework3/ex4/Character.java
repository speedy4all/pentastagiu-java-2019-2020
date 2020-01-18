package com.pentalog.pentastagiu.homework3.ex4;

public class Character {
    protected String name;
    protected double healthPoints;
    protected double energyPoints;
    protected double xPosition;
    protected double yPosition;
    double distance;

    public Character(String name, int healthPoints, int energyPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
    }

    public void setPosition(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public double getxPosition() {
        return xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }
    public void getExtraPoints(Artifact artifact) {
        if (artifact instanceof HealthArtifact) {
            healthPoints=healthPoints+artifact.extraPoints;
        }
        else if (artifact instanceof EnergyArtifact) {
            energyPoints=energyPoints+artifact.extraPoints;
        }
    }
    public double verifyDistance(Character character, Character character2) {
        distance=Math.sqrt(Math.pow(character.getxPosition()-character2.getxPosition(),2)+(Math.pow(character.getyPosition()-character2.getyPosition(),2)));
        return distance;
    }
}