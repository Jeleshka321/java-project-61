package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class Progression {
    private static final int MINIMUM = 1;

    private static final int MAXIMUM = 20;

    private static final int MINIMUM_LENGTH = 5;

    private static final int MAXIMUM_STEP = 15;

    private static final int MAXIMUM_HIDDEN_NUMBER = 9;

    private static final int MAXIMUM_LENGTH = 10;

    private static final String GAME_TEXT = "What number is missing in the progression?";



    public static int[] generateProgression(int beginNumber, int step, int length) {

        int[] progression = new int[length];
        progression[0] = beginNumber;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + step;
        }

        return progression;
    }

    public static String[] generateProgressionWithHiddenElement(int[] progression, int randomNumberOfIndex) {

        String[] stringArray = new String[progression.length];

        for (int j = 0; j < stringArray.length; j++) {
            if (j == randomNumberOfIndex) {
                stringArray[j] = "..";
            } else {
                stringArray[j] = String.valueOf(progression[j]);
            }
        }

        return stringArray;
    }

    public static void progressionGame() {

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (int i = 0; i < countOfRounds; i++) {

            int beginNumber = Utilis.generateNumber(MINIMUM, MAXIMUM);
            int step = Utilis.generateNumber(MINIMUM, MAXIMUM_STEP);
            int lengthOfProgression = Utilis.generateNumber(MINIMUM_LENGTH, MAXIMUM_LENGTH);
            int randomNumberOfIndex = Utilis.generateNumber(
                    MINIMUM,
                    Math.min(MAXIMUM_HIDDEN_NUMBER, lengthOfProgression - 1)
            );

            int[] progression = generateProgression(beginNumber, step, lengthOfProgression);
            String[] array = generateProgressionWithHiddenElement(progression, randomNumberOfIndex);
            int changedElement = progression[randomNumberOfIndex];
            String stringChangedElement = Integer.toString(changedElement);

            gameData[i][0] = String.join(" ", array);
            gameData[i][1] = stringChangedElement;
        }

        Engine.startTheGame(GAME_TEXT, gameData);
    }
}