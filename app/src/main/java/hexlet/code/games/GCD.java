package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utilis;

public class GCD {

    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 20;
    private static final String GAME_TEXT = "Find the greatest common divisor of given numbers.";

    public static int gcd(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    public static int findGCD(int randomNumber1, int randomNumber2) {
        return gcd(randomNumber1, randomNumber2);
    }

    public static void gcdGame() {

        String[][] gameData = new String[Engine.ROUND_COUNT][Engine.GAME_DATA_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {

            int randomNumber1 = Utilis.generateNumber(MINIMUM, MAXIMUM);
            int randomNumber2 = Utilis.generateNumber(MINIMUM, MAXIMUM);
            String mathematicalExpression = randomNumber1 + " " + randomNumber2;
            gameData[i][0] = mathematicalExpression;
            gameData[i][1] = String.valueOf(findGCD(randomNumber1, randomNumber2));
        }

        Engine.startTheGame(GAME_TEXT, gameData);
    }
}
