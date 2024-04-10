package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class Prime {

    private static final int minimum = 1;

    private static final int maximum = 20;

    private static final String gameText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (var i = 0; i < countOfRounds; i++) {

            int randomNumber = Utilis.generateNumber(minimum, maximum);
            String expression = Integer.toString(randomNumber);
            gameData[i][0] = expression;
            gameData[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }

        Engine.startTheGame(gameText, gameData);
    }
}