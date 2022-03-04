package AppGame;

public class Monster extends Character {
    public Monster(String name, int healthPoints, int energyPoints, Position position) {
        super(name, healthPoints, energyPoints, position);
    }
    @Override
    public void attack(Character character ){
        this.energyPoints -= 3;
        character.healthPoints-=15;
        if (character.healthPoints == 0) {
            System.out.println("You are already dead!");
        }
    }

    @Override
    public String toString() {
        return "Monster: " +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                '.';
    }
}
