
//Create a console application from the following requirements:
//A bank account from where someone has the option to withdraw and deposit money
//Write information to the console each time someone makes an operation on that account
//Take into consideration any validations that have to be done since this is a debit account,
// so user can’t withdraw more than he has into account. Display this information to inform
// the user about why the operation failed

package com.pentalog.pentastagiu.homework2.bankAccount;

public class BankApp {

    public static void main(String[] args) {

        BankAccount marius = new BankAccount("Marius Herlea");
        marius.depozit(100);
        marius.depozit(100);
        marius.depozit(-10);

        marius.withdraw(-15);
        marius.depozit(125);
        marius.withdraw(400);
        marius.withdraw(200);
    }


}
