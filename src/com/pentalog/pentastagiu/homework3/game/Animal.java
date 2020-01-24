package com.pentalog.pentastagiu.homework3.game;

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

    @Override
    public Integer getxPositionOnTheMap() {
        return xPositionOnTheMap;
    }

    @Override
    public void setxPositionOnTheMap(Integer xPositionOnTheMap) {
        this.xPositionOnTheMap = xPositionOnTheMap;
    }

    @Override
    public Integer getyPositionOnTheMap() {
        return yPositionOnTheMap;
    }

    @Override
    public void setyPositionOnTheMap(Integer yPositionOnTheMap) {
        this.yPositionOnTheMap = yPositionOnTheMap;
    }

    @Override
    public String getNameOfTheCharacter() {
        return nameOfTheCharacter;
    }

    @Override
    public void setNameOfTheCharacter(String nameOfTheCharacter) {
        this.nameOfTheCharacter = nameOfTheCharacter;
    }
}
