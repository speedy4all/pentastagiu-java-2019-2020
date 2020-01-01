package com.pentalog.pentastagiu.homework3.strategyGame;

public class Character extends Items {


    private String name;

    public Character(int x, int y, int healthPoint, int energyPoint, String name) {
        super(x, y, healthPoint, energyPoint);
        this.name = name;
    }
}
