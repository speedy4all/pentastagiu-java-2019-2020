package com.pentalog.pentastagiu.homework3.strategyGame;

import java.util.HashMap;
import java.util.Map;

public class positionOnMap {

    private int x,y;

    public positionOnMap() {
        this(0,0);
    }
    public positionOnMap(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    public void setx(int x) {
        this.x = x;
    }
    public void sety(int y) {
        this.y = y;
    }

    public void getPositionOnMap(){

        System.out.println(getx() +" : "+gety());
    }

}
