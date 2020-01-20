package com.pentalog.pentastagiu.homework3.game.artifacts;

import com.pentalog.pentastagiu.homework3.game.characters.Map;
import static com.pentalog.pentastagiu.homework3.game.Constants.*;

public class Energy extends Artifact {
    private int x;
    private int y;
    private  int points;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Energy(int x, int y, int points){
        super(x, y, points);
        if (x < MAP_X && y < MAP_Y && Map.myMap[x][y] == 0) {
            this.x = x;
            this.y = y;
            this.points = points;
            Map.myMap[this.getX()][this.getY()] = 3;
        } else {
            System.out.println("Bad value for x and y - energy");
        }

    }
}
