package com.pentalog.pentastagiu.homework3.App4;

public class StrategyGameApp {
    public static void main(String[] args) {
        Human human = new Human("Tony", 50, 20, 1, 10);
        Monster monster = new Monster("Loki", 50, 20, 3, 4);
        Animal animal = new Animal("Lion", 50, 20, 2, 0);

        EnergyArtifact energy = new EnergyArtifact(0, 5, 40);
        HealthArtifact healthArtifact = new HealthArtifact(4,6, 30);
        human.attack(animal);
        monster.attack(human);
        human.attack(monster);
        human.increasePoints(energy);
        animal.increasePoints(healthArtifact);

        System.out.println("Human: energy level = " + human.energyPoints + ", health = " + human.healthPoints);
        System.out.println("Animal: energy level = " + animal.energyPoints + ", health = " + animal.healthPoints);
        System.out.println("Monster: energy level = " + monster.energyPoints + ", health = " + monster.healthPoints);
    }
}
