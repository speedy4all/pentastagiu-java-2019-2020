package myHomeWork.week3.shop;

public class Basket{
    Customer customer;
    float totalPrice = 0;
    public Basket(Customer customer){
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Basket: " + customer.getName() + ", total price: " + totalPrice;
    }
    public void add(Product product){
        totalPrice += product.getPrice();
        System.out.println("Product successfully added! +" + product.getPrice());
    }

    public float applyDiscount(){
        float priceAfterDiscount = totalPrice;
        if(customer.getMemberShip().equals(Customer.MemberShip.GOLD))
            priceAfterDiscount = priceAfterDiscount * 0.8f;
        else if(customer.getMemberShip().equals(Customer.MemberShip.SILVER))
            priceAfterDiscount = priceAfterDiscount * 0.9f;
        else
            priceAfterDiscount = priceAfterDiscount;
        return priceAfterDiscount;
    }

    public void getDiscountInfo(){
        System.out.println("Basket: " + customer.getName() + ", price after discount: " + applyDiscount() + ", discount: " + (totalPrice-applyDiscount()));
    }


}
