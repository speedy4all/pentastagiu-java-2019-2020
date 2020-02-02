package homework2.problem2;

public class Product {
    private static int counter = 1;
    protected int id;
    protected String name;
    protected double price;

    public Product( String name, double price){
       if(price < 0){
           throw new  IllegalArgumentException();
       }
        this.id = counter;
        counter++;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
