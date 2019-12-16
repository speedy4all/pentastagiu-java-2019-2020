package com.pentalog.pentastagiu.homework2;

import java.util.Scanner;

public class DemoBank {

    public static void main(String[] args) {
        //create your own user with a given amount of money
        Bank user = new Bank( 6000);

        user.enterPIN();

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation: ");
        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");

        int input = Integer.parseInt(sc.nextLine());
        switch(input) {

            case 1:
                user.withdraw();
                break;

            case 2:
                //deposit
                user.depositMoney();
                break;

            default:
                System.out.println("Error!");
                break;

        }
    } }
