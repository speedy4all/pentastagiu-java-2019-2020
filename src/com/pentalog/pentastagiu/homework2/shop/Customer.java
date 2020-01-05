package com.pentalog.pentastagiu.homework2.shop;

import static javafx.scene.paint.Color.GOLD;
import static javafx.scene.paint.Color.SILVER;

public class Customer {
    private int id;
    private String name;
    public MemberShip membership;
    public enum MemberShip{
        GOLD, SILVER, NOMEMBERSHIP
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

    public void setMemberShip(MemberShip membership){
        this.membership = membership;
    }

    public MemberShip getMemberShip(){
        return membership;
    }

    public Customer(){

    }
    public Customer(int id, String name, MemberShip membership){
        this.id  = id;
        this.name = name;
        this.membership = membership;
    }

    public String toString(){
        return "Cutomer: " + id + ", " + name + ", " + membership;
    }

}
