package com.pentalog.pentastagiu.homework2.bank;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.23f);
        System.out.println(bankAccount);
        BankAccount.withdrawAccount(bankAccount, 180);
        System.out.println(bankAccount);
        BankAccount.debitAccount(bankAccount, 570);
        System.out.println(bankAccount);
    }
}
