package com.pentalog.pentastagiu.homework4.ex4;

public class Human extends Character {

    public Human(String name, double healthPoints, double energyPoints, Position mapPosition) {
        super(name, healthPoints, energyPoints, mapPosition);
    }

    @Override
    public void atack(Character character) {
        if (this.energyPoints > 5) {
            this.energyPoints -= 5;
            System.out.println(this.name + " atacks " + character.name);
            if (character.healthPoints > 10) {
                character.healthPoints -= 10;
            } else {
                System.out.println(character.name + " died!");
            }
        } else {
            System.out.println(this.name + " can't atack! Insufficient energy points!");
        }


    }
}
