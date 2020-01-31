package com.pentalog.pentastagiu.homework3.game.strategy.application;

public class Monster extends Character {

    public Monster(String name, Integer positionX, Integer positionY, Integer healthPoints, Integer energyPoints) {
        super(name, positionX, positionY, healthPoints, energyPoints);
    }

    @Override
    public void attack(Character c) {
        energyPoints -=3;
        c.healthPoints -= 15;
    }

    @Override
    public void addPoints(Artifact artifact) {
        if (artifact.getType().equalsIgnoreCase("health")) {
            this.setHealthPoints(this.getHealthPoints() + artifact.getPoints());
        } else if (artifact.getType().equalsIgnoreCase("energy")) {
            this.setEnergyPoints(this.getEnergyPoints() + artifact.getPoints());
        }
    }
}
