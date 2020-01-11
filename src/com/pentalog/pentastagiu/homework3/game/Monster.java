package com.pentalog.pentastagiu.homework3.game;

public class Monster extends Character implements CanAttack {
    public final static int distance = 4;

    public Monster(CharacterType characterType, String name, int posX, int posY) {
        super(characterType, name, posX, posY);
        setHealthPoints(50);
        setEnergyPoints(20);
    }

    @Override
    public void attack(Character enemy) {
        if (getEnergyPoints() >= 5 && CanAttack.isAttackValid(this, enemy) == true) {
            setEnergyPoints(getEnergyPoints() - 3);
            enemy.setHealthPoints(enemy.getHealthPoints() - 15);
            System.out.printf("%s was attacked by %s!\n", enemy.getName(), this.getName());
            if (enemy.isActive() == false)
                System.out.printf("%s has killed %s!\n", getName(), enemy.getName());
        } else if (CanAttack.isAttackValid(this, enemy) == false) {
            System.out.printf("%s is too far away from %s!\n", enemy.getName(), this.getName());
        }
    }

    public void moveTo(int newPosX, int newPosY) {
        super.moveTo(newPosX, newPosY, distance);
    }
}
