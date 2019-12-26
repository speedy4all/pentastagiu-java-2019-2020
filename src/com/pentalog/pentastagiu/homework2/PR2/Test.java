package com.pentalog.pentastagiu.homework2.PR2;

import java.util.Scanner;

///we will have 2 types of logic. One it's gonna be the administrator, whose password will be: 123456, and the client, without a password.
public class Test {
    public static Product[] products = new Product[50]; ///by convention, we can store 50 types of different products in our store
    public static Scanner input = new Scanner(System.in);
    public static int contor = 0;


    public static void setInitialStock() {
        products[contor++] = new Book(1234, "Inteligenta Emotionala", 50, 5, "Cartea lui Daniel Goleman a marcat o revoluţie uluitoare în psihologie prin analiza importanţei covârşitoare a emoţiilor în dezvoltarea personalitãţii umane. Studiul sãu ne explicã cum, atunci când ne înţelegem sentimentele, situaţia în care ne aflãm devine mai limpede. Descoperim chiar un nou mod de a privi cauzele bolilor care ne macinã familia şi societatea.\n Preluând rezultatele cercetãrilor asupra creierului şi comportamentului, autorul propune extinderea conceptului de inteligenţã. Este binecunoscut termenul de IQ - coeficientul care mãsoarã inteligenţa umanã înnãscutã şi care nu prea poate fi ameliorat pe parcursul vieţii. O asemenea înţelegere nu explicã, de pildã, situaţiile în care persoane cu un IQ mediu sau relativ scãzut au cunoscut un mare succes.", "Daniel Goleman");
        products[contor++] = new Candy(2000, "Bomboana cu martipan", 2, 100, 3, 250);
        products[contor++] = new Book(1235, "Secolul 21", 29, 2, " Si toata matematica e un zbor spre altceva", "Solomon Marcus");
    }

    public static void addToInventary() {
        System.out.println("Heeeey, Admin, this option is to add to the inventory.When you are done, please press 0 (on a new line)");

        int option = 1;
        while (option != 0) {
            System.out.println("What do you want to add? \nPress 1 - for a book\nPress 2 - for a candy");
            int prodOption = input.nextInt();

            System.out.println("id: ");
            int id = input.nextInt();
            System.out.println("name: ");
            String name = input.nextLine();
            name = input.nextLine();
            System.out.println("price: ");
            int price = input.nextInt();
            System.out.println("quantity: ");
            int quantity = input.nextInt();

            if (prodOption == 1) {
                System.out.println("description: ");
                String description = input.nextLine();
                description = input.nextLine();
                System.out.println("author: ");
                String author = input.nextLine();
                products[contor++] = new Book(id, name, price, quantity, description, author);
            } else if (prodOption == 2) {
                System.out.println("quantity in grams:");
                int quantityInGrams = input.nextInt();
                System.out.println("calories");
                int calories = input.nextInt();
                products[contor++] = new Candy(id, name, price, quantity, quantityInGrams, calories);
            }
            System.out.println("Read another product! Press one for 1 if YES, press 0 if NOT");
            option = input.nextInt();

        }

    }

    public static void seeStock() {
        if (contor == 0)
            System.out.println("Empty stock");
        else
            for (int i = 0; i < contor; i++)
                System.out.println(products[i].toString());
    }

    public static int adminM() {
        int adminMenu = 0; /// 0- exit totally, 1 - set initial stock, 2- add items , 3 - see stock, 4- go back to main menu
        int password = 123456;
        int passmatch;
        System.out.println("Welcome dear admin! Please enter your password");
        passmatch = input.nextInt();
        while (passmatch != password) {
            System.out.println("Wrong password! Read again or press 0 to go back to the main menu!");
            if (passmatch == 0)
                return 1;
            passmatch = input.nextInt();
        }

        if (passmatch == password) {
            System.out.println("Heey admin! Let's see your options!\n 0- totally exit\n 1- set inital stock\n 2- add items to the stock\n 3- see stock\n 4- go back to main menu");
            System.out.println("Read option!");
            adminMenu = input.nextInt();
            while (adminMenu != 4) {
                if (adminMenu == 0)
                    break;
                else if (adminMenu == 1) {
                    setInitialStock();
                    System.out.println("stock set up");
                } else if (adminMenu == 2) {
                    {
                        addToInventary();
                        System.out.println("item- added");
                    }
                } else if (adminMenu == 3) {
                    seeStock();
                } else if (adminMenu == 4)
                    return 1;
                else
                    System.out.println("Wrong option!");

                System.out.println("Read another option!");
                adminMenu = input.nextInt();
            }

        }
        if (adminMenu == 0)
            return 0; ///go out, read other option
        if (adminMenu == 4)
            return 1;

        return 1;
    }

