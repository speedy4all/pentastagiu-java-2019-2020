package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public class Human extends Character implements Attackable{
    final int ENERGY_USED_PER_ATTACK = 5, DAMAGE_DONE_PER_ATTACK = 10;

    public Human(MapLocation currentLocation, int hp, int energy) {
        super(currentLocation, hp, energy);
    }

    @Override
    public void attack(Character target) {
        if(energy < ENERGY_USED_PER_ATTACK){
            System.out.println("Not enough energy");
            return;
        }
        if(!currentLocation.isAdjacentTo(target.getCurrentLocation())){
            System.out.println("Not in range");
            return;
        }
        energy-=ENERGY_USED_PER_ATTACK;
        target.takeDmg(DAMAGE_DONE_PER_ATTACK);
    }
}
