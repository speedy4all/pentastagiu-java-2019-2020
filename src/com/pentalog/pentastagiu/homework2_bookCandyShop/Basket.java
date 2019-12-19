package com.pentalog.pentastagiu.homework2_bookCandyShop;

public class Basket {
    private Double totalPrice=0.00;
    private Customer customer;
    private Product product;
    private Integer quantity;
    private Double totalDiscount;

    //constructors
    public Basket() {
    }

    public Basket(Customer customer, Product product, Double totalPrice) {
        this.customer = customer;
        this.product = product;
        this.totalPrice = totalPrice;
    }

    //methods for getting prices
    //getting total price  with discount applied
    public Double getTotalBasketWithDiscount(Double totalPrice) {
        if(totalPrice<150.00) {
            totalPrice=totalPrice-(MembershipStatus.NO_MEMBERSHIP.getDiscountMembership()*totalPrice);
        }else if(totalPrice<300.00) {
            totalPrice=totalPrice-(MembershipStatus.SILVER.getDiscountMembership()*totalPrice);
        }else if(totalPrice>300.00) {
            totalPrice=totalPrice-(MembershipStatus.GOLD.getDiscountMembership()*totalPrice);
        }
        return totalPrice;
    }

    //discount calculated based on the total value from basket and membership
    public Double getDiscountPrice(Double totalPrice) {
        if(totalPrice<150.00) {
            totalDiscount=(MembershipStatus.NO_MEMBERSHIP.getDiscountMembership()*totalPrice);
        }else if(totalPrice<300.00) {
            totalDiscount=(MembershipStatus.SILVER.getDiscountMembership()*totalPrice);
        }else if(totalPrice>300.00) {
            totalDiscount=(MembershipStatus.GOLD.getDiscountMembership()*totalPrice);
        }
        return totalDiscount;
    }

    //getters and setters
    public Double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalPrice=" + totalPrice +
                ", customer=" + customer +
                ", product=" + product +
                ", quantity=" + quantity +
                ", totalDiscount=" + totalDiscount +
                '}';
    }
}
