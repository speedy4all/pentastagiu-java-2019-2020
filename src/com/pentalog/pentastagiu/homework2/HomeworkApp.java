package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.ex1.Bank;
import com.pentalog.pentastagiu.homework2.ex2.Basket;
import com.pentalog.pentastagiu.homework2.ex2.Customer;
import com.pentalog.pentastagiu.homework2.ex2.Product;
import com.pentalog.pentastagiu.homework2.ex3.Message;
import com.pentalog.pentastagiu.homework2.ex3.User;

public class HomeworkApp {
    public static void main(String[] args) {
       //ex 1
         Double w1 = 20.00;
        Double v1 = 200.00;
        Double d = 20.00;
        Boolean id = true;


        Bank bank = new Bank(w1, v1, d, id);
        if (v1 < w1) {
            System.out.println("You can't withdraw");
        }
        System.out.println("Your  bankdata is:");
        System.out.println(bank);
        //ex2
        Customer c1=new Customer(1,"Felix","no membership");
        Product p1=new Product(1,"book",30);
        Basket b1=new Basket(300,c1);
        int discount=20;
        int pr=Product.getPrice();
        String gold="GOLD";
        String silver="SILVER";
        if(discount==20)
        {
            Product.modify20( pr);
            Customer.modifygold( gold);

        }
        else if(discount==10)
        {
            Product.modify10( pr);
            Customer.modifysilver(silver);
        }


        System.out.println("Your new data:");
        System.out.println(b1) ;

//ex3


        User user=new User("Reaper","reaper@gmail.com");
        Message message=new Message("Hello", user);
        System.out.println(message);

    }
}
