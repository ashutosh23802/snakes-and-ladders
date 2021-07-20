import java.util.Map;

public class Board {

    private int size;
    private Player player;
    private Dice dice;
    private Map<Integer,Integer> snakes;

    public Board(int size, Player player, Dice dice, Map<Integer,Integer> snakes) {
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
        System.out.println("++++++++++++++++++");
        System.out.println("Player position was:"+ player.getPosition());
        int generatedNumber = dice.throwDice();
        System.out.println("Dice generated:"+generatedNumber);
        int finalPositionToSet = player.getPosition() + generatedNumber > size ? player.getPosition() : player.getPosition() + generatedNumber;
        if(snakes.containsKey(finalPositionToSet)){
            System.out.println("=====SNAKE BITE=====");
            finalPositionToSet = snakes.get(finalPositionToSet);
        }
        player.setPosition(finalPositionToSet);
        System.out.println("Player position set to:"+ player.getPosition());
        System.out.println("++++++++++++++++++");
    }
}
