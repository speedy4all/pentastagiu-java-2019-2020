package Bank;

public class BankApp {
    public static void main(String[] args) {
        BankAccount customer1= new BankAccount();
        customer1.deposit(500);
        customer1.withdraw(200);
        System.out.println("Aveti in cont suma de "+customer1.getBalance());

        BankAccount customer2 = new BankAccount();
        customer2.deposit(1000);
        customer2.withdraw(500);
        System.out.println("Aveti in cont suma de "+customer2.getBalance());


    }
}
