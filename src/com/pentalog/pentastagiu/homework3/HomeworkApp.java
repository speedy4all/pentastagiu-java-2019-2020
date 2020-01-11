package com.pentalog.pentastagiu.homework3;

import com.pentalog.pentastagiu.homework3.bluetooth.*;
import com.pentalog.pentastagiu.homework3.game.*;
import com.pentalog.pentastagiu.homework3.shape.*;
import com.pentalog.pentastagiu.homework3.restaurant.*;

import java.util.*;

public class HomeworkApp {

    public static void testCalculatePerimeterAndArea() {

        // Create all shape objects with reference
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 3);
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(5);

        // Create a list to add the previous created shape objects
        List<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(circle);

        // Create few shape objects without reference and add to the list
        shapes.add(new Square(4));
        shapes.add(new Triangle(4, 4, 6));

        List<Shape> shapesOrderedByArea = new ArrayList<>();
        shapesOrderedByArea.addAll(shapes);
        Collections.sort(shapesOrderedByArea, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                double area1 = o1.calculateArea();
                double area2 = o2.calculateArea();
                if (area1 < area2) return -1;
                else if (area1 > area2) return 1;
                else return 0;
            }
        });
        System.out.println("The largest area is: " + shapesOrderedByArea.get(shapesOrderedByArea.size() - 1).calculateArea());
    }

    public static void testRestaurant() {
        Restaurant vegetarianRestaurant = new Restaurant("Garden", "Palas Iasi", 150, RestaurantType.VEGETARIAN);
        Restaurant fastFoodRestaurant = new Restaurant("KFC", "Palas Iasi", 300, RestaurantType.FAST_FOOD);

        vegetarianRestaurant.addMenu(new Menu("Salads"), 20.5d);
        vegetarianRestaurant.addMenu(new Menu("Fruits"), 40d);
        fastFoodRestaurant.addMenu(new Menu("Chicken Strips"), 15d);
        fastFoodRestaurant.addMenu(new Menu("Fried Chicken"), 23d);


        List<Menu> customer1Command = new ArrayList<>();
        List<Menu> customer2Command = new ArrayList<>();

        //Display all menus
        List<Menu> menus = vegetarianRestaurant.getMenus();
        menus.forEach(p -> System.out.println(p.getName()));
        customer1Command.add(menus.get(0));
        customer1Command.add(menus.get(1));
        vegetarianRestaurant.accommodateGuest(customer1Command);
        customer2Command.add(menus.get(0));
        customer2Command.add(menus.get(0));
        vegetarianRestaurant.accommodateGuest(customer2Command);
        System.out.printf("The income for %s is %f\n", vegetarianRestaurant.getName(), vegetarianRestaurant.getIncome());

        LocalAuthority localAuthority = new LocalAuthority(20);
        System.out.printf("Tax for Restaurant - %s is %f\n", vegetarianRestaurant.getName(), localAuthority.calculateTax(vegetarianRestaurant));

        menus = fastFoodRestaurant.getMenus();
        List<Menu> customer3Command = new ArrayList<>();
        customer3Command.add(menus.get(0));
        customer3Command.add(menus.get(1));
        fastFoodRestaurant.accommodateGuest(customer3Command);
        System.out.printf("The income for %s is %f\n", fastFoodRestaurant.getName(), fastFoodRestaurant.getIncome());
        System.out.printf("Tax for Restaurant - %s is %f\n", fastFoodRestaurant.getName(), localAuthority.calculateTax(fastFoodRestaurant));

    }

    public static void testBluetooth() {
        List<Object> objects = new ArrayList<>();
        objects.add(new Tesla("Tesla Model Y"));
        objects.add(new Tesla("Tesla Model S"));
        objects.add(new SamsungMobile("Samsung S7 Edge"));
        objects.add(new SamsungMobile("Samsung Note 10"));
        objects.add(new ArcticRefrigerator("Arctic Standard 350"));
        objects.add(new ArcticRefrigerator("Arctic Premium 500"));
        objects.add(new Student("George", "Carbune"));

        objects.stream()
                .filter(p -> p instanceof Connectable)
                .map(p -> (Connectable) p)
                .forEach(p -> p.connectToBluetooth());
    }

    public static void testGame() {
        Scene scene = Scene.getInstance();
        Human human = (Human) CharacterFactory.getCharacter(CharacterType.HUMAN, "Vlad", 0, 0);
        Animal animal = (Animal) CharacterFactory.getCharacter(CharacterType.ANIMAL, "Koala", 4, 8);
        Monster monster = (Monster) CharacterFactory.getCharacter(CharacterType.MONSTER, "Showy", 9, 4);
        Monster monster2 = (Monster) CharacterFactory.getCharacter(CharacterType.MONSTER, "Grown", 2, 3);
        Artifact hp = new Artifact(2, 2, ArtifactType.HEALTH, 20);
        Artifact energy = new Artifact(1, 0, ArtifactType.ENERGY, 16);

        scene.displayScene();

        human.attack(animal);
        monster2.attack(human);
        human.attack(monster2);
        System.out.println(human);
        human.moveTo(1, 0);
        monster2.moveTo(2,2);
        System.out.println(monster2);
        System.out.println(human);
        human.attack(monster2);
        human.attack(monster2);
        human.attack(monster2);
        human.attack(monster2);
        human.attack(monster2);
        human.attack(monster2);
        scene.displayScene();
    }

    public static void main(String[] args) {
        //System.out.println("The com.pentalog.pentastagiu.homework3 package should be used to commit all your classes related to homework 3");
        //testCalculatePerimeterAndArea();
        //testRestaurant();
        //testBluetooth();
        //testGame();

    }
}
