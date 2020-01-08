package com.pentalog.pentastagiu.homework3.strategyGame;



public class Items {

    private int x,y;

    public Items(int x, int y) {
        this.x = (0 < x && x < 10 ? x : 10);
        this.y = (0 < y && y < 10 ? y : 10);

    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
            this.x=x;
        }





    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
