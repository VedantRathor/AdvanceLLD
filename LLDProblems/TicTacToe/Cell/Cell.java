package TicTacToe.Cell;

import TicTacToe.Player.Player;

public class Cell {
    private Integer x;
    private Integer y;
    private Player player;

    public Cell(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isEmpty() {
        return this.player == null;
    }

    public Character getSymbol() {
        if (this.player != null) {
            return this.player.getPlayingPiece().getSymbolOfPlayingPiece();
        }
        return '_';
    }
}
