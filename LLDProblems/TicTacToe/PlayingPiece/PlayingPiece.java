package TicTacToe.PlayingPiece;

public abstract class PlayingPiece {
    private final Piece piece;
    public PlayingPiece(Piece piece) {
        this.piece = piece;
    }
    public abstract Character getSymbolOfPlayingPiece();
}
