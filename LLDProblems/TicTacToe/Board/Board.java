package TicTacToe.Board;

import TicTacToe.Cell.Cell;
import TicTacToe.Move.Move;
import TicTacToe.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer size;
    private List<List<Cell>> board;

    public Board(Integer size) {
        this.size = size;
        this.board = new ArrayList<>();
        initializeBoard();
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public Integer getSize() {
        return size;
    }

    public void display() {
        for (int row = 0; row < size; row ++) {
            for (int col = 0; col < size; col++) {
                System.out.print(board.get(row).get(col).getSymbol());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean putPlayer(Player player, Move move) {
        if (move.getX() >= 0 && move.getX() <= size-1 && move.getY() >= 0 && move.getY() <= size-1) {
            if (board.get(move.getX()).get(move.getY()).isEmpty()) {
                board.get(move.getX()).get(move.getY()).setPlayer(player);
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
    }
}
