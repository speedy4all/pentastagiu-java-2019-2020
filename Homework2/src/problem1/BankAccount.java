package problem1;

import java.util.Scanner;

public class BankAccount {

    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(){
        System.out.println("You're depositing money!");
        System.out.println("Introduce the sum you wish to deposit: ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextInt();
        this.balance += sum;
        System.out.println("Your current balance is: " + this.balance + "$");

    }

    public void withdrawMoney(){
        System.out.println("You're withdrawing money!");
        System.out.println("Introduce the sum you wish to withdraw: ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextInt();
        if(sum > this.balance){
            System.out.println("Operation failed!You don't have that much money in your account! !");
        }
        else{
            this.balance -= sum;
            System.out.println("Your current balance is: " + this.balance + "$");
        }
    }
}