package com.pentalog.pentastagiu.homework3;

import com.pentalog.pentastagiu.homework3.bluetooth.*;
import com.pentalog.pentastagiu.homework3.game.artifacts.Energy;
import com.pentalog.pentastagiu.homework3.game.artifacts.Health;
import com.pentalog.pentastagiu.homework3.game.characters.Animal;
import com.pentalog.pentastagiu.homework3.game.characters.Human;
import com.pentalog.pentastagiu.homework3.game.characters.Monster;
import com.pentalog.pentastagiu.homework3.restaurant.Restaurant;

import java.util.List;

public class HomeworkApp {
    public static void main(String[] args) {
        //shapes
       /* Circle c = new Circle(6);
        c.getArea();
        c.getPerimeter();

        Square s = new Square(5,5);
        s.getArea();
        s.getPerimeter();

        Rectangle r = new Rectangle(4,6);
        r.getArea();
        r.getPerimeter();

        Triangle t = new Triangle(4,7);
        t.getArea();
        t.getPerimeter();

        DecimalFormat df = new DecimalFormat(".##");
        double biggestArea = Math.max(c.getArea(), Math.max(s.getArea(), Math.max(r.getArea(), t.getArea())));

        System.out.println("Biggest Area: " + df.format(biggestArea));*/

       //restaurant
       /*
       //fast food restaurant
        Restaurant res = new Restaurant(3, 20);
        res.newCustomers(5);
        res.newCustomers(3);
        res.taxesToPay();

        //vegetarian restaurant
        Restaurant veg = new Restaurant(2, 15);
        veg.newCustomers(10);
        veg.taxesToPay();*/

       //bluetooth
       /* Connectable[] conn = {new Cars("Mercedes", "petrol"), new Phones("Samsung"),
                new SmartRefrigerators("Beko")};

        for (Connectable connectable : conn){
            connectable.connectToBluetooth();
        }*/

       //game
        Animal animal = new Animal("Dog", 30, 40, 255,145);
        Human human = new Human("John", 200, 100, 345, 246);
        Health extraHealth = new Health( 40);
        Energy extraEnergy = new Energy(80);
        System.out.println("-----------");
        animal.getAnimalPosition();
        animal.updateAnimal(extraHealth.getExtraPointsHealth(), extraEnergy.getExtraPointsEnergy());
        System.out.println("-------TEST-------");
        System.out.println("---Human 1st attack---");
        animal.animalAttack(50, human);
        System.out.println(human.getHealthPoints());
        System.out.println("---Human 2nd attack---");
        animal.animalAttack(70, human);
        System.out.println(human.getHealthPoints());
        System.out.println("---Human 3rd attack---");
        animal.animalAttack(80, human);
        System.out.println("-----Human final attack---------");
        animal.animalAttack(10, human);
        System.out.println("=====Monster=======");
        Monster monster = new Monster("Dwarf", 60, 100, 444, 324);
        animal.animalAttack(20, monster);
        animal.animalAttack(50, monster);







    }
}
