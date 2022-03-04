package homework2.problem2;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private double totalPrice;
    private Customer customer;

   public Basket( Customer customer){
       Objects.requireNonNull(customer, "The customer associated to a basket can't be null");
       this.customer = customer;
    }

    public double addProducts(ArrayList<Product> products){
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        System.out.println("The price of the basket is: " + totalPrice);
        return totalPrice;

    }

    public double getFinalPrice() {
        Membership membership;
        if (Membership.GOLD.equals(customer.getMembership())){
            membership = Membership.GOLD;
            return totalPrice = membership.calculateDiscount(totalPrice);
        } else if(Membership.SILVER.equals(customer.getMembership())){
            membership = Membership.SILVER;
            return  totalPrice = membership.calculateDiscount(totalPrice);
        } else {
            return totalPrice;
        }

    }




}
