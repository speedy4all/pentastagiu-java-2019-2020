package com.pentalog.pentastagiu.homework3;

import java.util.ArrayList;
import java.util.List;

public class HumanCharacter extends Character {
    private List<Artifact> artifactList = new ArrayList<>();
    private int healthArtifactsNo;
    private int energyArtifactsNo;

    public HumanCharacter(String name, int healthPoints, int energyPoints, int xPosition, int yPosition) {
        super(name, healthPoints, energyPoints, xPosition, yPosition);
    }

    public int getDistanceToMonster(MonsterCharacter character) {
        return (int) Math.sqrt((Math.abs(character.getxPosition()-this.getxPosition()))*(Math.abs(character.getxPosition()-this.getxPosition()))
                +(Math.abs(character.getyPosition()-this.getyPosition()))*(Math.abs(character.getyPosition()-this.getyPosition())));
    }

    public boolean canGetArtifact(Artifact artifact) {
        return this.getxPosition()-artifact.getxPosition()==0 && this.getyPosition()-artifact.getyPosition()==0;
    }

    public void addArtifact(Artifact artifact) {
        this.artifactList.add(artifact);
        if(artifact instanceof EnergyArtifact)
            this.energyArtifactsNo++;
        else
            this.healthArtifactsNo++;
    }

    public int useHealthArtifact() {
        for(Artifact artifact : artifactList) {
            if(artifact instanceof HealthArtifact) {
                artifactList.remove(artifact);
                this.healthArtifactsNo--;
                return artifact.getPoints();
            }
        }
        return 0;
    }

    public int useEnergyArtifact() {
        for(Artifact artifact : artifactList) {
            if(artifact instanceof EnergyArtifact) {
                artifactList.remove(artifact);
                this.energyArtifactsNo--;
                return artifact.getPoints();
            }
        }
        return 0;
    }

    public int getHealthArtifactsNo() {
        return healthArtifactsNo;
    }

    public int getEnergyArtifactsNo() {
        return energyArtifactsNo;
    }
}
