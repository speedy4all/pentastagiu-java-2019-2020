package com.pentalog.pentastagiu.homework3.problem4.character;

import com.pentalog.pentastagiu.homework3.problem4.artifact.Artifact;
import com.pentalog.pentastagiu.homework3.problem4.artifact.EnergyArtifact;
import com.pentalog.pentastagiu.homework3.problem4.artifact.HealthArtifact;

import java.util.Objects;


public class Monster extends Character implements ManagePoints, Attack {
    public Monster(String name, int healthPoint, int energyPoint, int xPosition, int yPosition){
        super(name, healthPoint, energyPoint, xPosition, yPosition);
    }

    @Override
    public void updatePoints(Artifact artifact) {
        Objects.requireNonNull(artifact, "Artifact can't be null!");
        if (artifact instanceof EnergyArtifact){
            energyPoints += artifact.getExtraPoints();
            System.out.println("Monster energy points after update : " + energyPoints);
        } else if(artifact instanceof HealthArtifact){
            healthPoints += artifact.getExtraPoints();
            System.out.println("Monster health points after update : " + healthPoints);
        }
    }

    @Override
    public void canAttack(Character character) {
        Objects.requireNonNull(character, "Character can't be null!");
        energyPoints -= 3;
        System.out.println("\tMonster energy points after attack: " + energyPoints);
        character.healthPoints -= 15;
        System.out.println("\t"+character.getName() + " health points after attack: " + character.healthPoints);
    }
}
