package ex2;


public class ShopApp {
    public static void main(String[] args) {
        Costumer costumer = new Costumer(1, "Andrei", Costumer.Membership.GOLD);

        Book book = new Book(1, "Alice's Adventures in Wonderland", 32, "Lewis Carroll");
        Book book2 = new Book(2, "How dear is life", 12, "Williamson");
        Candy candy = new Candy(55, "Orange jelly candy", 12, 54);

        Basket basket1 = new Basket(costumer);

        basket1.addProduct(book);
        basket1.addProduct(book2);
        basket1.addProduct(candy);

        if (costumer.getMembership() == Costumer.Membership.GOLD) {

            System.out.println("20% discount");

        } else if (costumer.getMembership() == Costumer.Membership.SILVER) {

            System.out.println("10% discount");

        } else {

            System.out.println("You don't have a discount!");

        }


        System.out.println("The discounted price is: " + basket1.getTotalPrice());

    }
}
