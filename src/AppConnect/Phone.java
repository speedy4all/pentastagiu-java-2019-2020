package AppConnect;

public class Phone implements Connectable {
    String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println( model + " is connecting to bloetooth .......");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                '}';
    }
}
