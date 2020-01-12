package homework.week4.Restaurants;

import java.util.Objects;

public class Menu {
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object secondMenu) {
        if (this == secondMenu) return true;
        if (secondMenu == null || getClass() != secondMenu.getClass()) return false;
        Menu menu = (Menu) secondMenu;
        return Objects.equals(name, menu.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
