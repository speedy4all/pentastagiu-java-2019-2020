package com.pentalog.pentastagiu.homework3.problem4;

public class Animal extends Character {

    public Animal(String name, int healthPoints, int energyPoints, int xPosition, int yPosition, ArtifactType type) {
        super(name, healthPoints, energyPoints, xPosition, yPosition, type);
    }

    @Override
    public void attack(Character character) {

    }

    @Override
    public void decreasePoints(Character character) {

    }

    public void beHuman(){
        System.out.println("I am a cool animal...");
    }


}
