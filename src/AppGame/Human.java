package AppGame;

public class Human extends Character {
    public Human(String name, int healthPoints, int energyPoints, Position position) {
        super(name, healthPoints, energyPoints, position);
    }
    @Override
    public void attack(Character character ){
        this.energyPoints -= 5;
        character.healthPoints-=10;
        if (character.healthPoints == 0) {
            System.out.println("You are already dead!");
        }
    }

    @Override
    public String toString() {
        return "Human: " +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                '.';
    }
}
