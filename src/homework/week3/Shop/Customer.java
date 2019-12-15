package homework.week3.Shop;

public class Customer {
    private int id;
    private String name;
    private Membership member;

    Customer (int id, String name, Membership member) {
        this.id = id;
        this.name = name;
        this.member = member;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Membership getMember() {
        return member;
    }

}
