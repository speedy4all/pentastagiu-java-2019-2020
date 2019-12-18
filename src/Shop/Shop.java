package Shop;

public class Shop {
    public static void main(String[] args) {

        Customer paul = new Customer("Paul", 1, Status.NOMEMBERSHIP);
        System.out.println(paul);
        Basket paulBasket = new Basket(paul);

        System.out.println("\nProduse introduse in cos: ");

        Candy ciocolata = new Candy(1, "Milka", 15.5, 100);
        Candy caramele = new Candy(2, "M&M", 5.5, 125);
        Books book1 = new Books(3, "Java", 35.5, "Pentalog");
        Books book2 = new Books(4, "Vine Craciunul", 22.5, "Madalina Mihai");
        System.out.println(ciocolata);
        System.out.println(caramele);
        System.out.println(book1);
        System.out.println(book2);

        paulBasket.AddToBasket(ciocolata);
        paulBasket.AddToBasket(caramele);
        paulBasket.AddToBasket(book1);
        paulBasket.AddToBasket(book2);
        System.out.println("\nAveti un total de: " + paulBasket.getTotalPrice()+ " lei.\n");
        System.out.println("Sunteti membru " + paul.getMembership() + " , aveti un total de: " + paulBasket.getUpdateTotalPrice() + "  lei.");

        paul.setMembership(Status.GOLD);
        System.out.println("Sunteti membru " + paul.getMembership() + " , aveti un total de: " + paulBasket.getUpdateTotalPrice() + "  lei.");

        paul.setMembership(Status.SILVER);
        System.out.println("Sunteti membru " + paul.getMembership() + " , aveti un total de: " + paulBasket.getUpdateTotalPrice() + "  lei.");


        Customer andrei = new Customer("Andrei", 2,Status.NOMEMBERSHIP);
        System.out.println(andrei);
        Basket andreiBasket = new Basket(andrei);

        System.out.println("\nProduse introduse in cos: ");

        Candy drajeuri= new Candy(1,"Drajeuri", 5.3, 150);
        Candy biscuiti  = new Candy(2 ,"Biscuiti", 10.3, 200);
        System.out.println(drajeuri);
        System.out.println(biscuiti);
        System.out.println(book2);

        andreiBasket.AddToBasket(drajeuri);
        andreiBasket.AddToBasket(biscuiti);
        andreiBasket.AddToBasket(book2);
        System.out.println("\nAveti un total de: " + andreiBasket.getTotalPrice()+ " lei.\n");
        System.out.println("Sunteti membru " + andrei.getMembership() + " , aveti un total de: " + andreiBasket.getUpdateTotalPrice() + "  lei.");

        andrei.setMembership(Status.GOLD);
        System.out.println("Sunteti membru " + andrei.getMembership() + " , aveti un total de: " + andreiBasket.getUpdateTotalPrice() + "  lei.");

        andrei.setMembership(Status.SILVER);
        System.out.println("Sunteti membru " + andrei.getMembership() + " , aveti un total de: " + andreiBasket.getUpdateTotalPrice() + "  lei.");



    }


}
