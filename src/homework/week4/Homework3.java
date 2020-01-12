package homework.week4;

import homework.week4.Calculator.Circle;
import homework.week4.Calculator.Rectangle;
import homework.week4.Calculator.Square;
import homework.week4.Calculator.Triangle;
import homework.week4.Calculator.classes.Shape;
import homework.week4.Restaurants.*;
import homework.week4.bluetooth.*;
import homework.week4.game.Artifact;
import homework.week4.game.Board;
import homework.week4.game.Character;
import homework.week4.game.Point;

import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.Arrays;


public class Homework3 {

    public static void main(String[] args) {
        calculator();
        restaurants();
        blueTooth();
        game();
    }

    public static void calculator() {
        Triangle.Builder builder = new Triangle.Builder();

        Shape cerc = new Circle(5);
        Shape dreptunghi = new Rectangle(12, 10);
        Shape patrat = new Square(7);
        Shape triunghi = builder.withPoint1(0,0)
                .withPoint2(4,6)
                .withPoint3(13,0)
                .build();

        System.out.println("Circle's perimeter: " + cerc.calcPerimeter() + "\n" +
                "Rectangle's perimeter: " + dreptunghi.calcPerimeter() + "\n" +
                "Square's perimeter: " + patrat.calcPerimeter() + "\n" +
                "Triangle's perimeter: " + triunghi.calcPerimeter() + "\n\n");

        System.out.println("Circle's area: " + cerc.calcArea() + "\n" +
                "Rectangle's area: " + dreptunghi.calcArea() + "\n" +
                "Square's area: " + patrat.calcArea() + "\n" +
                "Triangle's area: " + triunghi.calcArea() + "\n\n");

    }

    public static void restaurants() {
        Restaurant fastfood = new FastFood("fastfood");
        Restaurant vegan = new Vegan("vegan");

        Guest guest1 = new Guest("Ion");
        Guest guest2 = new Guest("Gigi");

        Menu menu1 = new Menu("shaorma", 120);
        Menu menu2 = new Menu("kebab", 150);

        Menu veganMenu = new Menu("salata", 90);
        Menu veganMenu2 = new Menu("water", 500);

        fastfood.addMenus(menu1);
        fastfood.addMenus(menu2);

        vegan.addMenus(veganMenu);
        vegan.addMenus(veganMenu2);

        fastfood.accomodateGuests(guest1, menu2);

        vegan.accomodateGuests(guest2, veganMenu2);

        System.out.println("vegan income : " + vegan.getIncome());
        System.out.println("vegan restaurant income after taxes : " + vegan.payTaxes());
        System.out.println("fastfood income : " + fastfood.getIncome());
        System.out.println("fastfood restaurant income after taxes : " + fastfood.payTaxes());

    }

    public static void blueTooth() {
        Object[] objects = new Object[] {
                new Car("BMW", 300),
                new Phone("OnePlus", "Android"),
                new Refrigerator("Artic", true),
                new Student("Gigi")
        };

        for (Object obj: objects) {
            if (obj instanceof Connectable) {
                ((Connectable) obj).connetToBluetooth();
            }
        }
    }

    public static void game() {
        Board map = new Board(10, 10);

        Artifact energy = Artifact.EnergyArtifact;
        energy.setBonus(75);
        energy.setLocation(new Point(5, 5));

        Character human = Character.HUMAN;
        human.setName("Gigi");
        human.setPosition(new Point(0,0));
        human.setDamage(10);

        Character dragon = Character.MONSTER;
        dragon.setName("Fire Dragon");
        dragon.setPosition(new Point(3, 7));
        dragon.setDamage(15);

        Character animal = Character.ANIMAL;
        animal.setName("Bear");
        animal.setPosition(new Point(3,3));

        map.addCharacter(human);
        map.addCharacter(dragon);
        map.addCharacter(animal);
        map.addArtifact(energy);

        human.attack(animal);
        dragon.attack(human);
        human.attack(dragon);
        System.out.println(human.toString());
        human.consumeArtifact(energy);
        System.out.println(energy.toString());
        System.out.println(human.toString());

        System.out.println();

        map.printMap();


    }
}
