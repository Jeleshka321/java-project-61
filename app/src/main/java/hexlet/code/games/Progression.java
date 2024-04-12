package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utilis;

public class Progression {
    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 20;
    private static final int MINIMUM_LENGTH = 5;
    private static final int MAXIMUM_STEP = 15;
    private static final int MAXIMUM_LENGTH = 10;
    private static final String GAME_TEXT = "What number is missing in the progression?";


    public static String[] generateProgression(int beginNumber, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(beginNumber + i * step);
        }
        return progression;
    }


    public static void progressionGame() {
        String[][] gameData = new String[Engine.ROUND_COUNT][Engine.GAME_DATA_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int beginNumber = Utilis.generateNumber(MINIMUM, MAXIMUM);
            int step = Utilis.generateNumber(MINIMUM, MAXIMUM_STEP);
            int lengthOfProgression = Utilis.generateNumber(MINIMUM_LENGTH, MAXIMUM_LENGTH);
            int hiddenNumber = Utilis.generateNumber(0, lengthOfProgression - 1);

            String[] progression = generateProgression(beginNumber, step, lengthOfProgression);
            String answer = progression[hiddenNumber];

            progression[hiddenNumber] = "..";
            String question = String.join(" ", progression);

            gameData[i][0] = question;
            gameData[i][1] = answer;
        }

        Engine.startTheGame(GAME_TEXT, gameData);
    }
}
