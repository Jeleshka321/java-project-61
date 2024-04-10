package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class GCD {

    private static final int minimum1 = 1;

    private static final int maximum1 = 40;

    private static final String gameText1 = "Find the greatest common divisor of given numbers.";

    public static int calculateGCD(int a, int b) {

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

        int gcd = calculateGCD(randomNumber1, randomNumber2);
        return gcd;
    }

    public static void gcdGame() {

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (var i = 0; i < countOfRounds; i++) {

            int randomNumber1 = Utilis.generateNumber(minimum1, maximum1);
            int randomNumber2 = Utilis.generateNumber(minimum1, maximum1);
            String mathematicalExpression = randomNumber1 + " " + randomNumber2;
            gameData[i][0] = mathematicalExpression;
            gameData[i][1] = String.valueOf(findGCD(randomNumber1, randomNumber2));
        }

        Engine.startTheGame(gameText1, gameData);
    }
}