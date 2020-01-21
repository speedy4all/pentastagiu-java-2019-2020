package com.pentalog.pentastagiu.homework5;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ICacheDispencer cashDispenser = new CashDispencer();
        cashDispenser.startSession(100, 400d);
        cashDispenser.startSession(101, 200d);

        if (cashDispenser.getAccountBalance(100) < 10000) {
            cashDispenser.deposit(100, 1000d);
        }
        cashDispenser.withdraw(100, 20);
        cashDispenser.endSession(100);
        System.out.println();

        if (cashDispenser.getAccountBalance(101) < 10000) {
            cashDispenser.deposit(101, 1000d);
        }
        try{
            cashDispenser.withdraw(101, 20000);
        }catch (InsufficientFoundsException ex){
            System.out.print(ex.getMessage());
        }

        cashDispenser.endSession(101);

    }
}


