package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public class PlayGame {
    public static void main(String[] args) {
        Human human = new Human(new MapLocation(1, 1), 50, 20);
        Monster monster = new Monster(new MapLocation(0, 1), 50, 20);
        Animal animal = new Animal(new MapLocation(2, 1), 50, 20);
        Artifact artifact = new EnergyArtifact(new MapLocation(1, 2), 10);

        human.attack(animal);
        monster.attack(human);
        human.attack(monster);
        human.useArtifact(artifact);
        System.out.println(human);
        System.out.println(monster);
        System.out.println(animal);
    }
}
