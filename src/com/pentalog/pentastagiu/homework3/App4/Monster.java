package com.pentalog.pentastagiu.homework3.App4;

public class Monster extends Character{
    public Monster(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        super(name, healthPoints, energyPoints, positionX, positionY);
    }

    public void attack(Character character){
        if (character.healthPoints < 15){
            System.out.println("The character attacked is already dead!");
        }else if (calculateDistanceBetweenPoints(getPositionX(), getPositionY(), character.getPositionX(),
                character.getPositionY()) > 5)
        {
            System.out.println("Too far away!!");
        }
        else {
            if (character instanceof Human) {
                ((Human) character).healthPoints = healthPoints - 15;
            } else if (character instanceof Animal) {
                ((Animal) character).healthPoints = character.healthPoints - 15;
            }
            energyPoints -= 3;

        }
    }
}
