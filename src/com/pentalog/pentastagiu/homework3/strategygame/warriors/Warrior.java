package com.pentalog.pentastagiu.homework3.strategygame.warriors;

import com.pentalog.pentastagiu.homework3.exceptions.WarriorIllegalArgument;
import com.pentalog.pentastagiu.homework3.strategygame.MapPoint;
import com.pentalog.pentastagiu.homework3.strategygame.artifacts.Artifact;
import com.pentalog.pentastagiu.homework3.strategygame.artifacts.artifacttypes.ArtifactType;
import com.pentalog.pentastagiu.homework3.strategygame.warriors.warriorsType.WarriorType;

public class Warrior {
    private String name;
    private WarriorType warriorType;
    private int healthPoints;
    private int energyPoints;
    private MapPoint mapPoint;
    private boolean canAttack;

    public Warrior(String name, WarriorType warriorType, MapPoint mapPoint) {
        if (name == null || warriorType == null || mapPoint == null) {
            throw new WarriorIllegalArgument("Name, warrior type or map point can't be null");
        }
        this.name = name;
        this.warriorType = warriorType;
        this.mapPoint = mapPoint;
        this.healthPoints = 50;
        this.energyPoints = 20;
        if (warriorType == WarriorType.ANIMAL) {
            canAttack = false;
        } else {
            canAttack = true;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WarriorType getWarriorType() {
        return warriorType;
    }

    public void setWarriorType(WarriorType warriorType) {
        this.warriorType = warriorType;
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

    public MapPoint getMapPoint() {
        return mapPoint;
    }

    public void setMapPoint(MapPoint mapPoint) {
        this.mapPoint = mapPoint;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    public void consumeArtifact(Artifact artifact) {
        if (healthPoints < 0) {
            System.out.println("Caracterul nu poate consuma un artefact pentru ca nu mai este in viata.");
        }
        if (artifact.getArtifactType() == ArtifactType.ENERGY) {
            this.energyPoints += artifact.getExtraPoints();
        } else {
            this.healthPoints += artifact.getExtraPoints();
        }
    }

    public void attack(Warrior warrior) {
        if (!canAttack) {
            System.out.println("Caracterul nu poate ataca");
        }
        if (warrior.healthPoints < 0) {
            System.out.println("Caracterul atacat nu mai traieste!");
        }
        if (Math.abs(mapPoint.getColumnPosition() - warrior.mapPoint.getColumnPosition()) < 5 || Math.abs(mapPoint.getLinePosition() - warrior.mapPoint.getLinePosition()) < 4) {
            if (warriorType == WarriorType.HUMAN) {
                if (energyPoints - 5 < 0) {
                    System.out.println("Nu ai suficienta energie pentru a ataca");
                } else {
                    energyPoints -= 5;
                    warrior.setHealthPoints(warrior.healthPoints - 10);
                }
            } else {
                if (energyPoints - 3 < 0) {
                    System.out.println("Nu ai suficienta energie pentru a ataca");
                } else {
                    energyPoints -= 3;
                    warrior.setHealthPoints(warrior.healthPoints - 15);
                }
            }
        } else {
            System.out.println("Caracterul este prea departe pentru a fi atacat");
        }


    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object otherWarrior) {
        if (otherWarrior == null) {
            return false;
        }
        if (otherWarrior instanceof Warrior) {
            return ((Warrior) otherWarrior).name.equals(name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", warriorType=" + warriorType +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                ", mapPoint=" + mapPoint +
                '}';
    }
}
