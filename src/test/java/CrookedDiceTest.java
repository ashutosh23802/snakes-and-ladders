import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrookedDiceTest {

    static CrookedDice crookedDice;

    @BeforeAll
    static void init(){
        crookedDice = new CrookedDice();
    }

    @Test
    public void shouldReturnRandomNumberBetween1And6(){
        int[] generatedNumbers = new int[5];
        for(int i=0;i< 5 ;i++){
            generatedNumbers[i] = crookedDice.throwDice();
        }
        for (int generatedNumber : generatedNumbers){
            Assertions.assertTrue(generatedNumber < 7 && generatedNumber > 0);
            assertEquals(generatedNumber % 2, 0);
        }

    }

}