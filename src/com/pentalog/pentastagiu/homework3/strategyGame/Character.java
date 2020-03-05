package com.pentalog.pentastagiu.homework3.strategyGame;

public class Character extends Items {

    //    private static double dis2;
    private int atackForce;
    private String name;
    private int energyPoints;
    private int healthPoints;

    public Character(int x, int y, int atackForce, String name, int energyPoints, int healthPoints) {
        super(x, y);
        this.atackForce = atackForce;
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

    public void acquireArtifact(Artifact artifact) {
        if (artifact instanceof EnergyArtifact) {
            energyPoints = energyPoints + ((EnergyArtifact) artifact).getEnergyPoint();
            System.out.println("Energy artifact taken " + ((EnergyArtifact) artifact).energyPoint);
        } else if (artifact instanceof HealthArtifact) {
            System.out.println("Health artifact taken " + ((HealthArtifact) artifact).healthPoint);
            healthPoints = healthPoints + ((HealthArtifact) artifact).getHealthPoint();
        }


    }

    public static double calculateDistance(Items items1, Items items2) {

        double dis2;

        dis2 = Math.sqrt((items2.getX() - items1.getX()) * ((items2.getX() - items1.getX()) + (items2.getY() - items1.getY()) * (items2.getY() - items1.getY())));
        if (Double.isNaN(dis2)) {
            dis2 = 6.0;
        }
        System.out.println("distance between" + "(" + items1.getX() + "," + items1.getY() + ")," + "(" + items2.getX() + "," + items2.getY() + ")===>" + dis2);

        return dis2;


    }

    public static void attack(Character attacker, Character target) {
        if (calculateDistance(attacker, target) < 5 && attacker.atackForce < target.healthPoints) {
            System.out.println(attacker.getName() + " ataca " + target.getName());
            if (attacker instanceof Humans) {
                attacker.energyPoints = attacker.energyPoints - 5;
                target.healthPoints = target.healthPoints - attacker.atackForce;
            } else if (attacker instanceof Monster) {
                attacker.energyPoints = attacker.energyPoints - 3;
                target.healthPoints = target.healthPoints - attacker.atackForce;
            } else System.out.println("out of range");
        }
    }

    public void curentStatus() {
        System.out.println(getName() + " Current position:" + getX() + " " + getY() + " health " + healthPoints + " energy " + energyPoints);
    }


}
