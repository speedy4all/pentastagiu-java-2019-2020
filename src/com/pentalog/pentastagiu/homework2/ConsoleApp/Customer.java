package com.pentalog.pentastagiu.homework2.ConsoleApp;

public class Customer {

    private static int Counter=0;
    private int Id;
    private String Name;
    private String Membership;

Customer( String Name, String Membership){
    Id=Counter++;
    this.Membership=Membership;
    this.Name=Name;
}

    public int getId() {
        return Id;
    }

    public String getMembership() {
        return Membership;
    }

    public void setMembership(String Membership) {
        this.Membership = Membership;
    }

}
