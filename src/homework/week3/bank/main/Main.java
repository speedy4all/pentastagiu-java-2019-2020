package homework.week3.bank.main;

import homework.week3.bank.business.BankingImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BankingImpl Banking = new BankingImpl();

        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("OPTIONS\nPlease select from the options below:" + "\n1. Add a new account" + "\n2. Use current account" + "\n3. Exit"));
            switch (option) {
                case 1:
                    Banking.addClient();
                    break;
                case 2:
                    int option2 = Integer.parseInt(JOptionPane.showInputDialog("1. Deposit" + "\n2. Redraw" + "\n3. Exit"));
                    switch (option2) {
                        case 1:
                            Banking.deposit();
                            break;
                        case 2:
                            Banking.redraw();
                            break;
                        case 3:
                            System.out.println("Exit.");
                            break;
                        default:
                            System.out.println("Invalid action!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid action!");
                    break;
            }
        } while (option != 3);
    }
}
