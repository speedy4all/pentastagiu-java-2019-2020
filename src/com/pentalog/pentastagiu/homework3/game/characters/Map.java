package com.pentalog.pentastagiu.homework3.game.characters;

import static com.pentalog.pentastagiu.homework3.game.Constants.*;

public interface Map {

    public static int[][] myMap = new int[MAP_X][MAP_Y];

    public static void map() {
        for (int i = 0; i < MAP_X; i++) {
            for (int j = 0; j < MAP_Y; j++) {
                myMap[i][j] = 0;
            }
        }
    }

}
