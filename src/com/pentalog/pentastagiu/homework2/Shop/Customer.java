package com.pentalog.pentastagiu.homework2.Shop;

import com.pentalog.pentastagiu.homework2.Shop.CustomerMembership.MembershipType;

public class Customer {
    private long id;
    private String name;
    private MembershipType membershipType;

    public Customer(long id, String name, MembershipType membershipType) {
        this.id = id;
        this.name = name;
        this.membershipType = membershipType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membershipType=" + membershipType +
                '}';
    }
}
