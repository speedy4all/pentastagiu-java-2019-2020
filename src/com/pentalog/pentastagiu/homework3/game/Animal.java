package com.pentalog.pentastagiu.homework3.game;

public class Animal extends Character {
    public final static int distance = 2;

    public Animal(CharacterType characterType, String name, int posX, int posY) {
        super(characterType, name, posX, posY);
        setHealthPoints(50);
        setEnergyPoints(20);
    }

}
