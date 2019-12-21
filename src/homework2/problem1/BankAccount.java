package homework2.problem1;

public class BankAccount {


    private double totalAmount;
    private int accountNumber;

    public BankAccount(double totalAmount){
        this.totalAmount = totalAmount;

    }

    public void deposit(double amount){
        System.out.println("The amount that was added is: " + amount);
        totalAmount += amount;
        System.out.println("The new available amount is: " + totalAmount);
    }

    public boolean withdraw(double withdrawAmount){
        if(totalAmount < withdrawAmount){
            System.out.println("This bank account doesn't have enough funds!");
            return false;
        } else {
            totalAmount -= withdrawAmount;
            System.out.println("The desired amount " + withdrawAmount + " was successfully withdrawn!");
            return true;
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalValue) {
        this.totalAmount = totalValue;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

}
