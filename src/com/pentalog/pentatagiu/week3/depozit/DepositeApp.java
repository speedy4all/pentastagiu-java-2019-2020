package com.pentalog.pentatagiu.week3.depozit;

public class DepositeApp {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box);

        Box box2= new Box(1,5,8);
        System.out.println(box2);

        Box box3= new Box(1, 5, 8 ,"nero");
        System.out.println(box3);

        System.out.println(Box.counterofboxes);
        Box.printinfoAboutBoxes();

        System.out.println(box);
        Box.modify(box);
        System.out.println(box);
    }
}
