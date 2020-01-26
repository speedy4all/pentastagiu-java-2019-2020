package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public abstract class GameObject {
    public MapLocation currentLocation;

    public GameObject(MapLocation currentLocation) {
        this.currentLocation = currentLocation;
        Map.setSpaceTo(currentLocation, this);
    }

    public MapLocation getCurrentLocation() {
        return currentLocation;
    }
}
