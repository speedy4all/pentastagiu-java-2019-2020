package com.pentalog.pentastagiu.homework2.problem2;

import com.pentalog.pentastagiu.homework2.problem1.BankAccount;
import com.pentalog.pentastagiu.homework2.problem3.*;

public class HomeworkApp {
    public static void main(String[] args) {
        //Problem 1 --
        BankAccount firstAccount = new BankAccount(1000);
        firstAccount.depositMoney(200);
        firstAccount.withdrawMoney(300);
        firstAccount.withdrawMoney(1300);

        //Problem 2 --
        Customer firstCustomer = new Customer(123,"Marian",membershipStatus.SILVER);
        System.out.println("Status: " + firstCustomer.getStatus());

        Candy candy = new Candy(1,"Diabetes",0.5,100);
        Basket firstCustomerBasket = new Basket(firstCustomer);
        System.out.println(firstCustomerBasket.addCandy(candy));

        Book book = new Book(2,"C-um sa scri corec!",100,"Viorica Vasilica Dancila");
        System.out.println(firstCustomerBasket.addBook(book));

        //Problem 3 --
        Board board = new Board();
        board.setBoard();
        board.setMessage();
        System.out.println(Board.displayMessage());

    }}
