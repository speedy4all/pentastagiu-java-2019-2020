package homework.week4.game.domain;

public class Spot {
    private Piece piece;
    private int x;
    private int y;

    public Spot(int x, int y, Piece piece)
    {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }

    public void setPiece(Piece p)
    {
        this.piece = p;
    }

    public int getX()
    {
        return this.x;
    }

    public int setX(int x)
    {
        this.x = x;
        return x;
    }

    public int getY()
    {
        return this.y;
    }

    public int setY(int y)
    {
        this.y = y;
        return y;
    }
}
