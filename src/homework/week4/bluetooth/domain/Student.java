package homework.week4.bluetooth.domain;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student \n" +
                "Name: " + name + '\n';
    }
}
