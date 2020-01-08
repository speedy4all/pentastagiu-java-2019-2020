package AppConnect;

public class SmartRefrigerator implements Connectable {
    String model;

    public SmartRefrigerator(String model) {
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println( model + " is connecting to bluetooth ........");
    }

    @Override
    public String toString() {
        return "SmartRefrigerator{" +
                "model='" + model + '\'' +
                '}';
    }
}
