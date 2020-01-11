package com.pentalog.pentastagiu.homework3.game;

public interface CanAttack {
    void attack(Character character);

    static boolean isAttackValid(Character me, Character enemy) {
        double xDistanceSquared = Math.pow(me.getPosX() - enemy.getPosX(), 2);
        double yDistanceSquared = Math.pow(me.getPosY() - enemy.getPosY(), 2);
        if (Math.sqrt(xDistanceSquared + yDistanceSquared) <= 5) return true;
        return false;
    }
}
