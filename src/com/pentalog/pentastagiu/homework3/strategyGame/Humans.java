package com.pentalog.pentastagiu.homework3.strategyGame;

public class Humans extends Character {
    private String type;
    public Humans(int x, int y, String name, int healthPoints, int energyPoints) {
        super(x, y, name, healthPoints, energyPoints);
        type="human";
        System.out.println(type+" was created with name "+name +" "+ healthPoints + " healthPoints "+energyPoints+" energyPoints");
        getPositionOnMap();
    }
}
