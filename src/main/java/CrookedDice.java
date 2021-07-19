public class CrookedDice implements  Dice{

    public int throwDice() {
        int randomNumber = (int) (Math.random() * 6) + 1;
        while (randomNumber % 2 != 0) {
            randomNumber = (int) (Math.random() * 6) + 1;
        }
        return  randomNumber;
    }
}
