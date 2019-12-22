package com.pentalog.pentastagiu.homework3.ex2;

public class Basket {
    private double totalPrice;
    private Costumer costumer;

    public Basket(Costumer costumer) {
        this.costumer = costumer;
    }

    private void addProduct(Product produs) {
        this.totalPrice += produs.getPrice();
        System.out.println("The product was successfully added!! Total price = " + this.totalPrice + " lei.");
    }

    private void infoBasket() {
        switch (this.costumer.getStatus()) {
            case Gold:
                System.out.println("Total price: " + this.totalPrice + " ; Reduced price: "
                        + (this.totalPrice - 0.2 * this.totalPrice));
                break;
            case Silver:
                System.out.println("Total price: " + this.totalPrice + " ; Reduced price: "
                        + (this.totalPrice - 0.1 * this.totalPrice));
                break;
            case NoMembership:
                System.out.println("Total price: " + this.totalPrice + ".");
                break;
        }
    }

    public static void main(String[] args) {
        Costumer client = new Costumer(1, "Popescu Ion", Status.Gold);

        Basket basket = new Basket(client);

        Book book1 = new Book(1, "book", 30.5, "Ion Creanga");
        Candy candy = new Candy(2, "candy", 15, 18);
        Book book2 = new Book(3, "book", 25.7, "Fratii Grimm");

        basket.addProduct(book1);
        basket.addProduct(candy);
        basket.addProduct(book2);

        basket.infoBasket();
        client.setStatus(Status.Silver);
        basket.infoBasket();

    }

}
