package com.pentalog.pentastagiu.homework4.game.characters;

import static com.pentalog.pentastagiu.homework4.game.Constants.*;

public class Character implements Move, Attack {
    private String name;
    private int health;
    private int energy;
    private int x;
    private int y;
    public static int[][] myMap = new int[MAP_X][MAP_Y];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Character(String name, int health, int energy, int x, int y) {
        if (x <= MAP_X && y <= MAP_Y && Map.myMap[x][y] == 0) {
            this.name = name;
            this.health = health;
            this.energy = energy;
            this.x = x;
            this.y = y;
            Map.myMap[this.getX()][this.getY()] = 1;
        } else {
            System.out.println("Bad value for x and y -character");
        }
    }

    public void move(int x1, int y1) {
        if ((this.getX() + x1) < MAP_X && (this.getY() + y1) < MAP_Y) {
            if (Map.myMap[this.getX() + x1][this.getY() + y1] != 1) {
                Map.myMap[this.getX()][this.getY()] = 0;

                if (Map.myMap[this.getX() + x1][this.getY() + y1] == 2) {
                    this.setHealth(this.getHealth() + ADD_HEALTH);
                }
                if (Map.myMap[this.getX() + x1][this.getY() + y1] == 3){
                    this.setEnergy(this.getEnergy() + ADD_ENERGY);
                }
                this.setX(this.getX() + x1);
                this.setY(this.getY() + y1);
                Map.myMap[this.getX()][this.getY()] = 1;

            } else {
                System.out.println("In this place exist another character");
            }
        } else {
            System.out.println("You can't move in outside of the map");
        }
    }

    @Override
    public void attack(Character character) {
        int deltaX = Math.abs(this.getX() - character.getX());
        int deltaY = Math.abs(this.getY() - character.getY());
        if (deltaX < DELTA && deltaY < DELTA) {
            if (this.getEnergy() > MIN_ENERGY) {
                if (character.getHealth() > 0) {
                    this.setEnergy(getEnergy() - CHARACTER_DAMAGE_ENERGY);
                    if (character.getHealth() > CHARACTER_DAMAGE_HEALTH) {
                        character.setHealth(character.getHealth() - CHARACTER_DAMAGE_HEALTH);
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


    @Override
    public String toString() {
        return "Name: " + this.name + " health: " + this.getHealth() + " energy: " + getEnergy() + " x: " + getX() + " y: " + getY();
    }
}

