package com.pentalog.pentastagiu.homework3.bank.business;
import com.pentalog.pentastagiu.homework3.bank.domain.Client;

import javax.swing.*;
import java.util.*;

public class BankingImpl implements Banking {
    private List<Client> Deposit = new ArrayList<>();
    private Map<String, List<Client>> Account = new HashMap<>();

    @Override
    public void addClient() {
        Client c = new Client();
        c.setFirstName(JOptionPane.showInputDialog("First Name:"));
        c.setLastName(JOptionPane.showInputDialog("Last Name:"));
        c.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Amount:")));
        Deposit.add(c);
        c.setAccountNumber(Integer.parseInt(JOptionPane.showInputDialog("Account Number:")));
        Account.put(String.valueOf(c.getAccountNumber()), Deposit);
        System.out.println("New entry has been made!" + c.toString());
    }

    @Override
    public void deposit() {
        Iterator<Client> it = Deposit.iterator();
        boolean yesClient = false;
        String input = JOptionPane.showInputDialog("Type the account number you want to access:");
        while (it.hasNext()) {
            Client client = it.next();
            if (client.getAccountNumber() == Integer.parseInt(input)) {
                yesClient = true;
                System.out.println(("Welcome " + client.getFirstName() + " " + client.getLastName() + " !" + "\nAmount: " + client.getMoney()));
                int amount = client.getMoney();

                amount = amount + client.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Amount:")));
                System.out.println("You now have " + amount + " in your account!");
                client.setMoney(amount);
            }
        }
        if (!yesClient) System.out.println("The account number is not valid or non existent!");
    }

    @Override
    public void redraw() {
        Iterator<Client> it = Deposit.iterator();
        boolean yesClient = false;
        String input = JOptionPane.showInputDialog("Type the account number you want to access:");
        while (it.hasNext()) {
            Client client = it.next();
            if (client.getAccountNumber() == Integer.parseInt(input)) {
                yesClient = true;
                System.out.println("Welcome " + client.getFirstName() + " " + client.getLastName() + " !" + "\nAmount: " + client.getMoney());
                int amount = client.getMoney();
                int redrawn = client.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Amount:")));
                if (redrawn > amount) {
                    System.out.println("Insufficient funds!");
                    client.setMoney(amount);
                } else {
                    amount = amount - redrawn;
                    System.out.println("You now have " + amount + " in your account!");
                    client.setMoney(amount);
                }
            }
            System.out.println(Account);
        }
        if (!yesClient) System.out.println("The account number is not valid or non existent!");
    }
}



