package com.pentalog.pentastagiu.homework3.strategyGame;

public class Animal extends Character {


    private Integer xPositionOnTheMap = 0;
    private Integer yPositionOnTheMap = 0;
    private String nameOfTheCharacter;


    public Animal(String nameOfTheCharacter, Integer xPositionOnTheMap, Integer yPositionOnTheMap) {
        super();
        this.xPositionOnTheMap = xPositionOnTheMap;
        this.yPositionOnTheMap = yPositionOnTheMap;
        this.nameOfTheCharacter = nameOfTheCharacter;
    }


    @Override
    public void getCharacterPosition(Integer xPosition, Integer yPosition) {
        System.out.println("Animal x position: " + xPosition + " | Animal y position  " + yPosition);
    }

    public Integer getxPositionOnTheMap() {
        return xPositionOnTheMap;
    }

    public void setxPositionOnTheMap(Integer xPositionOnTheMap) {
        this.xPositionOnTheMap = xPositionOnTheMap;
    }

    public Integer getyPositionOnTheMap() {
        return yPositionOnTheMap;
    }

    public void setyPositionOnTheMap(Integer yPositionOnTheMap) {
        this.yPositionOnTheMap = yPositionOnTheMap;
    }

    public String getNameOfTheCharacter() {
        return nameOfTheCharacter;
    }

    public void setNameOfTheCharacter(String nameOfTheCharacter) {
        this.nameOfTheCharacter = nameOfTheCharacter;
    }
}
