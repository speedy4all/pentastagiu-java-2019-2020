package com.pentalog.pentastagiu.homework3.StrategyGame;

public class Monster extends Character implements Attack {
    public Monster(String name, int xCharacterCoordinate, int yCharacterCoordinate, int numberOfEnergy, int numberOfHealth) {
        super(name, xCharacterCoordinate, yCharacterCoordinate, numberOfEnergy, numberOfHealth);
    }

    public void Attack(){
        System.out.println("Monster can attack");
    }
}
