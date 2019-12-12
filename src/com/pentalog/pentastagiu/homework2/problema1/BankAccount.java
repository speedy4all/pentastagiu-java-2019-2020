package com.pentalog.pentastagiu.homework2.problema1;


import java.util.Scanner;

public class BankAccount {
    private double sold;

   //Aplicatia refera catre un cont bancar. Nu stiu daca exista posibilitatea de a deschide un cont cu o anumita suma(referire la constructor cu argument double)
   // Este o practica buna sa suprascriu constructorul fara parametri daca fac exact acelasi lucru(initializarea pe 0)?
   //Waiting feedback, maybe #TODO
    public BankAccount() {
        this.sold = 0;
    }

    public void Deposit()
    {
        Scanner scanner = new Scanner(System.in);
        double money;
        do {
            System.out.println("Insert the value: ");
            money = scanner.nextDouble();
            if(money <= 0)
            {
                System.out.println("You can not load the account with value: " + money + ". Please insert a value greater than 0");
            }
            else
            {
                this.sold += money;
                System.out.println("The account was loaded with value: " + money);
            }
        }while(money <= 0);

    }

    public double Withdraw() {
        Scanner scanner = new Scanner(System.in);
        double money;
        do{
            System.out.println("Insert the value: ");
            money = scanner.nextDouble();
            if(money <= 0) {
                System.out.println("System can not withdraw: " + money + ". Please insert a value greater than 0");
            }
            else {
                if (this.sold - money < 0) {
                    System.out.println("Can not withdraw: " + money + ". Please insert a value less than you current sold " + this.sold);
                    money = -1.0;
                } else {
                    this.sold -= money;
                    System.out.println("The account was withdrawn with value: " + money);
                }
            }
        }while(money <= 0);
        return money;
    }

    public double getSold() {
        return sold;
    }
}
