package com.pentalog.pentastagiu.homework3.StrategyGame;

public class Human extends Character implements Attack {
    public Human(String name, int xCharacterCoordinate, int yCharacterCoordinate, int numberOfEnergy, int numberOfHealth) {
        super(name, xCharacterCoordinate, yCharacterCoordinate, numberOfEnergy, numberOfHealth);
    }

    @Override
    public void Attack() {
        System.out.println("Human can attack");

    }
}
