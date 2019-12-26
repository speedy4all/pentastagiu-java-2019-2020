package com.pentalog.pentastagiu.homework2.PR3;


import java.util.Scanner;

public class Board {
    ///this is gonna be the main app
    static User[] users = new User[50];/// we are gonna have some users that are already on the server
    static int contor = 0;
    static Scanner input = new Scanner(System.in);
    static Message[] messages = new Message[250];
    static int contorMessages = 0;
    static String email; ///this is gonna be the ID for my message, changeble- cannot declare it as non- static. I STILL DO NOT REALLY UNDERSTAND HOW DOES JAVA WORK?!
    //////users on the initial server

    public static void usersOnInitialServer() {
        users[contor++] = new User("Popescu Ion", "popicul.ionica@yahoo.com", "pope_boss");
        users[contor++] = new User("Gavrila Marioara", "marigavr70@gmail.com", "roscata70");
        users[contor++] = new User("Dante Joshua", "beatricesidante@dante.me", "lovebetty");
        users[contor++] = new User("Planck Maxx", "planck.maxx@teacher.munchen.com", "fizica_cuantica");
    }

    public static void signUp() {
        System.out.println("Hey new member, please sign up and pick a secure password!");
        System.out.println("NAME: ");
        String name = input.nextLine();
        name = input.nextLine();
        System.out.println("EMAIL: ");
        String email = input.nextLine();
        System.out.println("PASSWORD: ");
        String password = input.nextLine();
        users[contor++] = new User(name, email, password);
        System.out.println("Thank you for signing- up!");

    }

    public static int login() {
        System.out.println("Press 1 to log in or Press 99 to go back to main menu");
        int option = input.nextInt();

        if (option == 99)
            return 99;

        System.out.println("Please, log in by entering your email and password!");
        System.out.println("EMAIL: ");
        email = input.nextLine();
        email = input.nextLine();
        System.out.println("PASSWORD: ");
        String password = input.nextLine();
        int ok = 0;
        for (int i = 0; i < contor; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {

                System.out.println("You logged in succesfully!");
                return 1;
            }
        }
        return 0;
    }

    public static void postNewMessage(String email) {

        String description,author, subject;
        System.out.println("WHAT'S THE SUBJECT OF YOUR MESSAGE?");
        subject=input.nextLine();
        subject=input.nextLine();
        System.out.println("YOUR MESSAGE: ");
        description=input.nextLine();
        System.out.println("ENTER PSEUDONYME( author ): ");
        author=input.nextLine();

        messages[contorMessages++]=new Message(description,author,subject,email);

    }

    public static void seeAllMessages() {
        if (contorMessages == 0)
            System.out.println("No messages to show!");

        for (int i = 0; i < contorMessages; i++)
            messages[i].printM();
    }

    public static void seeMyMessages() {
        if (contorMessages == 0)
            System.out.println("No messages to show!");
int ok=0;
        for (int i = 0; i < contorMessages; i++)
            if (email.equals(messages[i].getId()))
            {messages[i].print();
            ok=1;}

        if(ok==0)
            System.out.println("You didn't post any messages yet!");
    }


    public static void main(String[] args) {

        System.out.println("CHATTERIA");
        System.out.println("1- Sign up ( if you do not have an account)\n2- Log In the App\n3- EXIT");   ///ar mai trebui sa fac o parte in care s azic daca numele e sau nu valabil
        int option = input.nextInt();
        boolean ceva = true;
        while (ceva == true) {
            switch (option) {
                case 1: {
                    signUp();
                    System.out.println("Read another option!");
                    option = input.nextInt();
                    break;
                }
                case 2: {
                    int appValidation = login();
                    while (appValidation != 1) {
                        System.out.println("WRONG PASSWORD OR EMAIL! TYPE AGAIN");
                        appValidation = login();
                        if (appValidation == 99)
                            break;
                    }
                    ////here- we will be entered in the app
                    if (appValidation == 1) //we are in!! =D
                    {
                        ///another menu for the app
                        ///1 - see all  messages
                        ///2 - post new message
                        ///3 - see only messages posted by yourself
                        ///4 - log out and go back to main menu
                        ///5 - exit the page totally
                        System.out.println("Hi, there! You got in! Choose one of your options!\n1 - see all the messages ever posted\n" +
                                "2 - post new message\n" +
                                "3 - see only messages posted by yourself\n" +
                                "4 - log out and go back to main menu\n" +
                                "5 - exit the page totally ");
                        int loginOption = input.nextInt();
                        boolean altceva = true;
                        while (altceva == true) {
                            switch (loginOption) {
                                case 1: {
                                    seeAllMessages();
                                    altceva = true;
                                    System.out.println("Pick another option from the APP MENU! <3");
                                    loginOption = input.nextInt();
                                    break;
                                }
                                case 2: {
                                    postNewMessage(email); ///this is gonna be a little harder
                                    System.out.println("Your message was succesfully posted");
                                    altceva=true;
                                    System.out.println("Pick another option from the APP MENU! :*");
                                    loginOption = input.nextInt();
                                    break;
                                }
                                case 3: {
                                    seeMyMessages(); /// i am gonna need the id- WHERE CURRENT USER email == message id- post it .  Current email0- last email typed
                                    altceva = true;
                                    System.out.println("Pick another option from the APP MENU!");
                                    loginOption = input.nextInt();
                                    break;
                                }
                                case 4: {

                                    altceva = false; //this menu
                                    ceva = true; //outer menu
                                    System.out.println("Choose another option from main menu\n1- Sign up ( if you do not have an account)\n2- Log In the App\n3- EXIT");
                                    option=input.nextInt();
                                    break;
                                }
                                case 5: {
                                    altceva = false;
                                    ceva = false;
                                    break;
                                }
                                default: {
                                    System.out.println("YOU TYPED WRONG! TYPE OPTION AGAIN!!! ");
                                    loginOption = input.nextInt();
                                    altceva = true;
                                    break;
                                }
                            }
                        }
                    }

                    if (appValidation == 99) {
                        System.out.println("Read another option!");
                        option = input.nextInt();
                    }

                    break;
                }
                case 3: {
                    ceva = false;
                    System.out.println("Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Wrong option! Read again!");
                    option = input.nextInt();
                    ceva = true;
                    break;
                }
            }
        }
        System.out.println("Goodbye!!!!!Merry xMas!");

    }


}
