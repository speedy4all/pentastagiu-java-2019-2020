package com.pentalog.pentastagiu.homework2.shop;

public class ClientsOfShop {

    private String name;
    private MembershipStatus membershipStatus;

    public ClientsOfShop(String name, MembershipStatus membershipStatus) {
        this.name = name;
        this.membershipStatus = membershipStatus;
    }

    public int priceForCostumer(){
        switch (membershipStatus){
            case GOLD: return 20;
            case SILVER: return 10;
            case NoMEMBERSHIP: return 0;
            default:
                System.out.println("Please introduce membership status:");
                break;
        }
        return 0;

    }

    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
