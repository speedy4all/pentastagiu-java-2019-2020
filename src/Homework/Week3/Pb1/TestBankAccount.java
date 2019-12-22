package Homework.Week3.Pb1;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.depositMoney(100);
        bank.depositMoney(-10);
        bank.withdrawMoney(-10);
        bank.withdrawMoney(1000);
        bank.withdrawMoney(50);
    }
}
