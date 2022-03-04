package com.pentalog.pentastagiu.week4.homework3.StrategyGame;

public class StrategyGameApp {

    public static void main(String[] args) {
        Human human=new Human("Marcus",3,4);
        Monster monster= new Monster("Vial",5,8);
        Animal animal=new Animal("Pris",2,4);

        Artifacts artifact1= new HealthArtifact(2,7);
        Artifacts artifact2= new EnergyArtifact(8,9);
        Artifacts artifact3= new HealthArtifact(8,2);
        Artifacts artifact4= new EnergyArtifact(1,2);

        human.attack(monster);
        System.out.println("Human has "+human.energyPoints+" energy points left");
        System.out.println("Monster has "+monster.healthPoints+" health points left \n");

        human.attack(monster);
        System.out.println("Human has "+human.energyPoints+" energy points left");
        System.out.println("Monster has "+monster.healthPoints+" health points left\n");

        monster.attack(human);
        System.out.println("Human has "+human.healthPoints+" health points left");
        System.out.println("Monster has "+monster.energyPoints+" energy points left\n");

        human.attack(animal);
        System.out.println("Human has "+human.energyPoints+" energy points left");
        System.out.println("Animal has "+animal.healthPoints+" health points left\n");

        human.getArtifact(artifact1);
        System.out.println("Human has "+human.energyPoints+" energy points left");
        System.out.println("Human has "+human.healthPoints+" health points left\n");

        human.getArtifact(artifact2);
        System.out.println("Human has "+human.energyPoints+" energy points left");
        System.out.println("Human has "+human.healthPoints+" health points left\n");

        human.moveRight(3);
        human.moveUp(2);
        human.getArtifact(artifact2);
        System.out.println("Human has "+human.energyPoints+" energy points left");
        System.out.println("Human has "+human.healthPoints+" health points left\n");

    }
}
