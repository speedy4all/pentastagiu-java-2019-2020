package homework.week4.game.domain;

public class Movement {
    private Spot start;
    private Spot end;
    private Piece pieceMoved;

    public Movement(Spot start, Spot end)
    {
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }
}
