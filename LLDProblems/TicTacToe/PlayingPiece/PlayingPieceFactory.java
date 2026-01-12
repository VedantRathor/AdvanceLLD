package TicTacToe.PlayingPiece;

public class PlayingPieceFactory {
    public PlayingPiece createPlayingPiece(Piece type) {
        if (type == Piece.X) { return new PieceX(type); }
        else return new PieceY(type);
    }
}
