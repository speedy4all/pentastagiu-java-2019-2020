package Homework2.EX2;

public class Product {
    private ProductType productName;
    private double price;

    public ProductType getProductName() {
        return productName;
    }

    public void setProductName(ProductType productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    enum ProductType {
        BOOK,
        CANDY
    }

    public Product() {
        this.productName = ProductType.BOOK;
        this.price = 20.00;
    } ///constructor

    public Product(ProductType book, double price) {
        this.productName = book;
        this.price = price;
    }
}
