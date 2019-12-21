package problem2;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Andy", Customer.Membership.SILVER);

        Product product1 = new Book(1, "Origins", 40, "Dan Brown");
        Product product2 = new Candy(2, "Skittles", 10.5, 30);
        Product product3 = new Book(3,"Inferno", 30.99, "Dan Brown");

        Basket basket1 = new Basket(customer1);

        basket1.addProduct(product1);
        basket1.addProduct(product2);
        basket1.addProduct(product3);

        if(customer1.getMembership() == Customer.Membership.GOLD){
            System.out.println("You have a 20% discount!");
        }else if(customer1.getMembership() == Customer.Membership.SILVER){
            System.out.println("You have a 10% discount!");
        }else {
            System.out.println("You don't have a discount!");
        }

        System.out.println("The discounted price is: " + basket1.getTotalPrice());

    }
}
