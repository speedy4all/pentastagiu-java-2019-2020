package com.pentalog.pentastagiu.homework3.game;

import com.pentalog.pentastagiu.homework3.game.artifacts.Artifact;
import com.pentalog.pentastagiu.homework3.game.artifacts.Energy;
import com.pentalog.pentastagiu.homework3.game.artifacts.Health;
import com.pentalog.pentastagiu.homework3.game.characters.Animal;
import com.pentalog.pentastagiu.homework3.game.characters.Character;
import com.pentalog.pentastagiu.homework3.game.characters.Human;
import com.pentalog.pentastagiu.homework3.game.characters.Map;
import com.pentalog.pentastagiu.homework3.game.characters.Monster;

import static com.pentalog.pentastagiu.homework3.game.Constants.MAP_X;
import static com.pentalog.pentastagiu.homework3.game.Constants.MAP_Y;

public class Main {
    public static void main(String[] args) {
        Map.map();
        Human human1 = new Human("John", 50, 20, 1, 1);
        Animal animal1 = new Animal("Tiger", 50, 20, 2, 4);
        Monster monster1 = new Monster("Tor", 50, 20, 4, 3);

        Health health = new Health(5, 5, 50);
        Energy energy = new Energy(3, 3, 50);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< START >>>>>>>>>>>>>>>>>>>>>\n");
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 1 >>>>>>>>>>>>>>>>>>>>>\n");
        human1.attack(animal1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);


        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 2 >>>>>>>>>>>>>>>>>>>>>\n");
        monster1.attack(human1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 3 >>>>>>>>>>>>>>>>>>>>>\n");
        human1.attack(monster1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Exist another charcter >>>>>>>>>>>>>>>>>>>>>\n");
        human1.move(1, 3);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Move to Energy >>>>>>>>>>>>>>>>>>>>>\n");
        human1.move(2, 2);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Move to health >>>>>>>>>>>>>>>>>>>>>\n");
        human1.move(2, 2);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Return to where the energy was >>>>>>>>>>>>>>>>>>>>>\n");
        human1.move(-2, -2);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 4 >>>>>>>>>>>>>>>>>>>>>\n");
        human1.attack(monster1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 5 >>>>>>>>>>>>>>>>>>>>>\n");
        human1.attack(monster1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 6 >>>>>>>>>>>>>>>>>>>>>\n");
        human1.attack(monster1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 7 (Health of Tor is 0 but not -10)>>>>>>>>>>>>>>>>>>>>>\n");
        animal1.attack(monster1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);

        System.out.println("\n\n<<<<<<<<<<<<<<<<<< Attack 7 (Tor is death)>>>>>>>>>>>>>>>>>>>>>\n");
        animal1.attack(monster1);
        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(monster1);


    }
}
