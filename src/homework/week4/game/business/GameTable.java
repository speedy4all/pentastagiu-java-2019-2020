package homework.week4.game.business;

import homework.week4.game.domain.*;

import javax.swing.*;
import java.util.Scanner;

public class GameTable {
    private Spot[][] boxes;

    public GameTable(){
        this.resetGameTable();
    }

    public Spot getBox(int x, int y)
    {
        if (x < 0 || x > 10 || y < 0 || y > 10) {
            try {
                throw new Exception("Index out of bound");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return boxes[x][y];
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
        boxes[3][4] = new Spot(3,4,a1);
        Artifacts a2 = new Artifacts();
        a2.setHealth(0);
        a2.setEnergy(5);
        boxes[2][1] = new Spot(2,1,a2);
        Artifacts a3 = new Artifacts();
        a3.setHealth(0);
        a3.setEnergy(5);
        boxes[7][8] = new Spot(7,8,a3);
        Artifacts a4 = new Artifacts();
        a4.setHealth(10);
        a4.setEnergy(0);
        boxes[8][5] = new Spot(8,5,a4);
        Artifacts a5 = new Artifacts();
        a5.setHealth(0);
        a5.setEnergy(15);
        boxes[4][7] = new Spot(4,7,a5);
        Artifacts a6 = new Artifacts();
        a6.setHealth(15);
        a6.setEnergy(0);
        boxes[7][2] = new Spot(7,2,a6);
        //set human starting position and stats
        Human h = new Human();
        h.setAttackStrength(10);
        h.setHitPoints(50);
        h.setEnergyPoints(20);
       // boxes[0][0]= new Spot(0,0,h);
        //set monster starting position and stats
        Monster m = new Monster();
        m.setAttackStrength(15);
        m.setHitPoints(50);
        m.setEnergyPoints(20);
        boxes[9][9] = new Spot(9,9,m);
        //set animal(critters) position and starting stats
        Animal critter1 = new Animal();
        critter1.setHitPoints(1);
        boxes[1][3] = new Spot(1,3,critter1);
        Animal critter2 = new Animal();
        critter2.setHitPoints(1);
        boxes[6][5] = new Spot(6,5,critter2);
    }

    void move(){
        Human h = new Human();
        Spot humanSpot = new Spot(0,0,h);
        boxes[0][0] = humanSpot;
        humanSpot.setX((Integer.parseInt(JOptionPane.showInputDialog("Set X position: "))));
        humanSpot.setY((Integer.parseInt(JOptionPane.showInputDialog("Set Y position: "))));
        boxes[humanSpot.getX()][humanSpot.getY()] = new Spot(humanSpot.getX(),humanSpot.getY(),h);
    }
}
