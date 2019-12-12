package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.problema1.BankAccount;
import com.pentalog.pentastagiu.homework2.problema2.*;
import com.pentalog.pentastagiu.homework2.problema3.Board;
import com.pentalog.pentastagiu.homework2.problema3.User;

import java.util.Scanner;

public class HomeworkApp {
    public static void main(String[] args) {
        int problem = 3;
        switch (problem) {
            case 1:
                Problem1();
                break;
            case 2:
                Problem2();
                break;
            case 3:
                Problem3();
                break;
            default:
                System.out.println("Invalid problem number");
        }
    }

    public static void Problem1()
    {
        int operation;
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        double money;
        boolean isWorking = true;
        while(isWorking)
        {
            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Show current sold");
            System.out.println("4. Exit");

            operation=scanner.nextInt();
            switch (operation)
            {
                case 1:
                    account.Deposit();
                    System.out.println("Transaction loading....");
                    break;
                case 2:
                    money = account.Withdraw();
                    System.out.println("Transaction loading....");
                    System.out.println("Please collect: " + money);
                    break;
                case 3:
                    System.out.println("The account has the sold: " + account.getSold());
                    break;
                case 4:
                    isWorking = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }
    public static void Problem2()
    {
        Customer alexNoMembership = new Customer("Alex", Status.NOMEMBERSHIP);
        Customer alexGold = new Customer("Alex", Status.GOLD);
        Customer alexSilver = new Customer("Alex", Status.SILVER);
        Basket basketAlexGold = new Basket(alexGold);
        Basket basketAlexSilver = new Basket(alexSilver);
        Basket basketAlexNoMembership = new Basket(alexNoMembership);

        Product products[] = new Product[4];
        for(int i = 0;i < 4; i = i + 2)
        {
            products[i] = new Candy("candy"+ i,i + 5.0,(i + 1) * 5);
            products[i+1] = new Book("book" + i,i + 17.5,"author" + i);
        }
        for(int i = 0; i < 4; ++i)
        {
            basketAlexGold.AddToBasket(products[i]);
            basketAlexSilver.AddToBasket(products[i]);
            basketAlexNoMembership.AddToBasket(products[i]);
        }

        System.out.println(basketAlexGold.GetTotalPrice());
        System.out.println(basketAlexSilver.GetTotalPrice());
        System.out.println(basketAlexNoMembership.GetTotalPrice());

    }
    public static void Problem3()
    {
        Board application = new Board();
        User alex = new User("alexandruuubaciu@gmail.com","Alexandru");
        User vlad = new User("vlad.dobre@yahoo.com","Vlad");
        User tudor = new User("tudor.popescu@yahoo.com","Tudor");
        User vali = new User("vali_pop@gmail.com","Vali");
        User ionut = new User("ionut99@yahoo.com","Ionut");
        User marian = new User("marian_hh@yahoo.com","Marian");
        User[] users = {alex, vlad, tudor, vali, ionut, marian};
        for(int i = 0; i < users.length; ++i) {
            if (i < 4) {
                users[i].setRegistering(true);
                users[i].SendMessage(" Sending " + i);
            }
            application.RegisterTheUser(users[i]);
        }
        System.out.println("\n\t\t\t\tChat-ul aplicatiei:");

        application.DisplayAllMessages();
    }
}

