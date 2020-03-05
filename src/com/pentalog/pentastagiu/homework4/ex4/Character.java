package com.pentalog.pentastagiu.homework4.ex4;

public abstract class Character {
    public String name;
    public double healthPoints;
    public double energyPoints;
    public Position mapPosition;
    private double maxHealtPoints;
    private double maxEnergyPoints;

    public Character(String name, double healthPoints, double energyPoints, Position mapPosition) {
        super();
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.mapPosition = mapPosition;
        this.maxEnergyPoints = energyPoints;
        this.maxHealtPoints = healthPoints;
    }


    public void getPosition() {
        System.out.println(
                this.name + " current position: x = " + this.mapPosition.getX() + "; y = " + this.mapPosition.getY());
    }

    public void atack(Character character) {
    }

    public void getPointsFromArtifact(Artifact artifact) {
        if (artifact.getType() == ArtifactType.EnergyArtifact) {
            this.energyPoints += 0.2 * this.maxEnergyPoints;
            if (this.energyPoints > this.maxEnergyPoints) {
                this.energyPoints = this.maxEnergyPoints;
            }
        }

        if (artifact.getType() == ArtifactType.HealthArtifact) {
            this.healthPoints += 0.2 * this.maxHealtPoints;
            if (this.healthPoints > this.maxHealtPoints) {
                this.healthPoints = this.maxHealtPoints;
            }
        }
    }

    public void getInfo() {
        System.out.println(this.name + ": health = " + this.healthPoints + "; energy = " + this.energyPoints);
    }

}

