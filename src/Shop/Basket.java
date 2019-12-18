package Shop;

public class Basket {
    private Customer customer;
    private double totalPrice;
    private double updateTotalPrice;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void AddToBasket ( Product product){
        totalPrice=totalPrice+product.getPrice();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getUpdateTotalPrice() {
        Status membership = customer.getMembership();
        double discount=0;
        switch (membership){
            case GOLD:
                discount= totalPrice*0.2;
                break;
            case SILVER:
                discount=totalPrice*0.1;
                break;
            case NOMEMBERSHIP:
                discount=totalPrice*0;
                break;
        }
        updateTotalPrice=totalPrice-discount;
        return updateTotalPrice;
    }

    public void setUpdateTotalPrice(double updateTotalPrice) {
        this.updateTotalPrice = updateTotalPrice;
    }
}


