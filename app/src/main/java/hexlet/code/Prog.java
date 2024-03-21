package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Prog {
    public static void progGame(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println("What number is missing in the progression?");

        int rounds = 3;
        int score = 0;

        for (int i = 0; i < rounds; i++) {
            int progressionLength = random.nextInt(6) + 5;
            int start = random.nextInt(50) + 1;
            int diff = random.nextInt(5) + 1;

            int hiddenIndex = random.nextInt(progressionLength);
            int hiddenValue = start + hiddenIndex * diff;

            System.out.print("Question:");
            for (int j = 0; j < progressionLength; j++) {
                if (j == hiddenIndex) {
                    System.out.print(" ..");
                } else {
                    System.out.print(" " + (start + j * diff));
                }
            }
            System.out.println();

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == hiddenValue) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + hiddenValue + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (score == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
        scanner.close();
    }
}
