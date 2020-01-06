package com.pentalog.pentastagiu.homework3.game.characters;

public class Human {
    private String name;
    private int healthPoints;
    private int energyPoints;
    private int xPosition;
    private int yPosition;

    public Human(){

    }

    public Human(String name, int healthPoints, int energyPoints, int xPosition, int yPosition) {
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

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void getHumanPosition(){
        System.out.println("Human x position: " + getxPosition() + " human y position" + getyPosition());
    }

    public void updateHuman(int health, int energy){
        healthPoints += health;
        energyPoints += energy;
        System.out.println("New health points: " + healthPoints + " and new energy points: " +
                energyPoints);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
