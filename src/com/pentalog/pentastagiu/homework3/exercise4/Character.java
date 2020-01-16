package com.pentalog.pentastagiu.homework3.exercise4;

public abstract class Character {
    private int x;
    private int y;
    private String name;
    private int healthPoints;
    private int energyPoints;

    public Character(int x, int y, String name, int healthPoints, int energyPoints) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
    }

    public abstract void attack(Character character);

    public void useArtifact(Artifact artifact) {
        if (ArtifactType.HEALTH.equals(artifact.getType())) {
            healthPoints += artifact.use();
        } else if (ArtifactType.ENERGY.equals(artifact.getType())) {
            energyPoints += artifact.use();
        }
        System.out.println("Use artifact");
        System.out.println(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void loseHealth(int amount) {
        if (isAlive() && amount > 0) {
            healthPoints -= amount;
        }
        if (!isAlive()) {
            System.out.println("The character is dead");
        } else {
            System.out.println(this);
        }
    }

    public void wasteEnergy(int amount) {
        if (amount > 0) {
            energyPoints -= amount;
        }
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                '}';
    }
}
