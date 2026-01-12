package TicTacToe.Notification;

import TicTacToe.Player.Player;

public class InGameObserver implements Observer {
    private final Player player;
    public InGameObserver(Player player) {
        this.player = player;
    }

    @Override
    public void notify(String message) {
        System.out.println("\n\n Notifying " + this.player.getName() + ": " + message);
    }

    public Player getPlayer() {
        return player;
    }
}
