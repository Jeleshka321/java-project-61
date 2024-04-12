package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUND_COUNT = 3;
    public static final int GAME_DATA_COUNT = 2;

    public static void startTheGame(String conditions, String[][] gameData) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println();
        System.out.println("Hello, " + userName + "!");
        System.out.println(conditions);

        for (var data : gameData) {

            String question = "Question: " + data[0];
            System.out.println(question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

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
}
