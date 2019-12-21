package com.pentalog.pentastagiu.homework2.bank;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        int Balance=0;
        boolean Finish=false;

        while(!Finish)
        {
            System.out.println("Choose one of the following actions ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            System.out.println("If you dont want to do any of these actions press 4");
            int ClientInput=Input.nextInt();
            switch(ClientInput)
            {
                case 1:
                {
                    System.out.println("Introduce the amount that you want to deposit");
                    int Amount=Input.nextInt();
                    Balance += Amount;
                    System.out.println("You have successfully deposited " + Amount);
                    break;
                }
                case 2:
                {
                    System.out.println("Introduce the amount that you want to withdraw ");
                    int Amount=Input.nextInt();
                    if(Amount>Balance)
                        System.out.println("Insufficent funds");
                    else
                    {
                        Balance -=Amount;
                        System.out.println("You have successfully withdrawn " + Amount);
                    }
                    break;



                }
                case 3:
                    System.out.println("Your balance is " + Balance);
                    break;
                case 4:
                    Finish=true;                    break;

            }

        }





    }

}
