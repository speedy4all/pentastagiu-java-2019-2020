package src.mndragossh.week3.bankaccount;

public class BankAccount {
    private double amount;

    public BankAccount() {
        amount = 0;
    }

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > amount) {
            System.out.println("Not enough funds to perform operation");
        } else {
            amount -= withdrawAmount;
            System.out.println("Success");
        }
    }

    public void deposit(int depositAmount) {
        amount += depositAmount;
        System.out.println("Operation done successfully.");
    }

    public void displayAmount() {
        System.out.println(String.format("Remain amount is %.2f", amount));
    }

    public String toString() {
        return "Bank account module week 3";
    }
}
