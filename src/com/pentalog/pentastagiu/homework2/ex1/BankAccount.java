package ex1;

public class BankAccount {
    double balance = 0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited succesfully. New balance : " + balance);
    }
    public void Withdraw(double amount) {
        if(balance > amount) {
            balance = balance - amount;
            System.out.println("Withdrawed succesfully. Balance after withdrawing : " + balance);
        }
        else {
            System.out.println("warning: the amount is bigger then the balance");
        }

    }

}