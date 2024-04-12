package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utilis;

public class Prime {

    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 20;
    private static final String GAME_TEXT = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void primeGame() {

        String[][] gameData = new String[Engine.ROUND_COUNT][Engine.GAME_DATA_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {

            int randomNumber = Utilis.generateNumber(MINIMUM, MAXIMUM);
            String expression = Integer.toString(randomNumber);
            gameData[i][0] = expression;
            gameData[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }

        Engine.startTheGame(GAME_TEXT, gameData);
    }
}
