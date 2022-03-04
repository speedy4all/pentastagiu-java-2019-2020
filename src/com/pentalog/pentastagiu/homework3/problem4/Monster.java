package com.pentalog.pentastagiu.homework3.problem4;

public class Monster extends Character {

    public Monster(String name, int healthPoints, int energyPoints, int xPosition, int yPosition, ArtifactType type) {
        super(name, healthPoints, energyPoints, xPosition, yPosition, type);
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.getName() + " wants to attack " + character.getName());

        Integer xDistance = this.getxPosition() - character.getxPosition();
        Integer yDistance = this.getyPosition() - character.getyPosition();

        if (Math.abs(xDistance) <= 5 || Math.abs(yDistance) <= 5) {
            decreasePoints(character);
            this.setxPosition(this.getxPosition() - xDistance);
            this.setyPosition(this.getyPosition() - yDistance);
        } else {
            System.out.println("Character " + this.getName() + " is too far from " + character.getName() +" to attack");
        }
    }

    public void decreasePoints(Character character) {
        this.energyPoints -= 3;
        character.energyPoints -= 15;
    }
}
