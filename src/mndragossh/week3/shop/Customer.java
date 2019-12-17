package src.mndragossh.week3.shop;

public class Customer {
    int id;
    String name;
    Membership membership = null;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Membership getMembership() {
        return membership;
    }
}
