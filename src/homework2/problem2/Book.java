package homework2.problem2;

public class Book extends Product{
    private String author;

   public Book( String name, double price, String author){
        super( name, price);
        this.author = author;
    }


}
