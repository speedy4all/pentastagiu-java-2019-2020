package com.pentalog.pentastagiu.homework2.bank;

public class BankApp {

    public static void main(String[] args){

        Account testAccount = new Account();

        testAccount.depositMoney(100000);
        testAccount.withdrawMoney(500);
        testAccount.withdrawMoney(4168168);
    }

}
