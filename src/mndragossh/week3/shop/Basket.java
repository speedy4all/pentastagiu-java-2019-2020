package src.mndragossh.week3.shop;

import java.util.ArrayList;

public class Basket {
    Customer customer;
    ArrayList<Product> products;

    public Basket(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        products.add(product);
    }

    public void removeFromBasket(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
       if(customer.membership != null) {
           if (customer.membership.equals(Membership.Gold)) {
               return products.stream().mapToDouble(x -> x.price).sum() - products.stream().mapToDouble(x -> x.price).sum() * 0.3;
           }
           if (customer.membership.equals(Membership.Silver)) {
               return products.stream().mapToDouble(x -> x.price).sum() - products.stream().mapToDouble(x -> x.price).sum() * 0.1;
           }
       }

        return products.stream().mapToDouble(x -> x.price).sum();
    }
}
