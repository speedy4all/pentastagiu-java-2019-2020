package AppGame;

public class Animal extends Character {
    public Animal(String name, int healthPoints, int energyPoints, Position position) {
        super(name, healthPoints, energyPoints, position);
    }


    @Override
    public String toString() {
        return "Animal: " +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                '.';
    }
}
