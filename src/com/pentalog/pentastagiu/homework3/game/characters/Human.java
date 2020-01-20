package com.pentalog.pentastagiu.homework3.game.characters;

import static com.pentalog.pentastagiu.homework3.game.Constants.*;

public class Human extends Character implements Move {
    private String name;
    private int health;
    private int energy;
    private int x;
    private int y;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public Human(String name, int health, int energy, int x, int y) {
        super(name, health, energy, x, y);
        if (x < MAP_X && y < MAP_Y && Map.myMap[x][y] == 0) {
            this.name = name;
            this.health = health;
            this.energy = energy;
            this.x = x;
            this.y = y;
            Map.myMap[this.getX()][this.getY()] = 1;
        } else {
            System.out.println("Bad value for x and y - human");
        }
    }

    @Override
    public void attack(Character character) {
        int deltaX = Math.abs(this.getX() - character.getX());
        int deltaY = Math.abs(this.getY() - character.getY());
        if (deltaX < DELTA && deltaY < DELTA) {
            if (this.getEnergy() > MIN_ENERGY) {
                if (character.getHealth() > 0) {
                    this.setEnergy(getEnergy() - HUMAN_DAMAGE_ENERGY);
                    if (character.getHealth() > HUMAN_DAMAGE_HEALTH) {
                        character.setHealth(character.getHealth() - HUMAN_DAMAGE_HEALTH);
                    } else {
                        character.setHealth(0);
                    }
                } else {
                    System.out.println("The Character is Death !!!");
                }
            } else {
                System.out.println("You don't have energy!!!");
            }
        } else {
            System.out.println("The character is too far!!!");
        }
    }
}
