package com.pentalog.pentastagiu.homework2.bankAccount;

public class BankApp {

    public static void main(String[] args) {

        BankAccount marius=new BankAccount("Marius Herlea");
        marius.depozit(100);
        marius.depozit(100);

        marius.withdraw(15.23);
        marius.depozit(125);
        marius.withdraw(400);

    }


}
