package homework2.problem1;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount  = new BankAccount(0);;
        int choose = -1;
        do{
            System.out.println("Choose one of the following options:\n 1. Deposit\n 2. Withdraw\n 3. Exit ");
            choose = scanner.nextInt();
            if (choose == 1){
                System.out.println("Enter the amount to deposit: " );
                try{
                    bankAccount.deposit(scanner.nextInt());
                }catch (IllegalArgumentException ex){
                    System.out.println("Please enter a valid amount to deposit!");
                }
            }
            if (choose == 2){
                System.out.println("Enter the amount to withdraw: " );
                try{
                    bankAccount.withdraw(scanner.nextInt());
                }catch(IllegalArgumentException ex){
                    System.out.println("Please enter a valid amount to withdraw!");
                }


            }
            if (choose ==3){
                System.out.println("Exit...");
            }

        }while (choose != 3);


    }
}
