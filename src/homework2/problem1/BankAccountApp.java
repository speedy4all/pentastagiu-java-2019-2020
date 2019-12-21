package homework2.problem1;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        //Deposit money
        bankAccount.deposit(100);

        //Withdraw money
        bankAccount.withdraw(700);

        System.out.println("Available amount : " + bankAccount.getTotalAmount());

    }
}
