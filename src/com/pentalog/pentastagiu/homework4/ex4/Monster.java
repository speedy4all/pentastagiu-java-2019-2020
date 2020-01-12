package com.pentalog.pentastagiu.homework4.ex4;

public class Monster extends Character {

    public Monster(String name, double healthPoints, double energyPoints, Position mapPosition) {
        super(name, healthPoints, energyPoints, mapPosition);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void atack(Character character) {
        if(this.energyPoints > 3) {
            this.energyPoints -= 3;
            System.out.println(this.name + " atacks " + character.name);
            if(character.healthPoints > 15) {
                character.healthPoints -=15;
            }else {
                System.out.println(character.name + " died!");
            }
        }else {
            System.out.println(this.name + " can't atack! Insufficient energy points!");
        }

    }
}
