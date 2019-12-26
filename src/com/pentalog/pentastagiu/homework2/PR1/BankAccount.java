package com.pentalog.pentastagiu.homework2.PR1;

public class BankAccount { ///we only have an account
    private int idAccount; //date despre persoana careia apartine
    private String category; ///credit sau debit
    ///limita e setata de ADMIN, NU VREAU CA ALTCINEVA SA AIBA ACCES LA EA
    private int balance; /// o pun in constructor.
    private int limita;

    public BankAccount(int idAccount,String category,int balance)
    {
     this.idAccount=idAccount;
     this.category=category;
     this.balance=balance;
setLimita(category);
    }

    private void seeBalance()
    {
        System.out.println(" The balance for this account is "+ balance+" lei");
    }

    private void setLimita(String category)
    {
        if(category.equals("DEBIT"))
            limita=5000; ///maxim amount of money on the debit card
        else if(category.equals("CREDIT"))
            limita=3*(idAccount/10000); ///CREDIT = 3 * salary ( the first 2 digits from id establish the salary's category) 11- 1000lei (silver), 12- 2000lei (gold), 13- 3000lei (platinum account)
    ///id length- 6 caracthers

    }

    public void withdraw(int money){
        if(balance>=money)
            balance-=money;
        else
            System.out.println(" Not enough money to withdraw");
    };

    public void deposit(int money){
        if(money+balance<=limita)
            balance+=money;
        else
            System.out.println("the amount of money in your account will overtake the limit");

    }

    public void getBalance() {
        System.out.println("Your balance: "+this.balance);
    }

}
