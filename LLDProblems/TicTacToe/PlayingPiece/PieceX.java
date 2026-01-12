package TicTacToe.PlayingPiece;

public class PieceX extends PlayingPiece {
    public PieceX(Piece piece) {
        super(piece);
    }
    @Override
    public Character getSymbolOfPlayingPiece() {
        return 'X';
    }
}
