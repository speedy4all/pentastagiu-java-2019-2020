package homework.week3.BankHomework;

import homework.week3.BankHomework.BankAccount;

public class BankApp {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount();

        firstAccount.balance();
        firstAccount.withdraw(300);
        firstAccount.deposit(50);
        firstAccount.withdraw(300);

    }
}
