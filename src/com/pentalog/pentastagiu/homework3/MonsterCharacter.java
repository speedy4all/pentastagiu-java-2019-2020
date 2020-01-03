package com.pentalog.pentastagiu.homework3;

public class MonsterCharacter extends Character{
    static int MONSTER_NO;

    public MonsterCharacter(String name, int healthPoints, int energyPoints, int xPosition, int yPosition) {
        super(name, healthPoints, energyPoints, xPosition, yPosition);
        MONSTER_NO++;
    }
}
