package com.pentalog.pentastagiu.week3.deposit;

public class DepositApp {

    public static void main(String[] args) {
       Box box = new Box();

        /*
        Box box2 = new Box(1,2,3);
        System.out.println(box2);

        Box box3 = new Box(4,5,6, "Blue");
        System.out.println(box3);

        System.out.println(Box.counterOfBoxes);
        Box.printInfoAboutBoxes();*/

        int initialValue = 10;
        box.modifyLength(initialValue);
        System.out.println("initialValue: " + initialValue);

        System.out.println(box);
        Box.modify(box);
        System.out.println(box);
        box = null;

    }
}
