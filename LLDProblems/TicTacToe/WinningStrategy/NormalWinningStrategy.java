package TicTacToe.WinningStrategy;

import TicTacToe.Board.Board;
import TicTacToe.Cell.Cell;
import TicTacToe.Player.Player;

import java.util.List;

public class NormalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Player player) {
        boolean isWinner = true;

        List<List<Cell>> grid = board.getBoard();
        int size = board.getSize();

        // check row-wise
        for (int row = 0; row < size; row++) {
            isWinner = true;
            for (int col = 0; col < size; col ++) {
                if (grid.get(row).get(col).getPlayer() == null) { isWinner = false; break; }
                if (grid.get(row).get(col).getPlayer() != player) { isWinner = false; break; }
            }

            if (isWinner) return true;
        }

        // check col-wise
        for (int col = 0; col < size; col++) {
            isWinner = true;
            for (int row = 0; row < size; row ++) {
                if (grid.get(row).get(col).getPlayer() == null) { isWinner = false; break; }
                if (grid.get(row).get(col).getPlayer() != player) { isWinner = false; break; }
            }

            if (isWinner) return true;
        }

        // check diagonal
        int row = 0, col = 0;
        isWinner = true;

        while (row < size && col < size) {
            if (grid.get(row).get(col).getPlayer() == null) { isWinner = false; break; }
            if (grid.get(row).get(col).getPlayer() != player) { isWinner = false; break; }

            row ++;
            col ++;
        }

        if (isWinner) return true;

        // check diagonal
        row = 0;
        col = size-1;
        isWinner = true;

        while (row < size && col >= 0) {
            if (grid.get(row).get(col).getPlayer() == null) { isWinner = false; break; }
            if (grid.get(row).get(col).getPlayer() != player) { isWinner = false; break; }

            row ++;
            col --;
        }

        if (isWinner) return true;
        return false;
    }

    @Override
    public boolean isDraw(Board board) {
        List<List<Cell>> grid = board.getBoard();
        int size = board.getSize();

        for (int row = 0; row < size; row ++) {
            for (int col = 0; col < size; col++) {
                if (grid.get(row).get(col).isEmpty()) {
                    return false;
                }
            }
        }

        return true;
    }
}
