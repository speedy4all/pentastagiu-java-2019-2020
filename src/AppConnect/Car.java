package AppConnect;

public class Car implements Connectable {
    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public void connectToBluetooth() {
        System.out.println( model + " is connecting to bluetooth....");
    }
}
