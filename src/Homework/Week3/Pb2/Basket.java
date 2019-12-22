package Homework.Week3.Pb2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private float totalPrice;
    private ArrayList<ItemForSale> items;

    Basket()
    {
        items = new ArrayList<ItemForSale>();
    }

    void addItem(ItemForSale item)
    {
        totalPrice += item.getPrice();
        items.add(item);
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
