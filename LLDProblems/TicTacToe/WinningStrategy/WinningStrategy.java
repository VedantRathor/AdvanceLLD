package TicTacToe.WinningStrategy;

import TicTacToe.Board.Board;
import TicTacToe.Player.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);
    boolean isDraw(Board board);
}
