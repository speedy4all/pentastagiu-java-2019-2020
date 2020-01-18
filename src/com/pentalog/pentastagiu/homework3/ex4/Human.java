package com.pentalog.pentastagiu.homework3.ex4;

public class Human extends Character {

    public Human(String name, int healthPoints, int energyPoints) {
        super(name, healthPoints, energyPoints);
    }
    public void attack(Character character) {
        if(energyPoints>5 && distance <5) {
            energyPoints = energyPoints - 5;
            character.healthPoints = healthPoints - 10;

        } else {
            System.out.println("Not enough energy points or distance too big!");
        }
    }
}