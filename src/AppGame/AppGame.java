package AppGame;

public class AppGame {
    public static void main(String[] args) {
        Position positionEnergy = new Position(10,10);
        Artifacts energyArtifact = new Artifacts(50, positionEnergy, "Energy");

        Position positionHealth = new Position(9,9);
        Artifacts healthArtifact = new Artifacts(50,positionHealth, "Health");

        System.out.println("The curent position for " + energyArtifact.getType() + " is " +  energyArtifact.getPosition());
        energyArtifact.moveArtifact(5,5);
        System.out.println( energyArtifact.getType() + " moved at " + energyArtifact.getPosition());
        System.out.println("The curent position for " + healthArtifact.getType() + " is " +  healthArtifact.getPosition());


        Position positionHuman = new Position(9,9);
        Character human = new Human("Tau",50,20,positionHuman);

        Position positionMoster = new Position(8,8);
        Character monster = new Monster("Monster ", 50,20, positionMoster);

        Position positionAnimal = new Position( 7,7);
        Character animal = new Animal("Big Dog" , 50,20, positionAnimal);


        human.positionOnMap();
        System.out.println("Curent energy points for Human:"  + human.getEnergyPoints());
        human.getArtifact(energyArtifact);
        System.out.println("Energy points for Human, after getting the energyArfitact: " + human.getEnergyPoints() + "");
        System.out.println("Curent energyArtifact points after token " + energyArtifact.getNrOfPoints() + " \n");

        monster.positionOnMap();
        human.move(10,10);
        System.out.println("Monster : curent energy points: " + monster.getEnergyPoints() + " and health points: " + monster.getHealthPoints());
        System.out.println("Human : curent energy points: " + human.getEnergyPoints() + " and health points: " + human.getHealthPoints());
        human.attack(monster);
        System.out.println("Monster after attack has energy point: "+ monster.getEnergyPoints() + " and health points: " + monster.getHealthPoints());
        System.out.println("Human after he attacked has " + human.getEnergyPoints() + " points and health points: " + human.getHealthPoints());

        animal.positionOnMap();
        energyArtifact.moveArtifact(7,7);
        System.out.println("Curent position for " + energyArtifact.getType() + " is " + positionEnergy);
        System.out.println("Curent points for Animal: " + animal.getEnergyPoints());
        animal.getArtifact(energyArtifact);
        System.out.println("Curent points for " + energyArtifact.getType() + " is: "+ energyArtifact.getNrOfPoints());

        System.out.println("Animal : curent energy points: " + animal.getEnergyPoints() + " and health points: " + animal.getHealthPoints());
        healthArtifact.moveArtifact(7,7);
        animal.getArtifact(healthArtifact);

        System.out.println("Animal: after taking Artifact: energy points: " + animal.getEnergyPoints() + " and health points: " + animal.getHealthPoints());
        System.out.println("Monster : curent energy points: " + monster.getEnergyPoints() + " and health points: " + monster.getHealthPoints());
        monster.attack(animal);
        System.out.println("Monster after he attacked has energy point: "+ monster.getEnergyPoints() + " and health points: " + monster.getHealthPoints());
        System.out.println("Animal after attack has energy point: "+ animal.getEnergyPoints() + " and health points: " + animal.getHealthPoints());

        human.attack(monster);
        human.attack(monster);
        human.attack(monster);
        System.out.println(monster.getName() + " has " +  monster.getHealthPoints() + " health points left.");
        human.attack(monster); // monster is dead.

    }
}
