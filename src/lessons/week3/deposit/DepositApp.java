package lessons.week3.deposit;

import java.io.IOError;

public class DepositApp {
    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println(box1);

        Box box2 = new Box(100, 200, 300, "red");
        System.out.println(box2);

        Box box3 = new Box(201, 2002, 3002, "white");
        box3.setDepth(10000000);
        System.out.println(Box.getNrBox());

    }
}
