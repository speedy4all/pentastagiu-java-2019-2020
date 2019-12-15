package homework.week3.Shop;

import static homework.week3.Shop.Membership.*;

public class ShopApp {
    public static void main(String[] args) {
        Book IceAndFire = new Book(0, "The Song of Ice and Fire", 310, "George RR Martin");
        Book RingLords = new Book(1, "The Lord of the Rings", 235, "JRR Tolkien");
        Candy Joe = new Candy(2, "Joe wafers", 7, 230);

        Customer George = new Customer(0, "George", SILVER);

        Basket cos = new Basket(George);

        cos.addProduct(IceAndFire);
        cos.addProduct(RingLords);
        cos.addProduct(Joe);

        cos.getProducts();

        System.out.println("Total to pay: " + cos.getTotal());
    }
}
