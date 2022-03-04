package com.pentalog.pentastagiu.homework3.game.characters;

public class Monster {
    private String name;
    private int healthPoints;
    private int energyPoints;
    private int xPosition;
    private int yPosition;

    public Monster(String name, int healthPoints, int energyPoints, int xPosition, int yPosition) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        System.out.println(toString());
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void getMonsterPosition(){
        System.out.println("Monster x position: " + getxPosition() + " monster y position: " + getyPosition());
    }

    public void updateMonster(int health, int energy){
        healthPoints += health;
        energyPoints += energy;
        System.out.println("New health points: " + healthPoints + " and new energy points: " +
                            energyPoints);
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
