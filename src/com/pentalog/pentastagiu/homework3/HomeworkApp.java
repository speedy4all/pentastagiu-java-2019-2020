package com.pentalog.pentastagiu.homework3;

import com.pentalog.pentastagiu.homework3.bluetooth.application.Car;
import com.pentalog.pentastagiu.homework3.bluetooth.application.Phone;
import com.pentalog.pentastagiu.homework3.bluetooth.application.SmartRefrigerator;
import com.pentalog.pentastagiu.homework3.bluetooth.application.Student;
import com.pentalog.pentastagiu.homework3.game.strategy.application.Animal;
import com.pentalog.pentastagiu.homework3.game.strategy.application.Artifact;
import com.pentalog.pentastagiu.homework3.game.strategy.application.Human;
import com.pentalog.pentastagiu.homework3.game.strategy.application.Monster;
import com.pentalog.pentastagiu.homework3.restaurant.application.Menu;
import com.pentalog.pentastagiu.homework3.restaurant.application.Restaurant;
import com.pentalog.pentastagiu.homework3.shape.application.*;

import java.util.HashMap;
import java.util.Map;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework3 package should be used to commit all your classes related to homework 3");
        System.out.println("-----------------------------------");
        System.out.println("----------Problem No. 1 -----------");

        /* Create an application that knows how to calculate the perimeter and area
        for common shapes(circle, square, rectangle, triangle)
        To test it: create few objects of each type and print to the console information about the object
        that has the biggest area */

        Shape circle = new Circle(12.0);
        Shape rectangle = new Rectangle(12.0, 5.0);
        Shape square = new Square(7.0);
        Shape triangle = new Triangle(10.0, 7.0, 9.0);
        // Calculation for max area
        HashMap<Shape, Double> areas = new HashMap<Shape, Double>();
        areas.put(circle, circle.getArea());
        areas.put(rectangle, rectangle.getArea());
        areas.put(square, square.getArea());
        areas.put(triangle, triangle.getArea());

        Map.Entry<Shape, Double> maxAreaEntry = null;

        for (Map.Entry<Shape, Double> entry : areas.entrySet()) {
            if (maxAreaEntry == null || entry.getValue().compareTo(maxAreaEntry.getValue()) > 0) {
                maxAreaEntry = entry;
            }
        }
        System.out.println("Max area is: " + maxAreaEntry.getKey().toString() + " " + maxAreaEntry.getValue());
        // Calculation for max perimeter
        HashMap<Shape, Double> perimeters = new HashMap<Shape, Double>();
        perimeters.put(circle, circle.getPerimeter());
        perimeters.put(rectangle, rectangle.getPerimeter());
        perimeters.put(square, square.getPerimeter());
        perimeters.put(triangle, triangle.getPerimeter());

        Map.Entry<Shape, Double> maxPerimeterEntry = null;

        for (Map.Entry<Shape, Double> entry : perimeters.entrySet()) {
            if (maxPerimeterEntry == null || entry.getValue().compareTo(maxPerimeterEntry.getValue()) > 0) {
                maxPerimeterEntry = entry;
            }
        }
        System.out.println("Max perimeter is: " + maxPerimeterEntry.getKey().toString() + " " + maxPerimeterEntry.getValue());

        System.out.println("-----------------------------------");
        System.out.println("----------Problem No. 2 -----------");

        /* Create a console application that works with restaurants
        Each restaurant will have info about the current number of guests, the  income, the price for a fixed menu
        Each restaurant will have a method that accommodates new guest in which the number of current guests has
        to increase with the number of new guests and the income also will increase accordingly(each new guest
        will consume a fixed price menu).
        We will also have the option of calculating the taxes that each restaurant has to pay to the
        local authorities, but each restaurant will have a different way of calculating this
        Let's consider that we will have 2 types of restaurants: vegetarian restaurant and fast food restaurant.
        Each restaurant will have to pay taxes to the local authorities, which represent 20% of their income.
        Also the local authorities from the town where we have restaurants, that want to encourage a healthy life,
        decided that the vegetarian restaurant will receive a discount of 30% for the taxation.
        Implement for each restaurant a method that calculates the tax that it has to pay. */
         // Create the 2 types/objects of restaurants

        Menu vegetarianMenu = new Menu("vegetarian", 25.0);
        Restaurant vegetarianRestaurant = new Restaurant(10, vegetarianMenu);
        vegetarianRestaurant.addGuestsNumber(10);
        Double vegetarianIncome = vegetarianRestaurant.getIncome();
        System.out.println("The income for the vegetarian restaurant is: " + vegetarianIncome);

        Double taxVegetarian = vegetarianRestaurant.calculateTax(vegetarianRestaurant);
        System.out.println("The tax for the vegetarian restaurant is: " + taxVegetarian);

        Menu fastFoodMeniu = new Menu("fast food", 15.0 );
        Restaurant fastFoodRestaurant = new Restaurant(10, fastFoodMeniu);
        Double fastFoodIncome = fastFoodRestaurant.getIncome();
        System.out.println("The income for the fast food restaurant is: " + fastFoodIncome);

        Double taxFastFood = fastFoodRestaurant.calculateTax(fastFoodRestaurant);
        System.out.println("The tax for the fast food restaurant is: " + taxFastFood);

        System.out.println("-----------------------------------");
        System.out.println("----------Problem No. 3 -----------");
        /* Create a console application from the following requirements:
        In the application we will work with few things: cars, phones, smart refrigerators.
        Add some specific details for each one
        We want each of these things to be able to connect with bluetooth
        → write a Connectable interface in which you specify this contract: a method called connectToBluetooth
        Add another simple class, Student for example, which doesn’t have to implement the Connectable interface
        Implement this contract in each class that you have and add a specific implementation(in which you just
        print to console a message in which you specify: “Connect to bluetooth in progress...” and the name of the device) */

        SmartRefrigerator smartRef1 = new SmartRefrigerator("Samsung", "Samsung refriferator, 185 cm, energy Class A++");
        Phone phone1 = new Phone("Huawei", "Smartphone","4 GB memory");
        Car car1 = new Car("Toyota", "Hybrid");
        Student student1 = new Student("Anca", "david");

        Object objects[] = {smartRef1, phone1, car1, student1};
        for(int i = 0; i<objects.length; i++) {
            if(objects[i] instanceof SmartRefrigerator) {
                smartRef1.connectToBluetooth();
            } else if(objects[i] instanceof Phone) {
                phone1.connectToBluetooth();
            } else if(objects[i] instanceof Car) {
                car1.connectToBluetooth();
            } else {
                System.out.println("Can not connect to bluetooth");
            }

        }

        System.out.println("-----------------------------------");
        System.out.println("----------Problem No. 4 -----------");

        /* Create a console application from the following requirements:
        We plan to create a strategy game: in this game we will have characters and artifacts
        Each artifact will have a position on the map(x and y) and a number of extra points.
            We will have 2 types of artifacts: health artifact and energy artifact
        Each character can be a human, a monster or an animal; each one will have a name,
            a number of health points, a number of energy points and a position on the map (x and y); for each one
            we will have the method that gives us the position on the map and also a method that will receive
            as parameter an artifact and will increase the number of health points or energy points of the character
            with the number of extra points given by the artifact, depending on the type of artifact that is passed
            as parameter
        Some of the characters will have the ability of attacking other characters:
        Humans can attack: in which case they will waste 5 energy points and the character
            that is attacked will lose 10 health points
        Monsters can attack: in which case they will lose 3 energy points and the character that is attacked will lose 15
        Use a scenario in which you create few artifacts, few characters(one of each type), play with
            the objects from the game and display at the end the status for each characters
        For extra functionality, you can add validation logic(for example if someone attacks a character
            that doesn’t have enough health points a message is displayed that the character attacked is already dead)
            or logic related to the position on the map(you will consider a 10 per 10 map and when attacking a character,
            verify first the distance of the current character to the attacker it’s smaller than 5 and only in that case
            initiate the attack)
        Scenario for testing:
            Create a Human, a Monster and an Animal, each one with a position on the map decided
            by you and 50 health points and 20 energy points;
            Make the human attack the animal
            Make the monster attack the human
            Make the human attack the monster
            Make the human use an energy artifact that you create
            Display info about the status of each character in the game */

        Human human = new Human("Sam", 5, 2, 50, 20);
        Monster monster = new Monster("Zombie", 3, 4, 50, 20);
        Animal animal = new Animal("Dog", 6, 3, 50, 20);
        Artifact artifact = new Artifact(5, 5, 20, "energy");
        human.attack(animal);
        monster.attack(human);
        human.attack(monster);
        human.addPoints(artifact);

        System.out.println("Points for human: Energy Points - " + human.getEnergyPoints() + " Health Points - " + human.getHealthPoints());
        System.out.println("Points for monster: Energy Points - " + monster.getEnergyPoints() + " Health Points - " + monster.getHealthPoints());
        System.out.println("Points for animal: Energy Points - " + animal.getEnergyPoints() + " Health Points - " + animal.getHealthPoints());
    }
}
