package homework2.problem1;

public class BankAccount {


    private double totalAmount;
    private int accountNumber;

    public BankAccount(double totalAmount){
        if (totalAmount < 0){
            throw new IllegalArgumentException();
        }
        this.totalAmount = totalAmount;
        System.out.println("Successfully created your account !");
    }

    public void deposit(double amount){
        if(amount < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("The amount that was added is: " + amount);
        totalAmount += amount;
        System.out.println("The new available amount is: " + totalAmount);
    }

    public boolean withdraw(double withdrawAmount){
        if(withdrawAmount < 0) {
            throw new IllegalArgumentException();
        }else if(totalAmount < withdrawAmount){
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

}
