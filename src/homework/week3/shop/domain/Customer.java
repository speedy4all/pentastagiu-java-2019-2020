package homework.week3.shop.domain;

public class Customer {
    private int idC;
    private String nameC;
    private Product product;

    public Customer(int idC, String nameC, double discount) {
        this.idC = idC;
        this.nameC = nameC;
        this.discount = discount;
    }

    private enum membership{
        GOLD(0.2),
        SILVER(0.1),
        NO_MEMBERSHIP(0);

        membership(double i) {

        }
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    private double discount;

    public Customer(final double discount){
        this.discount=discount;
    }

    public double getDiscount(){
        return discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\n ID: " + idC +
                "\nName: " + nameC +
                "\nDiscount: " + discount;
    }
}
