package Shop;

public class Customer {
    private String name;
    private int ID;
    private Status membership;
    public Customer(String name, int ID, Status membership) {
        this.name = name;
        this.ID = ID;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Status getMembership() {
        return membership;
    }

    public void setMembership(Status membership) {
        this.membership = membership;
    }


    @Override
    public String toString() {
        return "Customer:" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", membership=" + membership +
                '.';
    }
}

