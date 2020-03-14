package com.pentalog.pentastagiu.homework3.App4;

public class Human extends Character {

    public Human(String name, int healthPoints, int energyPoints, int positionX, int positionY) {
        super(name, healthPoints, energyPoints, positionX, positionY);
    }


    public void attack(Character character){
        if (character.healthPoints < 10){
            System.out.println("The character attacked is already dead!");
        }else if (calculateDistanceBetweenPoints(getPositionX(), getPositionY(), character.getPositionX(),
                character.getPositionY()) > 5)
        {
            System.out.println("Too far away!!");
        }
        else {
            if (character instanceof Monster) {
                ((Monster) character).healthPoints = healthPoints - 10;
            } else if (character instanceof Animal) {
                ((Animal) character).healthPoints = character.healthPoints - 10;
            }
            energyPoints -= 5;

        }
    }
}
