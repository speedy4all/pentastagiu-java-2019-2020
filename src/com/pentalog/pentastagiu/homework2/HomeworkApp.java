package com.pentalog.pentastagiu.homework2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkApp {

    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");

        Scanner in = new Scanner(System.in);
        System.out.println("Select app(bank, book, messages): ");
        String app = in.nextLine().toLowerCase();
        if(app.equals("bank")) {
            bankApp();
        } else if (app.equals("book")) {
            bookApp();
        } else if (app.equals("messages")) {
            messageApp();
        } else {
            System.out.println("App does not exist");
        }
    }

    private static void bankApp() {
        Scanner in = new Scanner(System.in);
        boolean doYouWantToContinue = true;
        BankAccount bankAccount = new BankAccount();

        while(doYouWantToContinue) {
            System.out.println("Hello there! What do you want to do (withdraw, deposit)?");
            String option = in.nextLine().toLowerCase();

            if(option.equals("withdraw")) {
                System.out.println("How much money do you want to withdraw?");
                double amountOfMoneyToWithdraw = in.nextDouble();
                double remainedMoney = bankAccount.getAmountOfMoney()-amountOfMoneyToWithdraw;
                if(remainedMoney<0)
                    System.out.println("You do not have enough money in your account");
                else
                    bankAccount.setAmountOfMoney(remainedMoney);

                System.out.println("Do you want to continue?(y/n)");
                Scanner in2 = new Scanner(System.in);
                String wantToContinue = in2.nextLine();
                if(wantToContinue.equals("n"))
                    doYouWantToContinue = false;
            } else if (option.equals("deposit")) {
                System.out.println("How much money do you want to deposit?");
                double amountOfMoneyToDeposit = in.nextDouble();
                bankAccount.setAmountOfMoney(amountOfMoneyToDeposit);

                System.out.println("Do you want to continue?(y/n)");
                Scanner in2 = new Scanner(System.in);
                String wantToContinue = in2.nextLine();
                if(wantToContinue.equals("n"))
                    doYouWantToContinue = false;
            }
        }
    }

    private static void bookApp() {
        Scanner in = new Scanner(System.in);
        Customer customer = new Customer("John");

        Book book1 = new Book("Elon Musk", 30.0, "Ashlee Vance");
        Book book2 = new Book("Cristiano Ronaldo", 35.0, "Guillem Balagué");
        Book book3 = new Book("Undisputed Truth", 36.5, "Mike Tyson");

        Candy candy1 = new Candy("Choco", 5, 2);
        Candy candy2 = new Candy("Vanilla", 2, 2);

        Basket basket = new Basket(customer);

        boolean doYouWantToContinue = true;
        boolean selectedGoodQuantity = false;

        while(doYouWantToContinue) {
            System.out.println("Select a product to buy: book1, book2, book3, candy1, candy2");
            String choice = in.nextLine();

            int quantity;
            switch (choice) {
                case "book1":
                    basket.setTotalPrice(basket.getTotalPrice() + book1.getPrice());
                    break;
                case "book2":
                    basket.setTotalPrice(basket.getTotalPrice() + book2.getPrice());
                    break;
                case "book3":
                    basket.setTotalPrice(basket.getTotalPrice() + book3.getPrice());
                    break;
                case "candy1":
                    selectedGoodQuantity = false;
                    while(!selectedGoodQuantity)
                    {
                        System.out.println("Select quantity");
                        quantity = in.nextInt();
                        if(quantity<=candy1.getQuantity())
                        {
                            basket.setTotalPrice(basket.getTotalPrice() + candy1.getPrice()*quantity);
                            candy1.setQuantity(candy1.getQuantity()-quantity);
                            selectedGoodQuantity = true;
                        }
                        else
                            System.out.println("We do not have enough candy1");
                    }
                    break;
                case "candy2":
                    selectedGoodQuantity = false;
                    while(!selectedGoodQuantity)
                    {
                        System.out.println("Select quantity");
                        quantity = in.nextInt();
                        if(quantity<=candy2.getQuantity())
                        {
                            basket.setTotalPrice(basket.getTotalPrice() + candy2.getPrice()*quantity);
                            candy2.setQuantity(candy2.getQuantity()-quantity);
                            selectedGoodQuantity = true;
                        }
                        else
                            System.out.println("We do not have enough candy2");
                    }
            }

            System.out.println("Do you want to continue?(y/n)");
            Scanner in2 = new Scanner(System.in);
            String wantToContinue = in2.nextLine();
            if(wantToContinue.equals("n"))
                doYouWantToContinue = false;
        }

        double firstPrice;
        switch (customer.getMembership()) {
            case "SILVER ":
                firstPrice = ((double)basket.getTotalPrice()-(10*basket.getTotalPrice()/100));
                System.out.println("10% discount. Total price " + ((double)basket.getTotalPrice()-(10*basket.getTotalPrice()/100)));
                break;
            case "GOLD ":
                firstPrice = ((double)basket.getTotalPrice()-(20*basket.getTotalPrice()/100));
                System.out.println("20% discount. Total price " + ((double)basket.getTotalPrice()-(20*basket.getTotalPrice()/100)));
                break;
            default:
                firstPrice = ((double)basket.getTotalPrice());
                System.out.println("0% discount. Total price " + ((double)basket.getTotalPrice()));
                break;
        }

        customer.setMembership("SILVER");
        System.out.println("You became a silver member! Use that in your advantage");

        /*doYouWantToContinue = true;
        while(doYouWantToContinue) {
            System.out.println("Select a product to buy: book1, book2, book3, candy1, candy2");
            String choice = in.nextLine();

            switch (choice) {
                case "book1":
                    basket.setTotalPrice(basket.getTotalPrice() + book1.getPrice());
                    break;
                case "book2":
                    basket.setTotalPrice(basket.getTotalPrice() + book2.getPrice());
                    break;
                case "book3":
                    basket.setTotalPrice(basket.getTotalPrice() + book3.getPrice());
                    break;
                case "candy1":
                    basket.setTotalPrice(basket.getTotalPrice() + candy1.getPrice());
                    break;
                case "candy2":
                    basket.setTotalPrice(basket.getTotalPrice() + candy2.getPrice());
                    break;
            }

            System.out.println("Do you want to continue?(y/n)");
            String wantToContinue = in.nextLine();
            if(wantToContinue.equals("n"))
                doYouWantToContinue = false;
        }*/

        double secondPrice;
        switch (customer.getMembership()) {
            case "SILVER":
                secondPrice = ((double)basket.getTotalPrice()-(10*basket.getTotalPrice()/100));
                System.out.println("10% discount. Total price " + ((double)basket.getTotalPrice()-(10*basket.getTotalPrice()/100)));
                break;
            case "GOLD":
                secondPrice = ((double)basket.getTotalPrice()-(20*basket.getTotalPrice()/100));
                System.out.println("20% discount. Total price " + ((double)basket.getTotalPrice()-(20*basket.getTotalPrice()/100)));
                break;
            default:
                secondPrice = ((double)basket.getTotalPrice());
                System.out.println("0% discount. Total price " + ((double)basket.getTotalPrice()));
                break;
        }
        double val = firstPrice-secondPrice;

        val = val*100;
        val = (double)Math.round(val);
        val = val /100;
        System.out.println("You save " + val);
    }

    private static void messageApp() {
        Scanner in = new Scanner(System.in);

        User user1 = new User("user1", "user1");
        User user2 = new User("user2", "user2");
        User user3 = new User("user3", "user3");

        List<User> userList = new ArrayList<>();
        List<Message> messageList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        boolean continueApp = true;

        while(continueApp) {
            System.out.println("What do you want to do?(register/login)");
            String action = in.nextLine().toLowerCase();
            if(action.equals("login")) {
                System.out.println("Username ");
                String username = in.nextLine();
                System.out.println("Password ");
                String password = in.nextLine();

                int ok=0;
                User userTryingToLogIn = new User();
                for (User user : userList) {
                    if(user.username.equals(username))
                        if(user.password.equals(password)){
                            ok=1;
                            userTryingToLogIn.setPassword(password);
                            userTryingToLogIn.setUsername(username);
                            break;
                        }
                }

                if (ok == 1) {
                    boolean doYouWantToContinue = true;
                    while(doYouWantToContinue) {

                        System.out.println("Print a message on the board");
                        String messageFromUser = in.nextLine();
                        Message message = new Message(messageFromUser, userTryingToLogIn.getUsername());
                        messageList.add(message);

                        System.out.println("Do you want to continue?(y/n)");
                        String wantToContinue = in.nextLine();
                        if (wantToContinue.equals("n"))
                            doYouWantToContinue = false;
                    }
                } else {
                    System.out.println("Username or password incorrect");
                }

                System.out.println("Do you want to continue using the app?(y/n)");
                String wantToContinue = in.nextLine();
                if (wantToContinue.equals("n"))
                    continueApp = false;

            } else {
                boolean isRegistering = true;
                while(isRegistering)
                {
                    int ok=1;
                    System.out.println("Type new username: ");
                    String username = in.nextLine();

                    System.out.println("Type new password: ");
                    String password = in.nextLine();

                    for (User user : userList) {
                        if(user.username.equals(username)){
                            System.out.println("Already exists");
                            ok=0;
                            break;
                        }
                    }
                    if(ok==1) {
                        userList.add(new User(username, password));
                        isRegistering = false;
                    }
                }
                System.out.println("Registered!");

                System.out.println("Username ");
                String username = in.nextLine();
                System.out.println("Password ");
                String password = in.nextLine();

                int ok=0;
                User userTryingToLogIn = new User();
                for (User user : userList) {
                    if(user.username.equals(username))
                        if(user.password.equals(password)){
                            ok=1;
                            userTryingToLogIn.setPassword(password);
                            userTryingToLogIn.setUsername(username);
                            break;
                        }
                }

                if (ok == 1) {
                    boolean doYouWantToContinue = true;
                    while(doYouWantToContinue) {

                            System.out.println("Print a message on the board");
                            String messageFromUser = in.nextLine();
                            Message message = new Message(messageFromUser, userTryingToLogIn.getUsername());
                            messageList.add(message);

                            System.out.println("Do you want to continue?(y/n)");
                            String wantToContinue = in.nextLine();
                            if (wantToContinue.equals("n"))
                                doYouWantToContinue = false;
                        }
                } else {
                    System.out.println("Username or password incorrect");
                }

                System.out.println("Do you want to continue using the app?(y/n)");
                String wantToContinue = in.nextLine();
                if (wantToContinue.equals("n"))
                    continueApp = false;
            }
        }
        System.out.println("Messages on the board:");
        for (Message message : messageList) {
            System.out.println(message.getDescription());
        }

    }
}
