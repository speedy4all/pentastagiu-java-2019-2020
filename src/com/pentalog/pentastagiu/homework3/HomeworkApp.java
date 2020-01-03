package com.pentalog.pentastagiu.homework3;

import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework3 package should be used to commit all your classes related to homework 3");

        Scanner in = new Scanner(System.in);
        boolean canContinue=true;
        while(canContinue){
            System.out.println("Select app(perimeter, restaurant, bluetooth, game): ");
            String app = in.nextLine().toLowerCase();

            if(app.equals("perimeter")) {
                perimeterApp();
            } else if (app.equals("restaurant")) {
                restaurantApp();
            } else if (app.equals("bluetooth")) {
                bluetoothApp();
            } else if (app.equals("game")) {
                gameApp();
            } else {
                System.out.println("App does not exist");
            }
            System.out.println("\nDo you want to try another app?(y/n)");
            if(!in.nextLine().equals("y"))
                canContinue=false;
        }
    }

    public static void perimeterApp() {
        Square square = new Square();
        square.setLength(2);
        System.out.println("Square perimeter " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2);
        rectangle.setWidth(3);
        System.out.println("Rectangle perimeter " + rectangle.calculatePerimeter());

        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("Circle perimeter " + circle.calculatePerimeter());

        Triangle triangle = new Triangle();
        triangle.setFirstLength(2);
        triangle.setSecondLength(3);
        triangle.setThirdLength(4);
        System.out.println("Triangle perimeter " + triangle.calculatePerimeter());

    }

    public static void restaurantApp() {
        VegetarianRestaurant vegetarianRestaurant = new VegetarianRestaurant("Vegetarian", 1000);
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant("Fast Food", 500);

        Guest vegetarianGuest1 = new Guest(vegetarianRestaurant.getMenuPrice(), "vegetarian");
        Guest vegetarianGuest2 = new Guest(vegetarianRestaurant.getMenuPrice(), "vegetarian");
        Guest vegetarianGuest3 = new Guest(vegetarianRestaurant.getMenuPrice(), "vegetarian");

        vegetarianRestaurant.setGuestsNo(Guest.VEGETARIAN_GUESTS_NO);
        vegetarianRestaurant.setIncome(vegetarianGuest1.getConsumption()+vegetarianGuest2.getConsumption()+vegetarianGuest3.getConsumption());

        System.out.println("Vegetarian restaurant guests no: " + vegetarianRestaurant.getGuestsNo());
        System.out.println("Vegetarian restaurant income: " + vegetarianRestaurant.getIncome());
        System.out.println("Vegetarian restaurant tax: " + vegetarianRestaurant.calculateIncomeTax());

        Guest fastFoodGuest1 = new Guest(fastFoodRestaurant.getMenuPrice(), "fast food");
        Guest fastFoodGuest2 = new Guest(fastFoodRestaurant.getMenuPrice(), "fast food");
        Guest fastFoodGuest3 = new Guest(fastFoodRestaurant.getMenuPrice(), "fast food");

        fastFoodRestaurant.setGuestsNo(Guest.FAST_FOOD_GUESTS_NO);
        fastFoodRestaurant.setIncome(fastFoodGuest1.getConsumption()+fastFoodGuest2.getConsumption()+fastFoodGuest3.getConsumption());

        System.out.println("Fast food restaurant guests no: " + fastFoodRestaurant.getGuestsNo());
        System.out.println("Fast food restaurant income: " + fastFoodRestaurant.getIncome());
        System.out.println("Fast food restaurant tax: " + fastFoodRestaurant.calculateIncomeTax());
    }

    public static void bluetoothApp() {
        Student student = new Student("Pierre");
        Car carA = new Car("ACar");
        Car carB = new Car("BCar");
        Phone phoneA = new Phone("APhone");

        List<Object> objectList = new ArrayList<>();
        objectList.add(student);
        objectList.add(carA);
        objectList.add(carB);
        objectList.add(phoneA);

        for(Object object : objectList){
            if(object instanceof Car)
                ((Car) object).connectToBluetooth();
            else if(object instanceof Phone)
                ((Phone) object).connectToBluetooth();
        }
    }

    public static void gameApp() {
        //initialization
        EnergyArtifact energyArtifact1 = new EnergyArtifact(2, 2, 40);
        EnergyArtifact energyArtifact2 = new EnergyArtifact(0, 3, 20);
        HealthArtifact healthArtifact1 = new HealthArtifact(3, 1, 100);
        HealthArtifact healthArtifact2 = new HealthArtifact(5, 3, 40);

        List<Artifact> artifactList = new ArrayList<>();
        artifactList.add(energyArtifact1);
        artifactList.add(energyArtifact2);
        artifactList.add(healthArtifact1);
        artifactList.add(healthArtifact2);

        MonsterCharacter monster = new MonsterCharacter("Monster", 50, 20, 5, 0);
        HumanCharacter human = new HumanCharacter("Bob", 50, 20, 0, 0);

        Scanner in = new Scanner(System.in);
        //game management
        while(MonsterCharacter.MONSTER_NO!=0) {
            //take artifact
            for(Artifact artifact : artifactList)
                if(human.canGetArtifact(artifact)){
                    if(artifact instanceof HealthArtifact)
                        System.out.println("You took a health artifact");
                    else if(artifact instanceof EnergyArtifact)
                        System.out.println("You took an energy artifact");

                    human.addArtifact(artifact);
                    break;
                }

            //fight
            if(human.getDistanceToMonster(monster)<=1)
                System.out.println("Attack started");
            while(human.getDistanceToMonster(monster)<=1) {
                //monster gets attacked
                if(monster.getEnergyPoints()>0) {
                    monster.setHealthPoints(monster.getHealthPoints()-10);
                    monster.setEnergyPoints(monster.getEnergyPoints()-3);
                }

                //human gets attacked
                //checks if human has no energy
                if(human.getEnergyPoints()>0) {
                    human.setHealthPoints(human.getHealthPoints()-15);
                    human.setEnergyPoints(human.getEnergyPoints()-5);
                }

                //checks if human has health artifact
                else if (human.getEnergyArtifactsNo()>0) {
                    human.setEnergyPoints(human.getEnergyPoints()+human.useEnergyArtifact());
                    System.out.println("You used an energy artifact");
                }

                //checks if monster died
                if(monster.getHealthPoints()<=0) {
                    System.out.println("Monster died!");
                    return;
                }

                //checks if human is dying
                if(human.getHealthPoints()>=1) {
                    //checks if human has health artifact
                    if(human.getHealthArtifactsNo()>0) {
                        human.setHealthPoints(human.getHealthPoints()+human.useHealthArtifact());
                        System.out.println("You used a health artifact");
                    }
                } else if (human.getHealthPoints()<=0){
                    System.out.println("You died");
                    return;
                }
            }

            //movement
            System.out.println("Where do you want to move?(f, b, l, r)");
            String movement = in.nextLine();
            if(movement.equals("f")) {
                if(human.getyPosition()+1<=10)
                    human.setyPosition(human.getyPosition()+1);
                else
                    System.out.println("You cannot go forward");
            } else if(movement.equals("b")) {
                if(human.getyPosition()-1>=0)
                    human.setyPosition(human.getyPosition()-1);
                else
                    System.out.println("You cannot go back");
            } else if(movement.equals("l")) {
                if(human.getxPosition()-1>=0)
                    human.setxPosition(human.getxPosition()-1);
                else
                    System.out.println("You cannot go left");
            } else if(movement.equals("r")) {
                if(human.getxPosition()+1<=10)
                    human.setxPosition(human.getxPosition()+1);
                else
                    System.out.println("You cannot go right");
            }
        }

        System.out.println("All monsters died! You won!");
    }
}
