package com.pentalog.pentastagiu.homework5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<< Ex 1 >>>>>>>>>>>>>>>>>\n");
        double rand = Math.random();
        ArrayList<Circle> circleArray = new ArrayList<>();

        while (rand > 0.01) {
            circleArray.add(new Circle((int) (100 * rand)));
            rand = Math.random();
        }
        for (int i = 0; i < circleArray.size(); i++) {
            System.out.println(circleArray.get(i));
        }

    }

}
