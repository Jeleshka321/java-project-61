package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUND_COUNT = 3;

    private static final int GAME_DATA_COUNT = 2;


    public static int getCountOfRounds() {
        return ROUND_COUNT;
    }


    public static int getCountOfGameData() {
        return GAME_DATA_COUNT;
    }


    public static void startTheGame(String conditions, String[][] gameData) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println();
        System.out.println("Hello, " + userName + "!");
        System.out.println(conditions);

        for (var data : gameData) {

            String question = "Question: " + data[0];
            String userAnswer = getUserAnswer(scanner, question);

            if (userAnswer.equals(data[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + data[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    private static String getUserAnswer(Scanner scanner, String question) {

        System.out.println(question);
        System.out.print("Your answer: ");
        return scanner.next();
    }

}
