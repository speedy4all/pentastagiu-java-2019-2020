package homework.week4.bluetooth;

public class Refrigerator implements Connectable {
    private String brand;
    private boolean isSmart;

    public Refrigerator(String brand, boolean isSmart) {
        this.brand = brand;
        this.isSmart = isSmart;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public void connetToBluetooth() {
        System.out.println("The smart refrigerator " + brand + " has connected.");
    }
}
