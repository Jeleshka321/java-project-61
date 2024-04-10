package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utilis;

public class Calc {

    private static final int MINIMUM = 1;

    private static final int MAXIMUM = 30;

    private static final String GAME_TEXT = "What is the result of the expression?";

    private static char generateOperation() {

        char[] symbols = {'+', '-', '*'};
        int randomIndex = Utilis.generateNumber(0, symbols.length - 1);
        return symbols[randomIndex];
    }

    private static int calculate(char randomOperation, int randomnumber1, int randomnumber2) {

        int resultOperation = 0;

        switch (randomOperation) {
            case '+':
                resultOperation = randomnumber1 + randomnumber2;
                break;
            case '-':
                resultOperation = randomnumber1 - randomnumber2;
                break;
            case '*':
                resultOperation = randomnumber1 * randomnumber2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + randomOperation);
        }

        return resultOperation;
    }

    public static void calcGame() {

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (int i = 0; i < countOfRounds; i++) {

            int randomNumber1 = Utilis.generateNumber(MINIMUM, MAXIMUM);
            int randomNumber2 = Utilis.generateNumber(MINIMUM, MAXIMUM);
            char randomOperation = generateOperation();
            gameData[i][0] = randomNumber1 + " " + randomOperation + " " + randomNumber2;
            gameData[i][1] = Integer.toString(calculate(randomOperation, randomNumber1, randomNumber2));
        }

        Engine.startTheGame(GAME_TEXT, gameData);
    }
}