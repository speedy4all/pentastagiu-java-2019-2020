package com.pentalog.pentastagiu.homework3.ex4;

public class Main {
    public static void main(String[] args) {
        Human human =new Human ("Ryan", 20, 50);
        Monster monster=new Monster("Groover", 20,50);
        Animal animal=new Animal("Rexie",20,50);
        HealthArtifact healthArtifact=new HealthArtifact(12);
        EnergyArtifact energyArtifact=new EnergyArtifact(17);


        human.setPosition(0,4);
        monster.setPosition(4,6);
        animal.setPosition(4,2);

        human.verifyDistance(human, animal);
        monster.verifyDistance(monster,human);
        human.verifyDistance(human,monster);
        monster.verifyDistance(monster,animal);


        monster.attack(human);
        human.attack(monster);
        human.attack(monster);
        human.attack(monster);
        human.getExtraPoints(healthArtifact);
        monster.getExtraPoints(energyArtifact);
        if(monster.healthPoints <= 0 ){
            System.out.println(monster.name + " is dead!");
            monster.healthPoints = 0;
        }

        if(human.healthPoints <= 0){
            System.out.println(human.name + " is dead!");
            human.healthPoints = 0;
        }

        if(animal.healthPoints <= 0){
            System.out.println(animal.name + " is dead!");
            animal.healthPoints = 0;

        }

        System.out.println(human.name + " has " + human.energyPoints + " energy points and " + human.healthPoints + " health points");
        System.out.println(monster.name + " has " + monster.energyPoints + " energy points and " + monster.healthPoints + " health points");
        System.out.println(animal.name + " has " + animal.energyPoints + " energy points and " + animal.healthPoints + " health points");

    }
}
