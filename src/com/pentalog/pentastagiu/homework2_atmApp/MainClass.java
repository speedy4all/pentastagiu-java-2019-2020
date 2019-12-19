package com.pentalog.pentastagiu.homework2_atmApp;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        //objects created
        UserDetails userBobleanca = new UserDetails("bobleanca", "Bobleanca", "Dana");
        UserDetails userAxinte = new UserDetails("axinte", "Axinte", "Andrei");
        Card cardBobleanca = new Card("2341211893681323", 1221, userBobleanca);
        Card cardAxinte = new Card("3489743266090123", 2242, userAxinte);
        AtmOperations atm = new AtmOperations();
        Scanner scan = new Scanner(System.in);


        Integer pinCard;
        Double myBalance = 0.00, withdraw = 0.00, deposit = 0.00;


        //login user based on pin
        System.out.println("Hello user! Please enter your pin(------1221 or 2242 -----)");
        pinCard = scan.nextInt();
        while (!(cardBobleanca.getPinCard().equals(pinCard) || cardAxinte.getPinCard().equals(pinCard))) {
            System.out.println("Wrong pin! Retype your pin");
            pinCard = scan.nextInt();
        }

        //atm operation
        if (cardBobleanca.getPinCard().equals(pinCard) || cardAxinte.getPinCard().equals(pinCard)) {
            atm.displayMenu(myBalance, withdraw, deposit);
        }
    }

}
