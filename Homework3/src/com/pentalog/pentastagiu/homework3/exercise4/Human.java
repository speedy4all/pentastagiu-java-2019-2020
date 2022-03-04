package com.pentalog.pentastagiu.homework3.exercise4;

public class Human extends Character {


    public Human(String name, double energyPoints, double healthPoints) {
        super(name, energyPoints, healthPoints);
    }

    public void attack(Character character) {
        if (energyPoints > 0 && distance < 5) {
            energyPoints -= 5;
            character.healthPoints -= 10;
        } else {
            System.out.println(name + " can't attack!There aren't enough energy points or the distance is too big!");
        }
    }
}
