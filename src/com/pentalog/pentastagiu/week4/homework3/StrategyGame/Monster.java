package com.pentalog.pentastagiu.week4.homework3.StrategyGame;

public class Monster extends Character {
    boolean abilityToAttack=true;

    public Monster(String name, int xPosition, int yPosition) {
        super(name, xPosition, yPosition);
    }


    private boolean verifyPosition(Character character){
        if (Math.abs(this.xPosition-character.xPosition)<5 && Math.abs(this.yPosition-character.yPosition)<5){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean verifyPosition(Artifacts artifact){
        if (Math.abs(this.xPosition-artifact.xPosition)<5 && Math.abs(this.yPosition-artifact.yPosition)<5){
            return true;
        }
        else {
            return false;
        }
    }

    public void getArtifact(Artifacts artifact){
        if (verifyPosition(artifact)) {
            if (artifact instanceof HealthArtifact){
                this.healthPoints+=((HealthArtifact) artifact).healthPoints;
            }
            else {
                this.energyPoints+=((EnergyArtifact) artifact).energyPoints;
            }
        }
        else{
            System.out.println("Artifact is too far to reach");
        }

    }

    public void attack(Character character){
        if (verifyPosition(character)) {
            if (this.energyPoints == 0 || this.energyPoints < 0) {
                System.out.println("You don't have enough energy to attack");
            } else {
                if (character.healthPoints == 0 || character.healthPoints < 0) {
                    System.out.println("Character is already dead!");
                } else {
                    this.energyPoints -= 3;
                    character.healthPoints -= 15;
                }
            }
        }
        else{
            System.out.println("Character is too far to attack");
        }
    }

    @Override
    public void moveUp(int steps) {
        super.moveUp(steps);
    }

    @Override
    public void moveDown(int steps) {
        super.moveDown(steps);
    }

    @Override
    public void moveLeft(int steps) {
        super.moveLeft(steps);
    }

    @Override
    public void moveRight(int steps) {
        super.moveRight(steps);
    }
}
