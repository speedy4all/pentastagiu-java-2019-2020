package com.pentalog.pentastagiu.homework3.strategyGame;

public class Character extends Items {


//    private static double dis2;
    private String name;
    private int energyPoints;
    private int healthPoints;

    public int getAtackForce() {
        return atackForce;
    }

    public void setAtackForce(int atackForce) {
        this.atackForce = atackForce;
    }

    private int atackForce;


    public Character(int x, int y, String name, int energyPoints, int healthPoints) {
        super(x, y);
        this.name = name;
        this.energyPoints = energyPoints;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }


    public void acquireArtifact(Artifact artifact) {
        if (artifact instanceof EnergyArtifact) {
            energyPoints = energyPoints + ((EnergyArtifact) artifact).getEnergyPoint();

        } else if (artifact instanceof HealthArtifact) {

            healthPoints = healthPoints + ((HealthArtifact) artifact).getHealthPoint();
        }
    }

    public static double calculateDistance(Items items1, Items items2) {

        double dis2;

        dis2 = Math.sqrt((items2.getX() - items1.getX()) * ((items2.getX() - items1.getX()) + (items2.getY() - items1.getY()) * (items2.getY() - items1.getY())));
        System.out.println("distance between" + "(" + items1.getX() + "," + items1.getY() + ")," + "(" + items2.getX() + "," + items2.getY() + ")===>" + dis2);
        return dis2;

    }

    public static void attack(Character attacker, Character target) {
        if (calculateDistance(attacker,target) < 5 && target.healthPoints<attacker.atackForce) {
            if (attacker instanceof Humans) {
                attacker.energyPoints = attacker.energyPoints - 5;
                target.healthPoints = target.healthPoints - 10;
            } else if (attacker instanceof Monster) {
                attacker.energyPoints = attacker.energyPoints - 3;
                target.healthPoints = target.healthPoints - 15;
            } else System.out.println("out of range");
        }
    }

    public void curentStatus() {
        System.out.println(getName()+" Current position:" + getX() + " " + getY() + " health " + healthPoints + " energy " + energyPoints);
    }


}
