package com.pentalog.pentastagiu.homework3.strategyGame;

public class Monster extends Character {
    private String type;
    public Monster(int x, int y, String name, int healthPoints, int energyPoints, String type) {
        super(x, y, name, healthPoints, energyPoints);
        type="monster";
    }
}
