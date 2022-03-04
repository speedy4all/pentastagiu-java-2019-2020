package com.pentalog.pentastagiu.homework3.problem4;

public class Human extends Character {

    public Human(String name, int healthPoints, int energyPoints, int xPosition, int yPosition, ArtifactType type) {
        super(name, healthPoints, energyPoints, xPosition, yPosition, type);
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getName() + " wants to attack " + character.getName());
        Integer xDistance = this.getxPosition() - character.getxPosition();
        Integer yDistance = this.getyPosition() - character.getyPosition();

        if (Math.abs(xDistance) <= 5 || Math.abs(yDistance) <= 5) {
            if (character.getHealthPoints() > 0) {
                decreasePoints(character);
                this.setxPosition(this.getxPosition() - xDistance);
                this.setyPosition(this.getyPosition() - yDistance);
                System.out.println("Attack SUCCESSFULL");
            } else {
                System.out.println("Character " + character.getName() + " is already dead");
            }
        } else {
            System.out.println("Character " + this.getName() + " is too far from " + character.getName() + " to attack");
        }
    }

    @Override
    public void decreasePoints(Character character) {
        character.setHealthPoints(character.getHealthPoints() - 10);
        this.energyPoints -= 5;
    }

}
