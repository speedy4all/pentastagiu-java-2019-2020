package com.pentalog.pentastagiu.homework3.game.strategy.application;

public abstract class Character {
    protected String name;
    protected Integer positionX;
    protected Integer positionY;
    protected Integer healthPoints;
    protected Integer energyPoints;
    Artifact artifact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(Integer energyPoints) {
        this.energyPoints = energyPoints;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    public Character(String name, Integer positionX, Integer positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Character(Integer healthPoints, Integer energyPoints, Artifact artifact) {
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.artifact = artifact;
    }

    public Character(String name, Integer positionX, Integer positionY, Integer healthPoints, Integer energyPoints) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
    }

    abstract void attack(Character character);
    abstract void addPoints(Artifact artifact);
}
