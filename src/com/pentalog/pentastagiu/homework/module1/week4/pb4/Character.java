package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public abstract class Character extends GameObject {
    protected int hp, energy;

    public Character(MapLocation currentLocation, int hp, int energy) {
        super(currentLocation);
        this.hp = hp;
        this.energy = energy;
    }

    public boolean canMove(Direction d)
    {
        MapLocation newLocation = currentLocation.add(d);
        return (newLocation.x > 0 && newLocation.x < Map.MAP_HEIGHT && newLocation.y > 0 && newLocation.y < Map.MAP_WIDTH && Map.isMapSpaceEmpty(newLocation));
    }

    public void move(Direction d)
    {
        if(canMove(d)) {
            Map.clearSpace(currentLocation);
            currentLocation = currentLocation.add(d);
            Map.setSpaceTo(currentLocation, this);
        }
    }

    public void useArtifact(Artifact a)
    {
        if(a == null || !currentLocation.isAdjacentTo(a.getCurrentLocation())) {
            System.out.println("Artifact is not in range");
            return;
        }
        if(a instanceof EnergyArtifact) {
            energy += a.pointsGiven;
            return;
        }
        if(a instanceof HealthArtifact) {
            hp += a.pointsGiven;
            return;
        }
        System.out.println("Invalid artifact");
    }

    public void takeDmg(int amount)
    {
        hp-=amount;
        if(hp <= 0)
            die();
    }

    private void die()
    {
        Map.clearSpace(currentLocation);
    }

    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", energy=" + energy +
                ", currentLocation=" + currentLocation +
                '}';
    }
}
