import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class BoardTest {

    Board board;
    Player playerMock;
    Dice diceMock;

    @BeforeEach
    public void setup(){
        playerMock = Mockito.spy(Player.class);
        diceMock = Mockito.spy(Dice.class);
        board = new Board(100,playerMock,diceMock);
    }

    @Test
    public void playerShouldMoveToPositionBasedOnDiceThrow(){
        Mockito.when(diceMock.throwDice()).thenReturn(4);
        board.movePlayer();
        assertEquals(4,board.getPlayer().getPosition());
    }

}