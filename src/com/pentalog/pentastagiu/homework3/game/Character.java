package com.pentalog.pentastagiu.homework3.game;

import java.util.Scanner;

public class Character{
    String nameOfTheCharacter;
    Integer numberOfHealthPoints=50;
    Integer numberOfEnergyPoints=20;
    private Integer  mapSize=10;
    private Integer mapEnd=0;
    Integer xPositionOnTheMap=0;
    Integer yPositionOnTheMap=0;
    Integer movingInMeters;
    Integer meters;

    public Character(){}

    public Character(String nameOfTheCharacter,Integer xPositionOnTheMap, Integer yPositionOnTheMap) {
        this.xPositionOnTheMap=xPositionOnTheMap;
        this.yPositionOnTheMap=yPositionOnTheMap;
        this.nameOfTheCharacter=nameOfTheCharacter;
    }


    public void pointsHealthLeft(String name, Integer points) {
        System.out.println("Character " + name + " has " + points +" health points left");
    }

    public void pointsEnergyLeft(String name, Integer points) {
        System.out.println("Character " + name + " has " + points +" energy points left");
    }

    public Integer movingUp(Integer yPositionOnTheMap,Integer meters) {
        if(yPositionOnTheMap-meters>=mapEnd) {
            Math.abs(yPositionOnTheMap-=meters);
            System.out.println("You moved " + meters + " meters up.");
        }else {
            System.out.println("You can't move up. You have reached the end of the map. ");
        }
        return yPositionOnTheMap;
    }

    public Integer movingDown(Integer yPositionOnTheMap,Integer meters) {
        if(yPositionOnTheMap+meters<=mapSize) {
            Math.abs(yPositionOnTheMap+=meters);
            System.out.println("You moved " + meters + " meters down.");
        }else {
            System.out.println("You can't move down. You have reached the end of the map. ");
        }
        return yPositionOnTheMap;
    }

    public Integer movingLeft(Integer xPositionOnTheMap,Integer meters) {
        if(xPositionOnTheMap-meters>=mapEnd) {
            Math.abs(xPositionOnTheMap-=meters);
            System.out.println("You moved " + meters + " meters left.");
        }else {
            System.out.println("You can't move left. You have reached the end of the map. ");
        }
        return xPositionOnTheMap;

    }

    public Integer movingRight(Integer xPositionOnTheMap,Integer meters) {
        if(xPositionOnTheMap+meters<=mapSize) {
            Math.abs(xPositionOnTheMap+=meters);
            System.out.println("You moved " + meters + " meters right.");
        }else {
            System.out.println("You can't move right. You have reached the end of the map. ");
        }
        return xPositionOnTheMap;
    }


    public void updateHealthEnergyPoints(Artifact artifact, Integer artifactXPosition, Integer artifactYPosition, Integer characterXPosition, Integer characterYPosition ) {
        if(artifactXPosition==characterXPosition && artifactYPosition==characterYPosition) {
            if(artifact instanceof HealthArtifact) {
                numberOfHealthPoints+=15;
                System.out.println("A 15 point HEALTH ARTIFACT was found. ");
            }else if(artifact instanceof EnergyArtifact) {
                numberOfEnergyPoints+=5;
                System.out.println("A 5 point ENERGY ARTIFACT was found ");
            }
        }
    }

    public void chooseWhereToMove(Integer userOption,Character character ) {
        Scanner scan=new Scanner(System.in);
        switch(userOption) {
            case 1:
                System.out.println("Enter how much you want to move UP in meters");
                meters=scan.nextInt();
                movingInMeters=movingUp(character.getyPositionOnTheMap(),meters);
                character.setyPositionOnTheMap(movingInMeters);
                character.getCharacterPosition(character.getxPositionOnTheMap(), character.getyPositionOnTheMap());
                break;
            case 2:
                System.out.println("Enter how much you want to move DOWN in meters");
                meters=scan.nextInt();
                movingInMeters=character.movingDown(character.getyPositionOnTheMap(),meters);
                character.setyPositionOnTheMap(movingInMeters);
                character.getCharacterPosition(character.getxPositionOnTheMap(), character.getyPositionOnTheMap());
                break;
            case 3:
                System.out.println("Enter how much you want to move LEFT in meters");
                meters=scan.nextInt();
                movingInMeters=character.movingLeft(character.getxPositionOnTheMap(),meters);
                character.setxPositionOnTheMap(movingInMeters);
                character.getCharacterPosition(character.getxPositionOnTheMap(), character.getyPositionOnTheMap());
                break;
            case 4:
                System.out.println("Enter how much you want to move RIGHT in meters");
                meters=scan.nextInt();
                movingInMeters=character.movingRight(character.getxPositionOnTheMap(),meters);
                character.setxPositionOnTheMap(movingInMeters);
                character.getCharacterPosition(character.getxPositionOnTheMap(), character.getyPositionOnTheMap());


                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public void getCharacterPosition(Integer xPosition, Integer yPosition) {
        System.out.println();
    }
    //getters and setters
    public String getNameOfTheCharacter() {
        return nameOfTheCharacter;
    }
    public void setNameOfTheCharacter(String nameOfTheCharacter) {
        this.nameOfTheCharacter = nameOfTheCharacter;
    }

    public Integer getNumberOfHealthPoints() {
        return numberOfHealthPoints;
    }

    public void setNumberOfHealthPoints(Integer numberOfHealthPoints) {
        this.numberOfHealthPoints = numberOfHealthPoints;
    }

    public Integer getNumberOfEnergyPoints() {
        return numberOfEnergyPoints;
    }

    public void setNumberOfEnergyPoints(Integer numberOfEnergyPoints) {
        this.numberOfEnergyPoints = numberOfEnergyPoints;
    }


    public Integer getMapSize() {
        return mapSize;
    }

    public void setMapSize(Integer mapSize) {
        this.mapSize = mapSize;
    }

    public Integer getMapEnd() {
        return mapEnd;
    }

    public void setMapEnd(Integer mapEnd) {
        this.mapEnd = mapEnd;
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

}
