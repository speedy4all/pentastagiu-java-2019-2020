package com.pentalog.pentastagiu.homework3.exercise4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Mike", 20, 50);
        Monster monster = new Monster("Ran", 20, 50);
        Animal animal = new Animal("Milky", 20, 50);
        HealthArtifact healthArtifact = new HealthArtifact(5);
        EnergyArtifact energyArtifact = new EnergyArtifact(10);

        human.setPosition(0, 5);
        monster.setPosition(1, 5);
        animal.setPosition(5, 3);

        human.verifyDistance(human, animal);
        monster.verifyDistance(monster,human);
        human.verifyDistance(human,monster);
        monster.verifyDistance(monster,animal);

        monster.attack(human);
        human.attack(monster);
        human.attack(monster);
        human.attack(monster);
        human.attack(monster);
        human.attack(monster);
        human.getExtraPoints(healthArtifact);
        monster.getExtraPoints(energyArtifact);

        if(monster.healthPoints <= 0 ){
            System.out.println(monster.name + " is already dead, you can't attack him anymore!");
            monster.healthPoints = 0;
        }

        if(human.healthPoints <= 0){
            System.out.println(human.name + " is already dead, you can't attack him anymore!");
            human.healthPoints = 0;
        }

        if(animal.healthPoints <= 0){
            System.out.println(animal.name + " is already dead, you can't attack him anymore!");
            animal.healthPoints = 0;
        }


        System.out.println(human.name + " has " + human.energyPoints + " energy points and " + human.healthPoints + " health points");
        System.out.println(monster.name + " has " + monster.energyPoints + " energy points and " + monster.healthPoints + " health points");
        System.out.println(animal.name + " has " + animal.energyPoints + " energy points and " + animal.healthPoints + " health points");

    }
}
