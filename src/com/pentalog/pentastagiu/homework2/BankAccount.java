package com.pentalog.pentastagiu.homework2;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        Client client=new Client();
        System.out.println("First name :");
        client.FirstName=scan.nextLine();
        System.out.println("Last name :");
        client.LastName=scan.nextLine();

        System.out.println("Your account has been created!");

        System.out.println("Operation list:");
        System.out.println("1.Verify qccount");
        System.out.println("2.Deposit money");
        System.out.println("3.Withdraw money");

        int operation = scan.nextInt();

        switch (operation)
        {
            case 1:
                client.verify_account();
                break;
            case 2:
                System.out.println("Insert value");
                int added_sum=scan.nextInt();
                client.deposit_money(added_sum);
                break;
            case 3:
                System.out.println("Insert value");
                int retired_sum=scan.nextInt();
                client.withdraw_money(retired_sum);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
