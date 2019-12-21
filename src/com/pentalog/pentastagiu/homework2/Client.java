package com.pentalog.pentastagiu.homework2;

public class Client {
    String FirstName;
    String LastName;
    double debit = 0;

    public void deposit_money( int sum)
    {
        debit=debit+sum;
        System.out.println("Done! Your account is " + debit + " now.");
    }

    public void withdraw_money(int sum)
    {
        if(sum > debit)
        {
            System.out.println("Operation failed!");
            System.out.println("You do not have enough money in your account ");
        }
        else {
            debit = debit - sum;
            System.out.println("Done! Your account is " + debit + " now.");
        }
    }
    public void verify_account()
    {
        System.out.println("Your account: " + debit);
    }
}
