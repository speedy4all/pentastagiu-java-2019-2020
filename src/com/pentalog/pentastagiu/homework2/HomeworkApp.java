package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.boardApp.Board;
import com.pentalog.pentastagiu.homework2.boardApp.Users;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes " +
                "related to homework 2");
//        Atm atm = new Atm();
//        atm.getBalance();
//        atm.deposit(456.77);
//        atm.deposit(0.23);
//        atm.getBalance();
//        atm.withdraw(200);
//        atm.getBalance();

//      Customer customer = new Customer("Cosmin", Customer.Membership.GOLD);
////      Customer customer1 = new Customer("Andrei", Customer.Membership.SILVER);
////      Customer customer2 = new Customer("Mihai", Customer.Membership.NOMEMBERSHIP);
////      Product book = new Book("java head first", 50, "Kathy Sierra, Bert Bates");
////      Product anotherBook = new Book("The body", 15.8, "Bill Bryson");
////      Product candy = new Candy("Sugar", 4, 3);
////      Basket bsk = new Basket();
////      bsk.addProducts(book);
////      bsk.addProducts(anotherBook);
////      bsk.addProducts(candy);
////      System.out.println(customer.toString());
////      bsk.getPriceWithDiscount(customer);
////      System.out.println(customer1.toString());
////      bsk.getPriceWithDiscount(customer1);
////      System.out.println(customer2.toString());
////      bsk.getPriceWithDiscount(customer2);

        Board board = new Board();
        board.setBoard();
        board.setMessage();
        board.showMessages();



    }
}
