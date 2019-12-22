package Homework.Week3.Pb2;

import java.util.List;

public class Customer {
    private String name;
    private MemberShip myMemberShip;
    {
        myMemberShip = MemberShip.NONE;
    }
    private Basket myBasket;

    Customer(String name, MemberShip memberShip)
    {
        myMemberShip = memberShip;
        myBasket = new Basket();
    }

    void addToBasket(ItemForSale item) {
        if(item == null) {
            System.out.println("The item added to the basket is null");
            return;
        }
        myBasket.addItem(item);
    }

    float basketPrice()
    {
        if(myMemberShip.equals(MemberShip.NONE))
            return myBasket.getTotalPrice();
        else if(myMemberShip.equals(MemberShip.SILVER))
            return myBasket.getTotalPrice()*90/100;
        else if(myMemberShip.equals(MemberShip.GOLD))
            return myBasket.getTotalPrice()*80/100;
        return 0;
    }

    void printBasketPrice()
    {
        System.out.println(basketPrice());
    }

    public MemberShip getMyMemberShip() {
        return myMemberShip;
    }

    public void setMyMemberShip(MemberShip myMemberShip) {
        this.myMemberShip = myMemberShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
