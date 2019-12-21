package homework2.problem2;

import java.util.ArrayList;

public class Basket {
    private double totalPrice;
    private Customer customer;

   public Basket(double totalPrice, Customer customer){
        this.totalPrice = totalPrice;
        this.customer = customer;
    }

    public double addProduct(ArrayList<Product> products){
        for (Product product : products) {
            if (product instanceof Candy) {
                totalPrice = totalPrice + (((Candy) product).getPrice() * ((Candy) product).getQuantity());
            } else if (product instanceof Book) {
                totalPrice = totalPrice + ((Book) product).getPrice();
            }
        }

        System.out.println("The price of the basket is: " + totalPrice);
        return totalPrice;

    }

    public double getFinalPrice() {
        if (customer.getMembership().equals(Membership.GOLD)){
            return totalPrice = totalPrice - ((totalPrice*20)/100);
        } else if(customer.getMembership().equals(Membership.SILVER)){
            return  totalPrice = totalPrice - ((totalPrice*10)/100);
        } else {
            return totalPrice;
        }

    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
