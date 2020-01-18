package com.pentalog.pentastagiu.homework2.atm;

import java.util.Scanner;

public class AtmOperation {
    Integer userOption;
    Scanner scan=new Scanner(System.in);
    Double totalBalance=0.00, withdrawAmount=0.00, depositAmount=0.00, withdrawals=0.00;;
    private final Double LIMIT_CARD=2000.00;


    //display menu
    public void displayMenu(Double totalBalance, Double withdraw, Double deposit) {
        System.out.println("1 - Balance\n2 - Withdraw\n3 - Deposit");
        userOption=scan.nextInt();
        switch(userOption) {
            case 1:
                //call balance method
                balance(withdraw, deposit);
                break;
            case 2:
                //call withdraw method
                cashWithdrawal(withdraw);
                break;
            case 3:
                //call deposit method
                deposit(deposit);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }

    //calculate balance of account
    public Double calculateBalance(Double withdraw, Double deposit) {
        totalBalance+=deposit-withdraw;
        System.out.println("You have " + totalBalance + " LEI in your account");
        chooseAnotherOption();
        return totalBalance;
    }

    //withdraw from account
    public Double cashWithdrawal(Double withdraw) {
        System.out.println("Enter the sum you want to withdraw");
        withdraw=scan.nextDouble();
        withdrawals+=withdraw;
        while(withdraw>totalBalance) {
            withdraw=0.00;
            System.out.println("Insufficient funds in the account. Do you want to withdraw another sum?\n1 - YES\n2 - NO");
            userOption=scan.nextInt();
            if(userOption==1) {
                System.out.println("Enter the sum you want to withdraw");
                withdraw=scan.nextDouble();
            }else if(userOption==2){
                chooseAnotherOption();
            }
        }
        while(withdraw>LIMIT_CARD || withdrawals>LIMIT_CARD) {
            withdrawals-=withdraw;
            withdraw=0.00;
            System.out.println("You can't withdraw more than " + LIMIT_CARD + " LEI/day");
            break;
        }
        if(withdraw<totalBalance) {
            System.out.println("You withdrew " + withdraw + " LEI.");
            balance(withdraw, depositAmount);
        }
        return withdraw;
    }

    //deposit money in account
    public Double deposit(Double deposit) {
        System.out.println("Enter the sum you want to deposit");
        deposit=scan.nextDouble();
        System.out.println("You have deposited " + deposit + " LEI.");
        balance(withdrawAmount, deposit);
        return deposit;
    }

    //choose another option(SHOW BALANCE / WITHDRAW / DEPOSIT ) from atm
    public void chooseAnotherOption() {
        System.out.println("Do you want to choose another option?\n1 - YES\n2 - NO ");
        userOption=scan.nextInt();
        if(userOption==1) {
            displayMenu(totalBalance, withdrawAmount, depositAmount);
        }else {
            System.out.println("Thank you! Bye!");
        }
    }

    public Double getLIMIT_CARD() {
        return LIMIT_CARD;
    }
}
