package homework.week4.game.business;

import homework.week4.game.domain.*;

import javax.swing.*;

public class GameTable implements GameInterface {
    Spot[][] boxes;

    public GameTable() {
        this.resetGameTable();
    }

    //Resetting game table with starting positions for all the participating parties of the game.
    private void resetGameTable() {
        // initialize all boxes without any piece
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                boxes[i][j] = new Spot(i, j, null);
            }
        }
        //set artifacts positions and values
        Artifacts a1 = new Artifacts();
        a1.setHealth(15);
        a1.setEnergy(0);
        boxes[3][4] = new Spot(3, 4, a1);

        Artifacts a2 = new Artifacts();
        a2.setHealth(0);
        a2.setEnergy(5);
        boxes[2][1] = new Spot(2, 1, a2);

        Artifacts a3 = new Artifacts();
        a3.setHealth(0);
        a3.setEnergy(5);
        boxes[7][8] = new Spot(7, 8, a3);

        Artifacts a4 = new Artifacts();
        a4.setHealth(10);
        a4.setEnergy(0);
        boxes[8][5] = new Spot(8, 5, a4);

        Artifacts a5 = new Artifacts();
        a5.setHealth(0);
        a5.setEnergy(15);
        boxes[4][7] = new Spot(4, 7, a5);

        Artifacts a6 = new Artifacts();
        a6.setHealth(15);
        a6.setEnergy(0);
        boxes[7][2] = new Spot(7, 2, a6);

        //set human starting position and stats
        Human h = new Human();
        h.setAttackStrength(10);
        h.setHitPoints(50);
        h.setEnergyPoints(20);
        boxes[0][0] = new Spot(0, 0, h);

        //set monster starting position and stats
        Monster m = new Monster();
        m.setAttackStrength(15);
        m.setHitPoints(50);
        m.setEnergyPoints(20);
        boxes[5][5] = new Spot(5, 5, m);

        //set animal(critters) position and starting stats
        Animal critter1 = new Animal();
        critter1.setHitPoints(1);
        boxes[1][3] = new Spot(1, 3, critter1);

        Animal critter2 = new Animal();
        critter2.setHitPoints(1);
        boxes[6][5] = new Spot(6, 5, critter2);
    }

    public void movement() {
        Human h = new Human();
        Artifacts a1 = new Artifacts();
        Artifacts a2 = new Artifacts();
        Artifacts a3 = new Artifacts();
        Artifacts a4 = new Artifacts();
        Artifacts a5 = new Artifacts();
        Artifacts a6 = new Artifacts();
        Animal critter1 = new Animal();
        Animal critter2 = new Animal();
        Monster m = new Monster();

        Spot humanSpot = new Spot(0, 0, h);
        boxes[0][0] = humanSpot;

        do {
            int oldX = humanSpot.getX();
            int oldY = humanSpot.getY();
            int newX = humanSpot.setX((Integer.parseInt(JOptionPane.showInputDialog("Set X position: "))));
            int newY = humanSpot.setY((Integer.parseInt(JOptionPane.showInputDialog("Set Y position: "))));
            if ((oldX + newX > oldX + 5) || (oldY + newY > oldY + 5)) {
                System.out.println("Unable to move more than 5 spaces at a time! ");
                humanSpot.setX((Integer.parseInt(JOptionPane.showInputDialog("Set X position: "))));
                humanSpot.setY((Integer.parseInt(JOptionPane.showInputDialog("Set Y position: "))));
            } else if ((newX > 10) || (newY > 10)) {
                System.out.println(" you are out of the map, move impossible!");
            }
            newX = humanSpot.getX();
            newY = humanSpot.getY();
            if (boxes[newX][newY] == boxes[3][4]) {
                int heathIncrease = a1.getHealth() + h.getHitPoints();
                h.setHitPoints(heathIncrease);
                System.out.println("Human HP points increased by " + a1.getHealth() + " !");
                System.out.println("HP: " + h.getHitPoints());
                boxes[3][4] = new Spot(3, 4, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[2][1]) {
                int energyIncrease = a2.getEnergy() + h.getEnergyPoints();
                h.setEnergyPoints(energyIncrease);
                System.out.println("Human energy points increased by " + a2.getEnergy() + " !");
                System.out.println("Energy: " + h.getEnergyPoints());
                boxes[2][1] = new Spot(2, 1, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[7][8]) {
                int energyIncrease = a3.getEnergy() + h.getEnergyPoints();
                h.setEnergyPoints(energyIncrease);
                System.out.println("Human energy points increased by " + a3.getEnergy() + " !");
                System.out.println("Energy: " + h.getEnergyPoints());
                boxes[7][8] = new Spot(7, 8, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[8][5]) {
                int heathIncrease = a4.getHealth() + h.getHitPoints();
                h.setHitPoints(heathIncrease);
                System.out.println("Human HP points increased by " + a4.getHealth() + " !");
                System.out.println("HP: " + h.getHitPoints());
                boxes[8][5] = new Spot(8, 5, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[4][7]) {
                int energyIncrease = a5.getEnergy() + h.getEnergyPoints();
                h.setEnergyPoints(energyIncrease);
                System.out.println("Human energy points increased by " + a5.getEnergy() + " !");
                System.out.println("Energy: " + h.getEnergyPoints());
                boxes[4][7] = new Spot(4, 7, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[7][2]) {
                int heathIncrease = a6.getHealth() + h.getHitPoints();
                h.setHitPoints(heathIncrease);
                System.out.println("Human HP points increased by " + a6.getHealth() + " !");
                System.out.println("HP: " + h.getHitPoints());
                boxes[7][2] = new Spot(7, 2, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[1][3]) {
                System.out.println("You have found an animal and killed it! No bonus awards, you have just taken it's place");
                critter1.setHitPoints(0);
                boxes[1][3] = new Spot(1, 3, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[6][5]) {
                System.out.println("You have found an animal and killed it! No bonus awards, you have just taken it's place");
                critter2.setHitPoints(0);
                boxes[6][5] = new Spot(6, 5, h);
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
            } else if (boxes[newX][newY] == boxes[5][5]) {
                System.out.println("You have found the monster!");
                System.out.println("You have: \n" + "HP: " + h.getHitPoints() + "\n" + "Energy: " + h.getEnergyPoints() + "\n");
                System.out.println("The monster has: \n" + "HP: " + m.getHitPoints() + "\n" + "Energy: " + m.getEnergyPoints() + "\n");
                h.setAttack(Boolean.parseBoolean(JOptionPane.showInputDialog("Type true/false for intention of attack")));
                if (h.isAttack()) {

                    do {
                        int oldHumanHP = h.getHitPoints();
                        int oldMonsterHP = m.getHitPoints();
                        if (h.getEnergyPoints() > 0) {
                            int newMonsterHP = oldMonsterHP - h.getAttackStrength();
                            m.setHitPoints(newMonsterHP);
                            System.out.println("Monster HP at " + newMonsterHP);
                            h.setEnergyPoints(h.getEnergyPoints() - 5);
                            System.out.println("Human energy at " + h.getEnergyPoints());
                        } else {
                            System.out.println("Human out of energy!");
                        }
                        if (m.getEnergyPoints() > 0) {
                            int newHumanHP = oldHumanHP - m.getAttackStrength();
                            h.setHitPoints(newHumanHP);
                            System.out.println("Human HP at " + newHumanHP);
                            m.setEnergyPoints(m.getEnergyPoints() - 3);
                            System.out.println("Monster energy at " + m.getEnergyPoints());
                        } else {
                            System.out.println("Monster out of energy!");
                        }
                    } while ((h.getHitPoints() < 0) || (m.getHitPoints() < 0));
                    if (h.getHitPoints() <= 0) {
                        System.out.println("You're dead! Game Over!");
                    }
                    System.out.println("Congratulations, you have slain the monster! Victory is yours! ");
                }
            } else {
                boxes[oldX][oldY] = new Spot(oldX, oldY, null);
                boxes[newX][newY] = new Spot(newX, newY, h);
            }
        } while ((h.getHitPoints() < 0) || (m.getHitPoints() < 0));
    }
}
