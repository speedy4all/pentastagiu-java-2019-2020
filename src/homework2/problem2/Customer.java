package homework2.problem2;

public class Customer {
    private static int counter = 1;
    private int id;
    private String name;
    private Membership membership;

    public Customer(String name, Membership membership){
        this.id = counter;
        counter++;
        this.name = name;
        this.membership = membership;
    }


    public String getName() {
        return name;
    }

    public Membership getMembership() {
        return membership;
    }
}
