/*Create a console application from the following requirements:
A bank account from where someone has the option to withdraw and deposit money
Write information to the console each time someone makes an operation on that account
Take into consideration any validations that have to be done since this is a debit account, so user can’t
withdraw more than he has into account. Display this information to inform the user about why the operation failed
*/

package com.pentalog.pentastagiu.homework2.bank;
import com.pentalog.pentastagiu.homework2.bank.Account;
import java.util.Scanner;

public class BankApp {


    public static void main(String[] args) {

        Account accountInfo = new Account();
        accountInfo.fullName = "Maria Ionescu";
        accountInfo.accountNumber = 4125420;
        double money = 745.50;
        accountInfo.setAvailableMoney(money);

        Scanner myInput = new Scanner(System.in);
        byte optiune;
        double suma;

        System.out.println("Ce operatiune doriti sa efectuati?");
        System.out.println("Apasati 1 pentru Consultare sold");
        System.out.println("Apasati 2 pentru retragere numerar");
        System.out.println("Apasati 3 pentru depunere numerar");

        optiune = myInput.nextByte();

        switch (optiune) {

            case 1:
                accountInfo.printAccountInfo();
                break;

            case 2:
                System.out.println("Introduceti suma pe care doriti sa o retrageti:");
                suma = myInput.nextDouble();
                if (suma > money) {
                    accountInfo.printAccountInfo();
                    System.out.println("Nu puteti retrage mai multi bani decat aveti in cont");
                } else {
                    money -= suma;
                    accountInfo.setAvailableMoney(money);
                    System.out.println("Suma ramasa este:" + money);
                }
                break;
            case 3:
                System.out.println("Introduceti suma pe care doriti sa o depuneti:");
                suma = myInput.nextDouble();
                if (suma < 0) {
                    System.out.println("Operatiunea a esuat. Va rugam incercati din nou");
                } else {
                    money = +suma;
                    accountInfo.setAvailableMoney(money);
                    System.out.println("Noua suma este:" + money);
                }
                break;
            default:
                System.out.println("Apasati 1, 2 sau 3");
                break;
        }
    }
}

