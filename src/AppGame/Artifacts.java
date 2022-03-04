package AppGame;

public class Artifacts {
    int nrOfPoints;
    public Position position;
    private String type;
    public Artifacts(int nrOfPoints) {
        position= new Position( 0,0);
        this.nrOfPoints = nrOfPoints;
    }

    public Artifacts(int nrOfPoints, Position position, String type) {
        this.nrOfPoints = nrOfPoints;
        this.position = position;
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNrOfPoints() {
        return nrOfPoints;
    }

    public void setNrOfPoints(int nrOfPoints) {
        this.nrOfPoints = nrOfPoints;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public void moveArtifact(int x, int y){
        position.xPosition= x;
        position.yPosition= y;
    }

    @Override
    public String toString() {
        return "Artifacts{" +
                "nrOfPoints=" + nrOfPoints +
                ", position=" + position +
                ", type='" + type + '\'' +
                '}';
    }
}
