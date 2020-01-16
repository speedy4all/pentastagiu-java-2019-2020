package homework5;

import java.util.Objects;

public class Employees implements Comparable<Employees> {
    private String firstName;
    private String secondName;

    public Employees() {
    }

    public Employees(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Employees: " +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '.';
    }

    @Override
    public int compareTo(Employees o) {
        return firstName.compareTo(o.getFirstName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(firstName, employees.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}
