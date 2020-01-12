package homework.week4.bluetooth;

public class Phone implements Connectable {
    private String brand;
    private String os;

    public Phone(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void connetToBluetooth() {
        System.out.println("The phone " + brand + " has connected");
    }
}
