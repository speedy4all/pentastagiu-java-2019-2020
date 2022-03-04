package com.pentalog.pentastagiu.homework3.problem4;

public abstract class Character {

    String name;
    int healthPoints;
    int energyPoints;
    Integer xPosition;
    Integer yPosition;

    public Character(String name, int healthPoints, int energyPoints, Integer xPosition, Integer yPosition, ArtifactType type) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArtifactType getType() {
        return type;
    }

    public void setType(ArtifactType type) {
        this.type = type;
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public void setxPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public void setyPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    ArtifactType type;
    public void increasePoints(Artifacts artifact){
        switch (type){
            case ENERGY:this.energyPoints += artifact.getExtrapoints();
            break;
            case HEALTH: this.healthPoints += artifact.getExtrapoints();
        }
    }

    public String displayStatus(Character character){
        return "Character " + character.getName() + " -> " + "(Health:" + character.getHealthPoints() + ", Energy:" + character.getEnergyPoints()
                +")... POSITION -(X:" + character.getxPosition() + ", Y:" + character.getyPosition() + ")";
    }
    public abstract void attack(Character character);

    public abstract void decreasePoints(Character character);

}
