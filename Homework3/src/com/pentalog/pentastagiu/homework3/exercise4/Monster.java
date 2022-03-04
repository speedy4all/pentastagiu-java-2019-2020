package com.pentalog.pentastagiu.homework3.exercise4;

public class Monster extends Character {

    public Monster(String name, double energyPoints, double healthPoints) {
        super(name, energyPoints, healthPoints);
    }

    public void attack(Character character){
        if(energyPoints > 0){
            energyPoints -= 3;
            character.healthPoints -= 15;
        }
        else{
            System.out.println(name + " can't attack!There aren't enough energy points!");
        }
    }
}
