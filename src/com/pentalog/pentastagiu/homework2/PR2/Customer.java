package com.pentalog.pentastagiu.homework2.PR2;

public class Customer {
    private int id; ///6 digits
    private String firstName, lastName;
    private String membership;

    public Customer(int id, String firstName, String lastName, String membership)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.membership=membership;
    }

    public void getMembershipStatus(String membership) {
        switch(membership)
        {
            case "GOLD":
                System.out.println("Dear client, your total price will be discounted with 20%");
                break;
            case "SILVER":
                System.out.println("Dear client, your total price will be discounted with 10%");
                break;
            case "NONE":
                System.out.println("Dear client, we are sorry to inform you that your membership does not exist");
                break;
            default:
                System.out.println("Type your membership again!");
                break;
        }
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
