package AppConnect;

public class AppConnectToBluetooth {
    public static void main(String[] args) {

        Object [] objects = new Object[]{new Car("Audi"),
                new Phone("Samsung"),
                new SmartRefrigerator("Zanusi"),
                new SmartRefrigerator("Wirlpool"),
                new Student("Ion ", "Ionescu", 22)};
        for(int i= 0 ; i<objects.length ; i++){
            if(objects[i] instanceof Connectable){
                ((Connectable) objects[i]).connectToBluetooth();
            }
        }
    }
}
