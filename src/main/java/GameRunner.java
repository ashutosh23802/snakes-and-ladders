import java.util.Map;

public class GameRunner {

    public static void main(String[] args) {
        runGame(false,10);
    }

    public static void runGame(boolean withCrookedDice, int numberOfRoundsToRun){
        Dice dice =  withCrookedDice ? new CrookedDice() : new RegularDice();
        Player player = new Player();
        Map<Integer,Integer> snakes = Map.of(14,7);

        Board board = new Board(100,player,dice,snakes);

        for(int i = 0 ; i < numberOfRoundsToRun ; i++){
            board.movePlayer();
        }
    }
}
