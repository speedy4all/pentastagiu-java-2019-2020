package com.pentalog.pentastagiu.homework3.strategyGame;

public class Character extends Items {


    private String name;
    private int energyPoints, healthPoints;

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



    public void acquireArtifact(Artifact artifact){
        if (artifact instanceof EnergyArtifact){
            energyPoints=energyPoints+((EnergyArtifact) artifact).getEnergyPoint();

        } else if (artifact instanceof HealthArtifact){

            healthPoints=healthPoints+((HealthArtifact) artifact).getHealthPoint();
        }
    }

    public void curentStatus(){
        System.out.println("Current position:" + getX()+" "+getY() + " health "+healthPoints + " energy "+energyPoints);
    }
}
