package homework.week4.bluetooth.domain;

public class Cars extends Items{

    private String model;
    private String color;
    private String owner;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car \n" +
                "ID: " + super.getId() + '\n' +
                "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "Owner: " + owner + '\n' +
                "Has a bluetooth connection?"+ '\n' +
                "Answer: " + super.isBluetoothConnection() + '\n';
    }
}
