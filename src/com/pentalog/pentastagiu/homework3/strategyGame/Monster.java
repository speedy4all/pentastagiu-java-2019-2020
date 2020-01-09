package com.pentalog.pentastagiu.homework3.strategyGame;

public class Monster extends Character{


    private Integer xPositionOnTheMap=0;
    private Integer yPositionOnTheMap=0;
    private String nameOfTheCharacter;



    public Monster(String nameOfTheCharacter, Integer xPositionOnTheMap, Integer yPositionOnTheMap) {
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

    public void monsterAttack(Character character) {
        if(verifyDistanceAttackPosition(character)) {
            if(character.getNumberOfHealthPoints()-14<=0) {
                System.out.println("Character is already dead. You can not attack him anymore!!");
            }else if(super.numberOfEnergyPoints<=0) {
                System.out.println("You can not attack him anymore because you ran out of energy!!");
            }else{
                super.numberOfEnergyPoints-=3;
                character.numberOfHealthPoints-=15;
                System.out.println("\nMONSTER ATTACKED THE HUMAN\n");
            }
        }else {
            System.out.println("You can not attack this character because the distance between you and him is more than 5 meters");
        }
    }

    @Override
    public void getCharacterPosition(Integer xPosition, Integer yPosition) {
        System.out.println("Monster x position: " + xPosition + " | Monster y position:  " + yPosition);
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