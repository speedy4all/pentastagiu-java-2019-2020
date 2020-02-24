package com.pentalog.pentastagiu.homework2.PR1;

import java.util.Scanner;


///cum as putea face sa bag

public class TestProblemutze {

    public static int validate_id(int id) {
        int aux = id;
        int counter = 0;

        while (aux != 0) {
            counter++;

            aux /= 10;
        }
        ;

        if (counter != 6)
            return 0;

        aux = id / 10000;
        if (aux != 11 && aux != 12 && aux != 13) {
            System.out.println(" There is no category with this id. INVALID ID ");
            return 0;
        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to our Bank!\n");

        ////////EXAMPLE FOR READING A DEBIT
        System.out.println("Read the ID ( 6 digits). Take care of the salary category!");
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        while (validate_id(id) != 1) {
            System.out.println("INVALID ID. Enter it again!");
            id = input.nextInt();
        }
        System.out.println("Read the category in capital letters!");
        String category = input.nextLine();
        category = input.nextLine();

        while (category.equals("DEBIT") == false && category.equals("CREDIT") == false) {
            System.out.println("Invalid category! Read again!");
            category = input.nextLine();
        }
        System.out.println("Read the current balance of the account!");

        int balance = input.nextInt();
        BankAccount account = new BankAccount(id, category, balance);

        /// That was all about reading the account, now we want to get to the bank's menu

        System.out.println("Read an option for your bank account!\n1. See balance \n2. Withdraw \n3. Deposit money\n4. No other transaction!");
        int option = input.nextInt();
      //  option = input.nextInt();
        while (option != 4) {
            int money;

            switch (option) {
                case 1:
                    account.getBalance();
                    break;
                case 2:
                    System.out.println(" Enter the amount of money to withdraw - ");
                    money = input.nextInt();
                    account.withdraw(money);
                    break;
                case 3:
                    System.out.println(" Enter the amount of money to deposit - ");
                    money = input.nextInt();
                    account.deposit(money);
                    break;
                case 4:
                    System.out.println(" Thank you for choosing our bank! See you later!");
                default:
                    System.out.println("Invalid transaction. Choose another option, please!");
                    break;

            }
            System.out.println("Read another option:");
            option = input.nextInt();
        }

    }
}
