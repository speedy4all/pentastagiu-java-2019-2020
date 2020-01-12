package com.pentalog.pentastagiu.homework3.StrategyGame;

public class Animal extends Character implements Attack {
    public Animal(String name, int xCharacterCoordinate, int yCharacterCoordinate, int numberOfEnergy, int numberOfHealth) {
        super(name, xCharacterCoordinate, yCharacterCoordinate, numberOfEnergy, numberOfHealth);
    }

    public void Attack(){
        System.out.println("Animal can't attack");
    }

}
