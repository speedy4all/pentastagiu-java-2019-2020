package com.pentalog.pentastagiu.homework3.StrategyGame;

public class Application {
    public static void main(String[] args) {
        Human firstHuman = new Human("George", 2, 4, 20, 50);
        Monster firstMonster = new Monster("Varcolac", 4, 2, 20, 50);
        Animal firstAnimal = new Animal("Lup", 3, 1, 20, 50);
        Artifact firstHealth = new HealthArtifact(4, 2);
        Artifact firstEnergy = new EnergyArtifact(5, 1);
        if (Math.sqrt(Math.pow(firstHuman.getxCharacterCoordinate() - firstAnimal.getxCharacterCoordinate(), 2) + Math.pow(firstHuman.getyCharacterCoordinate() - firstAnimal.getyCharacterCoordinate(), 2)) < 5) {
            if (firstAnimal.getNumberOfHealth() > 10) {
                firstHuman.HumanAttack(firstHuman);
                firstAnimal.AnimalAttacked(firstAnimal, 0);
                System.out.println("Human attacked Animal, Human energy is now  " + firstHuman.getNumberOfEnergy() + " Animal health is now " + firstAnimal.getNumberOfHealth());
            } else {
                System.out.println("Human killed Animal");
            }
        } else {
            System.out.println("The animal is to far");
        }
        if (Math.sqrt(Math.pow(firstHuman.getxCharacterCoordinate() - firstMonster.getxCharacterCoordinate(), 2) + Math.pow(firstHuman.getyCharacterCoordinate() - firstMonster.getyCharacterCoordinate(), 2)) < 5) {
            if (firstMonster.getNumberOfHealth() > 10) {
                firstHuman.HumanAttack(firstHuman);
                firstMonster.MonsterAttacked(firstMonster);
                System.out.println("Human attacked Monster, Human energy is now  " + firstHuman.getNumberOfEnergy() + " Monster health is now " + firstMonster.getNumberOfHealth());
            } else {
                System.out.println("Human killed Monster");

            }
        } else {
            System.out.println("The monster is to far");
        }
        if (Math.sqrt(Math.pow(firstHuman.getxCharacterCoordinate() - firstMonster.getxCharacterCoordinate(), 2) + Math.pow(firstHuman.getyCharacterCoordinate() - firstMonster.getyCharacterCoordinate(), 2)) < 5) {
            if (firstHuman.getNumberOfHealth() > 15) {
                firstMonster.MonsterAttack(firstMonster);
                firstHuman.HumanAttacked(firstHuman);
                System.out.println("Monster attacked Human, Monster energy is now  " + firstMonster.getNumberOfEnergy() + " Human health is now " + firstHuman.getNumberOfHealth());
            } else {
                System.out.println("Monster killed Human");

            }
        } else {
            System.out.println("The human is to far");
        }
        if(Math.sqrt(Math.pow(firstHuman.getxCharacterCoordinate()-firstHealth.getxArtifactCoordonate(),2)+Math.pow(firstHuman.getyCharacterCoordinate()-firstHealth.getyArtifactCoordonate(),2))<5)
        {

               firstHuman.ChangeHealth();
                System.out.println("Human used Health artifact, the Human health is now " + firstHuman.getNumberOfHealth());
            }

        else
        {
            System.out.println("The artifact is to far");
        }

    }
}
