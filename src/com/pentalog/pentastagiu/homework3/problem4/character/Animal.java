package com.pentalog.pentastagiu.homework3.problem4.character;

import com.pentalog.pentastagiu.homework3.problem4.artifact.Artifact;
import com.pentalog.pentastagiu.homework3.problem4.artifact.EnergyArtifact;
import com.pentalog.pentastagiu.homework3.problem4.artifact.HealthArtifact;

public class Animal extends Character implements ManagePoints {

    public Animal(String name, int healthPoint, int energyPoint, int xPosition, int yPosition){
        super(name, healthPoint, energyPoint, xPosition, yPosition);
    }

    @Override
    public void updatePoints(Artifact artifact) {
        if (artifact instanceof EnergyArtifact){
            energyPoints += artifact.getExtraPoints();
            System.out.println("Animal energy points after update : " + energyPoints);
        } else if(artifact instanceof HealthArtifact){
            healthPoints += artifact.getExtraPoints();
            System.out.println("Animal health points after update : " + healthPoints);
        }
    }
}
