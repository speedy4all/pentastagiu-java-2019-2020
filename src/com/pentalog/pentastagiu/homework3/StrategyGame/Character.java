package com.pentalog.pentastagiu.homework3.StrategyGame;

public class Character {
    private String Name;
    private int xCharacterCoordinate;
    private int yCharacterCoordinate;
    private int numberOfEnergy;
    private int numberOfHealth;

    public Character(){

    }

    public Character(String name, int xCharacterCoordinate, int yCharacterCoordinate, int numberOfEnergy, int numberOfHealth) {
        Name = name;
        this.xCharacterCoordinate = xCharacterCoordinate;
        this.yCharacterCoordinate = yCharacterCoordinate;
        this.numberOfEnergy = numberOfEnergy;
        this.numberOfHealth = numberOfHealth;
    }
    public void HumanAttack(Human human)
    {
        this.numberOfEnergy-=5;
    }
    public void MonsterAttack(Monster monster){
        this.numberOfEnergy-=3;
    }
    public void HumanAttacked(Human human){
        this.numberOfHealth-=15;
    }
    public void AnimalAttacked(Animal animal, int whoAttacked)
    {
        if(whoAttacked==0)
        {
            this.numberOfHealth-=10;
        }
        else
        {
            this.numberOfHealth-=15;
        }
    }
    public void MonsterAttacked(Monster monster)
    {
        this.numberOfHealth-=10;
    }


    public void ChangeHealth()
    {
        this.numberOfHealth+=10;
    }
    public void ChangeEnergy(EnergyArtifact artifact, int numberOfEnergy)
    {
        this.numberOfEnergy+=5;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getxCharacterCoordinate() {
        return xCharacterCoordinate;
    }

    public void setxCharacterCoordinate(int xCharacterCoordinate) {
        this.xCharacterCoordinate = xCharacterCoordinate;
    }

    public int getyCharacterCoordinate() {
        return yCharacterCoordinate;
    }

    public void setyCharacterCoordinate(int yCharacterCoordinate) {
        this.yCharacterCoordinate = yCharacterCoordinate;
    }

    public int getNumberOfEnergy() {
        return numberOfEnergy;
    }

    public void setNumberOfEnergy(int numberOfEnergy) {
        this.numberOfEnergy = numberOfEnergy;
    }

    public int getNumberOfHealth() {
        return numberOfHealth;
    }

    public void setNumberOfHealth(int numberOfHealth) {
        this.numberOfHealth = numberOfHealth;
    }
}
