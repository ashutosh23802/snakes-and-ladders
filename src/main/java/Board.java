public class Board {

    private int size;
    private Player player;
    private Dice dice;

    public Board(int size, Player player,Dice dice) {
        this.size = size;
        this.player = player;
        this.dice = dice;
    }

    public Player getPlayer() {
        return player;
    }

    public Dice getDice() {
        return dice;
    }

    public void movePlayer() {
        player.setPosition(player.getPosition() + dice.throwDice());
    }
}
