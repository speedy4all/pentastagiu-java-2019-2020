package myHomeWork.week3.shop;

public class Candy extends Product{
    private int quantityInGrams;

    public int getQuantityInGrams() {
        return quantityInGrams;
    }

    public void setQuantityInGrams(int quantityInGrams) {
        this.quantityInGrams = quantityInGrams;
    }
    public Candy(){

    }
    public Candy(int id, String name, float price, int quantityInGrams){
        super(id, name, price);
        this.quantityInGrams = quantityInGrams;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getQuantityInGrams();
    }
}
