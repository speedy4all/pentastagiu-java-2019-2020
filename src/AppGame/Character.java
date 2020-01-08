package AppGame;

public class Character {
    protected String name;
    protected int  healthPoints ;
    protected int energyPoints ;
    private Position position;
    private Artifacts artifacts;

    public Character(String name, int healthPoints, int energyPoints, Position position) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Artifacts getArtifacts() {
        return artifacts;
    }

    public void getArtifact(Artifacts artifacts) {
        this.artifacts = artifacts;
        if (artifacts.getType().equals("Energy")) {
            energyPoints = energyPoints + artifacts.nrOfPoints;
            artifacts.nrOfPoints=0;
        } else if (artifacts.getType().equals("Health")){
            healthPoints = healthPoints + artifacts.nrOfPoints;
            artifacts.nrOfPoints=0;
        }
    }

    public void positionOnMap(){
        System.out.println(Character.this.name  +" position is x: " + position.getxPosition() + " and y: " + position.getyPosition());
    }
    public void move(int x, int y){
        position.xPosition=x;
        position.yPosition=y;
    }
    public void attack(Character character ) {
        this.energyPoints -= 5;
        character.healthPoints -= 10;
        if (character.healthPoints == 0) {
            System.out.println("You are already dead!");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                ", position=" + position +
                '}';
    }
}
