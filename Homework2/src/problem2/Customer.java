package problem2;

public class Customer{

    private int id;
    private String name;
    private Membership membership;

    public Customer(int id, String name, Membership membership){
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

    public enum Membership{
        GOLD,
        SILVER
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

}
