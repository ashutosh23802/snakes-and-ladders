public class RegularDice implements  Dice{

    public int throwDice() {
        return (int)(Math.random()*6 )+1 ;
    }
}
