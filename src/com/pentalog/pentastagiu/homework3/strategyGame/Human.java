package com.pentalog.pentastagiu.homework3.strategyGame;

public class Human extends Character{

    private Integer xPositionOnTheMap=0;
    private Integer yPositionOnTheMap=0;
    private String nameOfTheCharacter;



    public Human(String nameOfTheCharacter,Integer xPositionOnTheMap, Integer yPositionOnTheMap) {
        super();
        this.nameOfTheCharacter = nameOfTheCharacter;
        this.xPositionOnTheMap = xPositionOnTheMap;
        this.yPositionOnTheMap = yPositionOnTheMap;
    }



    public boolean verifyDistanceAttackPosition(Character character) {
        if(Math.abs(this.getxPositionOnTheMap()-character.getxPositionOnTheMap())<5 && Math.abs(this.getyPositionOnTheMap()-character.getyPositionOnTheMap())<5) {
            return true;
        }
        else
            return false;
    }


    public void humanAttack(Character character) {
        if(verifyDistanceAttackPosition(character)) {
            if(character instanceof Monster) {
                if(character.numberOfHealthPoints-9<=0) {
                    System.out.println("Character is already dead.  You can not attack him anymore!!");
                }else if(super.numberOfEnergyPoints<=0) {
                    System.out.println("You can not attack him anymore because you ran out of energy!!");
                }else {
                    super.numberOfEnergyPoints-=5;
                    character.numberOfHealthPoints-=10;
                    System.out.println("\nHUMAN ATTACKED THE MONSTER\n");
                }
            }else if(character instanceof Animal){
                if(character.numberOfHealthPoints-24<=0) {
                    System.out.println("Character is already dead.  You can not attack him anymore!!");
                }else if(super.numberOfEnergyPoints<=0) {
                    System.out.println("You can not attack him anymore because you ran out of energy!!");
                }else {
                    super.numberOfEnergyPoints-=1;
                    character.numberOfHealthPoints-=25;
                    System.out.println("\nHUMAN ATTACKED THE ANIMAL\n");
                }
            }
        }else {
            System.out.println("You can not attack this character because the distance between you and him is more than 5 meters");
        }
    }

    @Override
    public void getCharacterPosition(Integer xPosition, Integer yPosition) {
        System.out.println("Human x position: " + xPosition+ " | Human y position:  " + yPosition);
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