import java.util.Map;

public class Board {

    private int size;
    private Player player;
    private Dice dice;
    private Map<Integer,Integer> snakes;

    public Board(int size, Player player,Dice dice,Map<Integer,Integer> snakes) {
        this.size = size;
        this.player = player;
        this.dice = dice;
        this.snakes = snakes;
    }

    public Player getPlayer() {
        return player;
    }

    public Dice getDice() {
        return dice;
    }

    public void movePlayer() {
        int finalPositionToSet = player.getPosition() + dice.throwDice() > size ? player.getPosition() : player.getPosition() + dice.throwDice();
        if(snakes.containsKey(finalPositionToSet)){
            finalPositionToSet = snakes.get(finalPositionToSet);
        }
        player.setPosition(finalPositionToSet);
    }
}
