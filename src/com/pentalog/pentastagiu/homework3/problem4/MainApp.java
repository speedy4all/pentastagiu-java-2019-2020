package com.pentalog.pentastagiu.homework3.problem4;

import com.pentalog.pentastagiu.homework3.problem4.artifact.EnergyArtifact;
import com.pentalog.pentastagiu.homework3.problem4.artifact.HealthArtifact;
import com.pentalog.pentastagiu.homework3.problem4.character.Animal;
import com.pentalog.pentastagiu.homework3.problem4.character.Human;
import com.pentalog.pentastagiu.homework3.problem4.character.Monster;

public class MainApp {

    public static void main(String[] args) {
        EnergyArtifact energyArtifact = new EnergyArtifact(2, 3, 10);
        HealthArtifact healthArtifact = new HealthArtifact(4, 6, 30);

        Monster monster = new Monster("Cerberus", 70, 40, 1,2);
        Human human = new Human("Hercules", 100, 70, 3,10);
        Animal animal = new Animal("Pegasus", 50, 100, 5,6);
        System.out.println("Update stats:\n");
        monster.updatePoints(energyArtifact);
        human.updatePoints(healthArtifact);
        animal.updatePoints(energyArtifact);

        double distance = Math.sqrt(Math.pow(human.getxPosition() - monster.getxPosition(), 2) + Math.pow(human.getyPosition() - monster.getyPosition(),2));

        if (distance < 5) {

            System.out.println("\nInitiate fight: ");
            while (monster.getHealthPoints() > 0 && human.getHealthPoints() > 0) {


                monster.canAttack(human);

                human.canAttack(monster);
                human.canAttack(monster);

            }
            if (monster.getHealthPoints() < 0) {
                System.out.println("\n\n" + human.getName() + " killed " + monster.getName() + "!");
            } else {
                System.out.println("\n\n" + monster.getName() + " killed " + human.getName() + "!");
            }
        }else
        {
            System.out.println("\n\n" + human.getName() + " is too far from " + monster.getName() + " so they can not attack each other!");
        }



    }
}
