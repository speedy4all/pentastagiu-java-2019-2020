package com.pentalog.pentastagiu.homework3.problem4;

public class Problem4App {

    public static void main(String[] args) {


        int[] humanPosition = new int[]{1,2};
        int[] animalPosition = new int[]{3,7};
        int[] monsterPosition = new int[]{10,0};

        Human human = new Human("Human",50,20, humanPosition[0], humanPosition[1], ArtifactType.ENERGY);
        Character animal = new Animal("Animal", 50,20, animalPosition[0], animalPosition[1], ArtifactType.HEALTH);
        Monster monster = new Monster("Monster", 50,20, monsterPosition[0], monsterPosition[1], ArtifactType.HEALTH);

        System.out.println(human.displayStatus(human));
        System.out.println(animal.displayStatus(animal));
        System.out.println(monster.displayStatus(monster));

        human.attack(animal);

        System.out.println(human.displayStatus(human));
        System.out.println(animal.displayStatus(animal));

        monster.attack(human);

        System.out.println(human.displayStatus(human));
        System.out.println(monster.displayStatus(monster));

        human.attack(monster);
        human.displayStatus(human);
        monster.displayStatus(monster);

        Artifacts secretArtefact = new Artifacts();

    }
}
