package com.pentalog.pentastagiu.week4.homework3.StrategyGame;

public class Character {

    public String name;
    public int healthPoints=50;
    public int energyPoints=20;

    public int xPosition;
    public int yPosition;

    public Character(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    public void moveUp(int steps){
        if (this.yPosition+steps<11){
            this.yPosition+=steps;
        }
        else{
            System.out.println("You cant't move up. You have reached the end of the map");
        }
    }

    public void moveDown(int steps){
        if (this.yPosition-steps>0){
            this.yPosition-=steps;
        }
        else{
            System.out.println("You cant't move down. You have reached the end of the map");
        }
    }

    public void moveLeft(int steps){
        if (this.xPosition-steps>0){
            this.xPosition-=steps;
        }
        else{
            System.out.println("You cant't move left. You have reached the end of the map");
        }
    }

    public void moveRight(int steps){
        if (this.xPosition+steps<11){
            this.xPosition+=steps;
        }
        else{
            System.out.println("You cant't move right. You have reached the end of the map");
        }

    }
}
