package problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bk = new BankAccount(5000);

        System.out.println("Current balance: " + bk.getBalance() + "$");
        System.out.println("Options: \n 1.Deposit \n 2.Withdraw \n 3.Quit");
        System.out.println("What option do you choose?");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        while(op != 3) {
            switch (op) {
                case 1:
                    bk.depositMoney();
                    break;
                case 2:
                    bk.withdrawMoney();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("You didn't choose one of the options");
                    break;
            }
            System.out.println("Do you wish to make another operation?(Choose option 3 to quit)");
            op = sc.nextInt();
        }
    }
}

