package com.pentalog.pentastagiu.homework3.game.characters;

import com.pentalog.pentastagiu.homework3.game.artifacts.Energy;
import com.pentalog.pentastagiu.homework3.game.artifacts.Health;

public class Animal {
    private String name;
    private int healthPoints;
    private int energyPoints;
    private int xPosition;
    private int yPosition;

    public Animal(String name, int healthPoints, int energyPoints, int xPosition, int yPosition) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        System.out.println(toString());
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void getAnimalPosition(){
        System.out.println("Animal x position: " + getxPosition() + " animal Y position: " + getyPosition());
    }

    public void updateAnimal(int health, int energy){
        healthPoints += health;
        energyPoints += energy;
        System.out.println("New animal health points: " + healthPoints + " and new energy points: " +
                            energyPoints);
    }

    public void animalAttack(int attackPoints, Object obj){
        if (obj instanceof Human){
            if (((Human) obj).getHealthPoints() <= 0 || attackPoints > ((Human) obj).getHealthPoints() ){
                System.out.println("Human is dead");
            }
            else {
                int humanHealth = ((Human) obj).getHealthPoints();
                humanHealth -= attackPoints;
                ((Human) obj).setHealthPoints(humanHealth);
                System.out.println("Human health points: " + humanHealth);
            }
        }
        else if (obj instanceof Monster){
            if (((Monster) obj).getHealthPoints() <= 0 || attackPoints > ((Monster) obj).getHealthPoints()){
                System.out.println("Monster is dead");
            }
            else{
                int monsterHealth = ((Monster) obj).getHealthPoints();
                monsterHealth -= attackPoints;
                ((Monster)obj).setHealthPoints(monsterHealth);
                System.out.println("Monster health points: " + monsterHealth);
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }


}
