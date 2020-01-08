package AppRestaurant;

public class Restaurant {
    private String name;
    private String type;
    protected int guestNumber;
    protected double income;
    protected Menu menu;

    public Restaurant(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    public void addGuest(int newGuest){
        guestNumber=guestNumber+newGuest;
    }

    public double getIncome() {  // nu inteleg ce fac gresit la aceasta metoda
        income =  guestNumber * menu.getPrice();
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant:" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '.';
    }
}
