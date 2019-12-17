package src.mndragossh.week3.shop;

public class Candy extends Product {
    int quantity; // grams

    public Candy(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        /**
         * pentru cazurile in caz ca pretul este deja calculat
         * this.price = price; pentru pret per toata cantitatea
         */

        /**
         * pret per kg
         * cantitatea in grams
         * price * (quantity / 1000.0)
         */
        this.price = price * (quantity / 1000.0);
        this.quantity = quantity;
    }
}
