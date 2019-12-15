package homework.week3.BankHomework;

public class BankAccount {
    private int money;

    BankAccount() {
        money = 500;
    }

    public void balance() {
        System.out.println("You have "+ money + " in the account.");
    }

    public void withdraw(int amount) {
        if ( amount > this.money ) {
            System.out.println("You don't have enough money...");
            this.balance();
            return;
        }
        else {
            this.money -= amount;
            System.out.println("You have successfully withdrawn the money.");
            this.balance();
        }
    }

    public void deposit(int amount) {
        this.money += amount;
        System.out.println("You have successfully added " + amount + " to your account.");
    }

}
