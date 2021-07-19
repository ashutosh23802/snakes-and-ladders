import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DiceTest {

    static Dice dice;

    @BeforeAll
    static void init(){
        dice = new Dice();
    }

    @Test
    public void shouldReturnRandomNumberBetween1And6(){
        int[] generatedNumbers = new int[5];
        for(int i=0;i< 5 ;i++){
            generatedNumbers[i] = dice.throwDice();
        }
        for (int generatedNumber : generatedNumbers){
            Assertions.assertTrue(generatedNumber < 7 && generatedNumber > 0);
        }

    }
}
