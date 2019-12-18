package Bank;

public class BankAccount {
    private double balance = 0;
    private double amount;
    public static String printInfo = printInfoAboutBank("Bine ati venit la Banca Transilvania");
    static {
        printInfo=printInfoAboutBank("Sucursala 1");
        printInfo=printInfoAboutBank("Brasov");
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You have deposited the sum of " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("You have withdrawn the sum of " + amount);
        } else {
            System.err.println("\nYou have insufficient founds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static String printInfoAboutBank(String info) {
        System.out.println(info);
        return info;
    }
}