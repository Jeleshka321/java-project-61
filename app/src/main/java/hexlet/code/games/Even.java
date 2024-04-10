package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utilis;

public class Even {


        private static final int MINIMUM = 1;

        private static final int MAXIMUM = 100;

        private static final String GAME_TEXT = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        public static void evenGame() {

            int countOfRounds = Engine.getCountOfRounds();
            int countOfGameData = Engine.getCountOfGameData();
            String[][] gameData = new String[countOfRounds][countOfGameData];

            for (int i = 0; i < countOfRounds; i++) {

                int randomNumber = Utilis.generateNumber(MINIMUM, MAXIMUM);
                String expression = Integer.toString(randomNumber);
                gameData[i][0] = expression;
                gameData[i][1] = isEven(randomNumber) ? "yes" : "no";
            }

            Engine.startTheGame(GAME_TEXT, gameData);
        }

        private static boolean isEven(int number) {
            return number % 2 == 0;
        }
    }
