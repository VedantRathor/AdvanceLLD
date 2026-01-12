package TicTacToe.Game;

import TicTacToe.Board.Board;
import TicTacToe.Move.Move;
import TicTacToe.Notification.InGameObserver;
import TicTacToe.Notification.Observer;
import TicTacToe.Player.Player;
import TicTacToe.WinningStrategy.WinningStrategy;

import java.util.*;

public class Game {
    private Board board;
    private Deque<Player> players;
    private WinningStrategy winningStrategy;
    private List<Observer> observerList;

    public Game(Integer size, WinningStrategy strategy) {
        board = new Board(size);
        this.winningStrategy = strategy;
        this.players = new ArrayDeque<>();
        this.observerList = new ArrayList<>();
    }

    public void setPlayer(Player player) {
        this.players.add(player);
    }

    public void subscribeToNotification(Observer observer) {
        observerList.add(observer);
    }

    public void unsubscribeToNotification(Observer observer) {
        observerList.remove(observer);
    }

    public void play() {
        if (this.players.size() <= 1) { return; }
        while (true) {
            this.board.display();
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n ==== " + players.peek().getName() + " turns ======");

            System.out.println("Enter X");
            Integer x = scanner.nextInt();
            System.out.println("Enter Y");
            Integer y = scanner.nextInt();

            Player player = players.peek();
            if (this.board.putPlayer(player, new Move(x, y))) {
                String message = player.getName() + " played " + x + ", " + y;
                notifyUsers(message);

                if (winningStrategy.checkWinner(this.board, player)) {
                    message = player.getName() + " is the winner!";
                    notifyUsers(message);
                    return;
                }

                if (winningStrategy.isDraw(this.board)) {
                    message = "Match Draw!";
                    notifyUsers(message);
                    return;
                }

                players.poll();
                players.offerLast(player);
            } else {
                System.out.println("Invalid move! Try again");
            }

        }
    }

    private void notifyUsers(String message) {
        for (Observer observer: observerList) {
            observer.notify(message);
        }
    }
}
