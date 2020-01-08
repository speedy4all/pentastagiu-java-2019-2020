package AppGame;

public class Position {
    int xPosition=0;
    int yPosition=0;

    public Position(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return "position: " +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '.';
    }
}
