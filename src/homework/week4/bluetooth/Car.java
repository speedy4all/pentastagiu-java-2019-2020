package homework.week4.bluetooth;

public class Car implements Connectable {
    private String brand;
    private int horsePower;

    public Car(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void connetToBluetooth() {
        System.out.println("The car " + brand + " has connected.");
    }
}
