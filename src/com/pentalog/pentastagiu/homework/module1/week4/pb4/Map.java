package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public class Map {
    static final int MAP_WIDTH = 10, MAP_HEIGHT = 10;
    private static GameObject[][] map = new GameObject[MAP_HEIGHT][MAP_WIDTH];

    public static boolean isMapSpaceEmpty(MapLocation location)
    {
        return map[location.x][location.y] == null;
    }

    public static void clearSpace(MapLocation location)
    {
        map[location.x][location.y] = null;
    }

    public static void setSpaceTo(MapLocation location, GameObject objectToSetTo)
    {
        map[location.x][location.y] = objectToSetTo;
    }
}
