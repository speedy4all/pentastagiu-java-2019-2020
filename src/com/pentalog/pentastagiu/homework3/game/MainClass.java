package com.pentalog.pentastagiu.homework3.game;

import java.util.Scanner;

public class MainClass {

    public static void main(String[]args) {
        Human human=new Human("Human", 2,5);
        Monster monster=new Monster("Monster", 5,4);
        Animal animal=new Animal("Animal", 2,6);

        Artifact artifact1=new EnergyArtifact(2,7);
        Artifact artifact2=new EnergyArtifact(5,5);
        Artifact artifact3=new HealthArtifact(0,5);
        Artifact artifact4=new HealthArtifact(5,3);

        Scanner scan=new Scanner(System.in);
        Integer userOption;


        //first choos who is attacking
        System.out.println("Who is attacking first?  Enter your option\n1 - HUMAN ATTACK MONSTER\n2 - MONSTER ATTACK HUMAN\n3 - HUMAN ATTACK ANIMAL");
        userOption=scan.nextInt();
        while(userOption==1 || userOption==2 || userOption==3) {

            //when human is attacking
            while(userOption==1) {
                //display human and monster position
                System.out.println("-----------------------------------------------------------------------");
                human.getCharacterPosition(human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                monster.getCharacterPosition(monster.getxPositionOnTheMap(), monster.getyPositionOnTheMap());
                human.humanAttack(monster);
                //display human energy and monster health
                human.pointsEnergyLeft(human.getNameOfTheCharacter(), human.getNumberOfEnergyPoints());
                monster.pointsHealthLeft(monster.getNameOfTheCharacter(), monster.getNumberOfHealthPoints());
                System.out.println("-----------------------------------------------------------------------");

                //monster or human have to move on the map
                System.out.println("A character have to move!!");
                System.out.println("Which character wants to move?\n1 - HUMAN\n2 - MONSTER");
                userOption=scan.nextInt();
                if(userOption==1) {
                    //human is moving
                    System.out.println("Human is moving. Choose where  to move ----- (AT FIRST HUMAN MOVE, MAKE  2 METERS DOWN OR LEFT TO GET AN ARTIFACT)-----");
                    System.out.println("1 - UP\n2 - DOWN\n3 - LEFT\n4 - RIGHT");
                    userOption=scan.nextInt();
                    human.chooseWhereToMove(userOption, human);
                    System.out.println("-----------------------------------------------------------------------");

                    //display energy and  health  for human and update if artifact is found
                    human.updateHealthEnergyPoints(artifact1, artifact1.getxPositionOnTheMap(), artifact1.getyPositionOnTheMap(), human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                    human.updateHealthEnergyPoints(artifact3, artifact3.getxPositionOnTheMap(), artifact3.getyPositionOnTheMap(), human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                    human.pointsEnergyLeft(human.getNameOfTheCharacter(), human.getNumberOfEnergyPoints());
                    human.pointsHealthLeft(human.getNameOfTheCharacter(), human.getNumberOfHealthPoints());

                }else if(userOption==2) {
                    //monster is moving
                    System.out.println("Monster is moving. Choose where  to move  ----- (AT FIRST MONSTER MOVE, MAKE  1 METER DOWN OR UP TO GET AN ARTIFACT)-----");
                    System.out.println("1 - UP\n2 - DOWN\n3 - LEFT\n4 - RIGHT");
                    userOption=scan.nextInt();
                    monster.chooseWhereToMove(userOption, monster);
                    System.out.println("-----------------------------------------------------------------------");

                    //display energy and  health  for monster and update if artifact is found
                    monster.updateHealthEnergyPoints(artifact2, artifact2.getxPositionOnTheMap(), artifact2.getyPositionOnTheMap(), monster.getxPositionOnTheMap(), monster.getyPositionOnTheMap());
                    monster.updateHealthEnergyPoints(artifact4, artifact4.getxPositionOnTheMap(), artifact4.getyPositionOnTheMap(), monster.getxPositionOnTheMap(), monster.getyPositionOnTheMap());
                    monster.pointsEnergyLeft(monster.getNameOfTheCharacter(), monster.getNumberOfEnergyPoints());
                    monster.pointsHealthLeft(monster.getNameOfTheCharacter(), monster.getNumberOfHealthPoints());

                }
                System.out.println("Choose who is attacking \n1 - HUMAN ATTACK THE MONSTER\n2 - MONSTER ATTACK THE HUMAN\n3 - HUMAN ATTACK THE ANIMAL");
                userOption=scan.nextInt();

            }

            //when monster is attacking
            while(userOption==2) {

                //display human and monster position
                System.out.println("-----------------------------------------------------------------------");
                human.getCharacterPosition(human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                monster.getCharacterPosition(monster.getxPositionOnTheMap(), monster.getyPositionOnTheMap());
                monster.monsterAttack(human);
                //display monster energy and human health
                monster.pointsEnergyLeft(monster.getNameOfTheCharacter(), monster.getNumberOfEnergyPoints());
                human.pointsHealthLeft(human.getNameOfTheCharacter(), human.getNumberOfHealthPoints());
                System.out.println("-----------------------------------------------------------------------");

                System.out.println("A character have to move!!");
                System.out.println("Which character wants to move?\n1 - HUMAN\n2 - MONSTER");
                userOption=scan.nextInt();
                if(userOption==1) {
                    //human is moving
                    System.out.println("Human is moving. Choose where  to move  ----- (AT FIRST HUMAN MOVE, MAKE  2 METERS DOWN OR LEFT TO GET AN ARTIFACT)-----");
                    System.out.println("1 - UP\n2 - DOWN\n3 - LEFT\n4 - RIGHT");
                    userOption=scan.nextInt();
                    human.chooseWhereToMove(userOption, human);
                    System.out.println("-----------------------------------------------------------------------");

                    //display energy and  health  for human and update if artifact is found
                    human.updateHealthEnergyPoints(artifact1, artifact1.getxPositionOnTheMap(), artifact1.getyPositionOnTheMap(), human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                    human.updateHealthEnergyPoints(artifact3, artifact3.getxPositionOnTheMap(), artifact3.getyPositionOnTheMap(), human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                    human.pointsEnergyLeft(human.getNameOfTheCharacter(), human.getNumberOfEnergyPoints());
                    human.pointsHealthLeft(human.getNameOfTheCharacter(), human.getNumberOfHealthPoints());


                }else if(userOption==2) {
                    //monster is moving
                    System.out.println("Monster is moving. Choose where  to move ----- (AT FIRST MONSTER MOVE, MAKE  1 METER DOWN  OR UP TO GET AN ARTIFACT)-----");
                    System.out.println("1 - UP\n2 - DOWN\n3 - LEFT\n4 - RIGHT");
                    userOption=scan.nextInt();
                    monster.chooseWhereToMove(userOption, monster);
                    System.out.println("-----------------------------------------------------------------------");

                    //display energy and  health  for monster and update if artifact is found
                    monster.updateHealthEnergyPoints(artifact2, artifact2.getxPositionOnTheMap(), artifact2.getyPositionOnTheMap(), monster.getxPositionOnTheMap(), monster.getyPositionOnTheMap());
                    monster.updateHealthEnergyPoints(artifact4, artifact4.getxPositionOnTheMap(), artifact4.getyPositionOnTheMap(), monster.getxPositionOnTheMap(), monster.getyPositionOnTheMap());
                    monster.pointsEnergyLeft(monster.getNameOfTheCharacter(), monster.getNumberOfEnergyPoints());
                    monster.pointsHealthLeft(monster.getNameOfTheCharacter(), monster.getNumberOfHealthPoints());

                }
                System.out.println("Choose who is attacking?\n1 - HUMAN ATTACK THE MONSTER\n2 - MONSTER ATTACK THE HUMAN\n3 - HUMAN ATTACK THE ANIMAL");
                userOption=scan.nextInt();
            }
            //human attack animal
            while(userOption==3) {
                //display human and animal position
                System.out.println("-----------------------------------------------------------------------");
                human.getCharacterPosition(human.getxPositionOnTheMap(), human.getyPositionOnTheMap());
                animal.getCharacterPosition(animal.getxPositionOnTheMap(), animal.getyPositionOnTheMap());
                human.humanAttack(animal);
                //display human energy and animal health
                human.pointsEnergyLeft(human.getNameOfTheCharacter(), human.getNumberOfEnergyPoints());
                animal.pointsHealthLeft(animal.getNameOfTheCharacter(), animal.getNumberOfHealthPoints());
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Choose who is attacking!\n1 - HUMAN ATTACK THE MONSTER \n2 - MONSTER ATTACK THE HUMAN\n3 - HUMAN ATTACK THE ANIMAL");

                userOption=scan.nextInt();
            }

        }
    }
}

