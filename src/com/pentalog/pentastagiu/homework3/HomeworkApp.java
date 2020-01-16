package com.pentalog.pentastagiu.homework3;

import com.pentalog.pentastagiu.homework3.exercise1.*;
import com.pentalog.pentastagiu.homework3.exercise2.FastFood;
import com.pentalog.pentastagiu.homework3.exercise2.Restaurant;
import com.pentalog.pentastagiu.homework3.exercise2.VegetarianRestaurant;
import com.pentalog.pentastagiu.homework3.exercise3.*;
import com.pentalog.pentastagiu.homework3.exercise4.*;
import com.pentalog.pentastagiu.homework3.exercise4.Character;

import java.util.ArrayList;
import java.util.List;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("Shape App");
        testExercise1();
        System.out.println("Restaurant App");
        testExercise2();
        System.out.println("Bluetooth App");
        testExercise3();
        System.out.println("Strategy Game");
        testExercise4();
    }

    public static void testExercise1() {
        Shape circle = new Circle(7);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Shape square = new Square(24);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());

        Shape triangle = new Triangle(10, 12, 17);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        Shape rectangle = new Rectangle(14, 20);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
    }

    public static void testExercise2() {
        Restaurant fastFood = new FastFood(15.99);
        fastFood.welcomeGuests(3);
        System.out.println("Pay tax for the fast food " + fastFood.calculateTax());

        Restaurant vegetarianRestaurant = new VegetarianRestaurant(22.5);
        vegetarianRestaurant.welcomeGuests(5);
        System.out.println("Pay tax for the vegetarian restaurant " + vegetarianRestaurant.calculateTax());
    }

    public static void testExercise3() {
        Student student = new Student("John Doe", 21, "Transilvania");

        Connectable car = new Car("BMW", 220, "black");
        Connectable phone = new Phone("IPhone", 3000, "IOS", 32);
        Connectable smartRefrigerator =
                new SmartRefrigerator("SmartFrige", "gray", 1400, "A+++");
        List<Connectable> devices = new ArrayList<>();
        devices.add(car);
        devices.add(phone);
        devices.add(smartRefrigerator);

        devices.forEach(student::connectToDevice);
    }

    public static void testExercise4() {

        Character monster = new Monster(4, 7, "Rock Monster", 50, 20);
        Character human = new Human(3, 4, "Knight", 50, 20);
        Character animal = new Animal(6, 4, "Wolf", 50, 20);
        Artifact hearthArtifact = new Artifact(5, 3, ArtifactType.HEALTH, 5);
        Artifact energyArtifact = new Artifact(4, 2, ArtifactType.ENERGY, 5);

        human.attack(animal);
        monster.attack(human);
        human.attack(monster);
        System.out.println(human);
        human.useArtifact(energyArtifact);
    }
}
