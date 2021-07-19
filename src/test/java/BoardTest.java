import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class BoardTest {

    Board board;
    Player playerSpy;
    Dice diceSpy;

    @BeforeEach
    public void setup(){
        playerSpy = Mockito.spy(Player.class);
        diceSpy = Mockito.spy(Dice.class);
        board = new Board(100, playerSpy, diceSpy,Map.of(14,7));
    }

    @Test
    public void playerShouldMoveToPositionBasedOnDiceThrow(){
        Mockito.when(diceSpy.throwDice()).thenReturn(4);
        board.movePlayer();
        assertEquals(4,board.getPlayer().getPosition());
    }

    @Test
    public void shouldNotSetPLayerPositionBeyond100(){
        Mockito.when(diceSpy.throwDice()).thenReturn(4);
        playerSpy.setPosition(99);
        board.movePlayer();
        assertEquals(99,board.getPlayer().getPosition());
    }

    @Test
    public void shouldSetPlayerPositionTo7DueToSnakeBiteOnPosition14(){
        Mockito.when(diceSpy.throwDice()).thenReturn(4);
        playerSpy.setPosition(10);
        board.movePlayer();
        assertEquals(7,board.getPlayer().getPosition());
    }

}