    public static int clientM() {
        String customerName, customerFirstName;
        int cusotmerId;
        String membership;
        System.out.println("Hello, dear client! Please enter your last name: ");
        customerName = input.nextLine();
        customerName = input.nextLine();
        System.out.println("First name:");
        customerFirstName = input.nextLine();
        System.out.println("Enter your customer id:");
        cusotmerId = input.nextInt();
        System.out.println("Enter your membership status (in CAPS)");
        membership = input.nextLine();
        membership = input.nextLine();
        while (!membership.equals("GOLD") && !membership.equals("SILVER") && !membership.equals("NONE")) {
            System.out.println("Membership wrongly typed!");
            membership = input.nextLine();

        }
        Customer client = new Customer(cusotmerId, customerFirstName, customerName, membership);

        System.out.println("Dear " + client.getLastName() + " welcome to our store! \nChoose your option! \n 0- totally exit\n 1- add to basket \n 2- see total price \n 3- see basket\n 4- see stock \n5- go back to main menu");
        int clientMenu = input.nextInt(); /// 0- exit totally, 1- add to bascket, 2- see total price,3-SEE BASKET  4- go back to main menu
        Basket[] cos = new Basket[50];
        int cont=0;
        int i = 0;
        while (clientMenu != 5) {

            if (clientMenu == 0)
                return 0;
            else if (clientMenu == 1)  ///add to basket
            {
                seeStock();
                System.out.println("Pick the id of the product you want to add! Take care to be on the stock");
                int idTry = input.nextInt();
                int ok = 0;
                while (ok == 0) {
                    for (i = 0; i < contor; i++) {
                        if (products[i].id == idTry && products[i].quantity != 0) {  ///crapaaaa
                            ok = 1;
                            break;
                        } else if (products[i].id == idTry && products[i].quantity == 0) {
                            System.out.println("Out of stock");
                        }
                        else if (idTry==0)
                            return 1;
                        else
                            ok=0;
                    }
                    /////////////////////
                    if (ok == 1) {
                        cos[cont++] = new Basket(products[i], products[i].price, client.getId());
                        System.out.println("Added to your basket");
                        products[i].quantity--; ///scadem stocul
                        if (cos[cont-1].getTotal() >= 100) {
                            System.out.println("Congratsssss! More than 100 lei in your basket!!!! Your status will be upgraded!");
                            if (client.getMembership().equals("GOLD"))
                                System.out.println("you cannot be more than GOLD");
                            else if (client.getMembership().equals("SILVER")) {
                                System.out.println("You are gonna be gold now");
                                client.setMembership("GOLD");
                            } else if (client.getMembership().equals("NONE")) {
                                System.out.println("You are gonna be silver now");
                                client.setMembership("SILVER");
                            }
                          if(client.getMembership()=="NONE")
                              System.out.println("no discounted price");
                          else
                              if(client.getMembership()=="SILVER") {
                                  System.out.println("your price will be discounted with 10%");
                                  Basket.setTotalPrice(Basket.getTotal()-(10*Basket.getTotal()/100));
                              }
                              else  if(client.getMembership()=="GOLD") {
                                  System.out.println("your price will be discounted with 20%");
                                  Basket.setTotalPrice(Basket.getTotal()-(20*Basket.getTotal()/100)); ///IT'S GONNA BE HALF TRUE :)) THEY ARE DECLARED AS INT
                              }

                        }
                    } else {
                        System.out.println("WRONG ID! Read another one, or press 0 if you are done");
                        idTry = input.nextInt();
                    }
                }
            } else if (clientMenu == 2) {

                System.out.println("The total price of your products: " + Basket.getTotal());

            } else if (clientMenu == 3) {
                for(i=0;i<cont;i++)
                {
                    cos[i].printBasket();
                }
            } else if (clientMenu == 4) {
                seeStock();
            } else {
                System.out.println("wrong option!!!! read again!!!");

            }

            System.out.println("Read another option!");
            clientMenu = input.nextInt();
        }

        return 1;
    }

    ///THE MEMBERSHIP OF A PERSON CHANGES WHEN IT'S ORDER'S VALUE IS MORE THAN 100 LEI.
    ///KEEP ATTENTION TO THE NUMBER OF PRODUCT IN INVENTORY
    public static void main(String[] args) {

        System.out.println("Welcome to Cristus Shop!");

        int mainMenuOption; //0 - exit totally, 1 - admin, 2- client, others- wrong option


        System.out.println("0- totally exit\n1- admin menu\n2- client");
        mainMenuOption = input.nextInt();
        while (mainMenuOption != 0) {
            if (mainMenuOption == 1) { ///admin
                mainMenuOption = adminM(); ///0 it's gonna get out

                if (mainMenuOption == 1) {
                    System.out.println("Read another option!\n0- totally exit\n1- admin menu\n2- client");
                    mainMenuOption = input.nextInt();
                }

            } else if (mainMenuOption == 2) { ///client
                mainMenuOption = clientM();

                if (mainMenuOption == 1) {
                    System.out.println("Read another option!\n0- totally exit\n1- admin menu\n2- client");
                    mainMenuOption = input.nextInt();
                }

            } else { ///wrong, read again

                System.out.println("Wrong option, read again!");
                mainMenuOption = input.nextInt();
            }


        }
        System.out.println("Goodbye, dear!");

    }


///etichetele pe continue si break functioneaza doar in cazul loop- ului

}