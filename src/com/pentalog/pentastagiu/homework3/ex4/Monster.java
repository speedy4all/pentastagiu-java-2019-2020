package com.pentalog.pentastagiu.homework3.ex4;

public class Monster extends Character {
    public Monster(String name, int healthPoints, int energyPoints) {
        super(name, healthPoints, energyPoints);
    }
    public void attack(Character character) {
        if(energyPoints>3) {
            energyPoints=energyPoints-3;
            character.healthPoints=healthPoints-15;
        } else
            System.out.println("Not enough energy points!");
    }
}
