package com.pentalog.pentastagiu.homework4.ex4;

public class Program {

    public static void main(String[] args) {
        Artifact artifactEnergy = new Artifact(ArtifactType.EnergyArtifact,  new Position(5, 10));
        Artifact artifactHealth = new Artifact(ArtifactType.HealthArtifact, new Position(1, 2));

        Character animal = new Animal("lup", 10, 10, new Position(3, 4));
        Character humanWarrior = new Human("warrior", 40, 30, new Position(4, 5));
        Character humanNinja = new Human("ninja", 40, 15, new Position(4, 5));
        Character monster = new Monster("zombie", 50, 10, new Position(4, 6));

        humanWarrior.atack(monster);
        humanNinja.atack(monster);
        humanNinja.atack(monster);
        monster.atack(humanWarrior);
        monster.atack(humanWarrior);
        monster.atack(humanWarrior);
        monster.atack(humanNinja);
        humanNinja.getInfo();
        humanNinja.getPointsFromArtifact(artifactHealth);
        humanNinja.getPointsFromArtifact(artifactEnergy);
        humanNinja.getPointsFromArtifact(artifactEnergy);
        humanNinja.getInfo();
        humanNinja.atack(monster);
        humanNinja.atack(monster);
        humanNinja.atack(animal);
    }
}

