package com.pentalog.pentastagiu.homework4.game.domain;

public class Human extends Piece {

    private int attackStrength;
    private int hitPoints;
    private int energyPoints;
    private boolean attack;

    public boolean isAttack() {
        return attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }
    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    @Override
    public String toString() {
        return "Character type: Human \n" +
                "HP: " + hitPoints + "\n" +
                "Energy: " + energyPoints + "\n";
    }
}
