package com.pentalog.pentastagiu.homework3;

import com.pentalog.pentastagiu.homework3.bluetooth.Connectable;
import com.pentalog.pentastagiu.homework3.bluetooth.Student;
import com.pentalog.pentastagiu.homework3.bluetooth.impl.Car;
import com.pentalog.pentastagiu.homework3.bluetooth.impl.Phone;
import com.pentalog.pentastagiu.homework3.bluetooth.impl.SmartRefrigerator;
import com.pentalog.pentastagiu.homework3.restaurants.Guest;
import com.pentalog.pentastagiu.homework3.restaurants.Menu;
import com.pentalog.pentastagiu.homework3.restaurants.Restaurant;
import com.pentalog.pentastagiu.homework3.restaurants.impl.FastFood;
import com.pentalog.pentastagiu.homework3.restaurants.impl.VeganRestaurant;
import com.pentalog.pentastagiu.homework3.shapes.Form;
import com.pentalog.pentastagiu.homework3.shapes.impl.Circle;
import com.pentalog.pentastagiu.homework3.shapes.impl.Square;
import com.pentalog.pentastagiu.homework3.shapes.impl.Triangle;
import com.pentalog.pentastagiu.homework3.strategygame.MapBoard;
import com.pentalog.pentastagiu.homework3.strategygame.MapPoint;
import com.pentalog.pentastagiu.homework3.strategygame.artifacts.Artifact;
import com.pentalog.pentastagiu.homework3.strategygame.artifacts.artifacttypes.ArtifactType;
import com.pentalog.pentastagiu.homework3.strategygame.warriors.Warrior;
import com.pentalog.pentastagiu.homework3.strategygame.warriors.warriorsType.WarriorType;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HomeworkApp {

    public static final int TAXPERCENT = 20;

    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework3 package should be used to commit all your classes related to homework 3");
        System.out.println("=== PB1 ===");
        shapesProblem();

        System.out.println("=== PB2 ====");
        restaurantProblem();

        System.out.println("=== PB3 ====");
        bluetoothProblem();

        System.out.println("=== PB4 ====");
        strategyGame();


    }

    private static void shapesProblem() {
        Form square = new Square(0, 4, 4, 4, 4, 0, 0, 0);
        Form triangle = new Triangle(4, 8, 8, 0, 0, 0);
        Form circle = new Circle(0, 0, 10);
        List<Form> forms = Arrays.asList(square, triangle, circle);
        Iterator<Form> iterator = forms.iterator();
        double maxArea = 0;
        Form maxForm = null;
        while (iterator.hasNext()) {
            Form form = iterator.next();
            if (form.calculateArea() > maxArea) {
                maxArea = form.calculateArea();
                maxForm = form;
            }
        }
        System.out.println(maxForm);
        System.out.println(maxArea);
    }

    private static void restaurantProblem() {
        Restaurant fastFood = new FastFood("Class", 0);
        Restaurant vegan = new VeganRestaurant("Salad", 0.3);

        Menu veganMenu1 = new Menu("SALATA", 100);
        Menu veganMenu2 = new Menu("Veganuf", 200);
        Menu veganMenu3 = new Menu("Veganuf", 150);

        Menu fastMenu1 = new Menu("Shaorma", 100);
        Menu fastMenu2 = new Menu("Shaorma2", 150);
        Menu fastMenu3 = new Menu("Shaorma2", 150);

        Guest guest1 = new Guest("Marcel");
        Guest guest2 = new Guest("Marian");
        Guest guest3 = new Guest("Nicu");

        vegan.addMenu(veganMenu1);
        vegan.addMenu(veganMenu2);
        vegan.addMenu(veganMenu3);

        fastFood.addMenu(fastMenu1);
        fastFood.addMenu(fastMenu2);
        fastFood.addMenu(fastMenu3);

        vegan.accommodateGuest(guest1, veganMenu1);
        vegan.accommodateGuest(guest2, veganMenu2);

        fastFood.accommodateGuest(guest3, fastMenu1);

        System.out.println("vegan income : " + vegan.getIncome());
        System.out.println("vegan restaurant income after taxes : " + vegan.payTaxesIncome());
        System.out.println("fastfood income : " + fastFood.getIncome());
        System.out.println("fastfood restaurant income after taxes : " + fastFood.payTaxesIncome());
    }

    private static void bluetoothProblem() {
        Object[] objects = new Object[]{new Car("BMW", 100), new Phone("IPHONE", 100)
                , new SmartRefrigerator("CEVA", 100), new Student("Marcel")};

        int arrayIndex;
        for (arrayIndex = 0; arrayIndex < objects.length; arrayIndex++) {
            if (objects[arrayIndex] instanceof Connectable) {
                ((Connectable) objects[arrayIndex]).connectToBlueTooth();
            }
        }
    }

    private static void strategyGame() {
        MapBoard mapBoard = new MapBoard();

        Artifact energyArtifact = new Artifact(ArtifactType.ENERGY, new MapPoint(5, 5), 20);
        mapBoard.addArtifact(energyArtifact);

        Warrior humanWarrior = new Warrior("Marcel", WarriorType.HUMAN, new MapPoint(0, 0));
        Warrior animalWarrior = new Warrior("Labus", WarriorType.ANIMAL, new MapPoint(6, 6));
        Warrior monsterWarrior = new Warrior("Monster", WarriorType.WARRIOR, new MapPoint(1, 1));

        mapBoard.addWarrior(humanWarrior);
        mapBoard.addWarrior(animalWarrior);
        mapBoard.addWarrior(monsterWarrior);

        System.out.println(mapBoard.getWarriors());
        humanWarrior.attack(animalWarrior);
        System.out.println(mapBoard.getWarriors());
        monsterWarrior.attack(humanWarrior);
        System.out.println(mapBoard.getWarriors());
        humanWarrior.attack(monsterWarrior);
        System.out.println(mapBoard.getWarriors());
        humanWarrior.consumeArtifact(energyArtifact);
        System.out.println(mapBoard.getWarriors());

    }
}
