package com.pentalog.pentastagiu.week3;

public class Bank {
    Scanner input = new Scanner(System.in);
            System.out.println("Enter your Name: ");
    String customerName = input.nextLine();
            System.out.println("Enter Account Type: ");
    String type = input.next();
            System.out.println("Enter Initial Balance: ");

    int balance = input.nextInt();
      Bank balance1 = new BankAccount(customerName, amount, type, balance);
    int menu;
            System.out.println("Menu");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Information");
            System.out.println("4. Exit");
    boolean quit = false;
    do    {
        System.out.print("Please enter your choice: ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                Bank.getMoney().deposit();
                System.out.print("Enter deposit amount:");
                amount = input.nextInt();
                if (amount < 0) {
                    System.out.println("Invalid");
                    return 1;
                }
                balance = balance + amount;
                return 0;
        }
        break;

        case 2:
            Bank.getMoney().withdraw();
            amount = input.nextInt();
            System.out.println("Current Account Balance=" + balance);
            System.out.println("\n\nEnter withdrawal amount:");

        if (amount <= 0 || amount > balance) {
        System.out.println("Not enough funds");
                return 1;
            }
            balance = balance - amount;
            return 0;
        break;
            case 3:
                balance1.display();
                break;
            case 4:
                quit = true;
                break;
        }
    } while (!quit);
System.out.println("Goodbye!");
}
