package homework.week4.bluetooth.domain;

public class Refrigerator extends Items{
    private String manufacturer;
    private String color;
    private int numberOfDoors;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String toString() {
        return "Refrigerator : \n" +
                "ID: " + super.getId() + '\n' +
                "Manufacturer: " + manufacturer + '\n' +
                "Color: " + color + '\n' +
                "Number of doors: " + numberOfDoors + '\n' +
                "Has a bluetooth connection?"+ '\n' +
                "Answer: " + super.isBluetoothConnection() + '\n';
    }
}
