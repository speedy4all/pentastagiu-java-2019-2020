package com.pentalog.pentastagiu.homework3.exercise4;

public class Monster extends Character {
    public Monster(int x, int y, String name, int healthPoints, int energyPoints) {
        super(x, y, name, healthPoints, energyPoints);
    }

    @Override
    public void attack(Character character) {
        System.out.println(getName() + " attacked " + character.getName());
        wasteEnergy(3);
        character.loseHealth(15);
    }
}
