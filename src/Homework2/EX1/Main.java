package Homework2.EX1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount debit = new BankAccount();
        debit.setIban("xxxx xxxx xxxx xxxx");
        debit.setName("Popescu");
        debit.setBirthdate("15/04/1990");
        debit.setBalance(1000000.00);

        System.out.println(debit.toString());
        System.out.println("Welcome!");
        System.out.println("What would you like to do?");
        System.out.println("1.withdraw money");
        System.out.println("2.deposit money");
        System.out.println("3. exit");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        while (!option.equals("3")) {
            switch (option) {
                case "1":
                    System.out.println("Provide the amount to withdraw: ");
                    option = s.nextLine();
                    double amount = Double.parseDouble(option);
                    debit.withdrawal(amount);
                    System.out.println("The new balance is: " + debit.getBalance());
                    System.out.println("Do you want to continue with another operation?");
                    System.out.println("1.withdraw money");
                    System.out.println("2.deposit money");
                    System.out.println("3. exit");
                    option = s.nextLine();
                    break;

                case "2":
                    System.out.println("Provide the amount to deposit: ");
                    option = s.nextLine();
                    amount = Double.parseDouble(option);
                    debit.deposit(amount);
                    System.out.println("The new balance is: " + debit.getBalance());
                    System.out.println("Do you want to continue with another operation?");
                    System.out.println("1.withdraw money");
                    System.out.println("2.deposit money");
                    System.out.println("3.exit");
                    option = s.nextLine();
                    break;
            }

        }


    }


}
