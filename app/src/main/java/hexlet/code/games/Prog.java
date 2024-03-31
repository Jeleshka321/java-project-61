package hexlet.code.games;
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

        final int rounds = 3;
        int score = 0;
        final int corScore = 3;


        for (int i = 0; i < rounds; i++) {
            final int progressionLength = random.nextInt(6) + 5;
            final int start = random.nextInt(50) + 1;
            final int diff = random.nextInt(5) + 1;

            int hiddenIndex = random.nextInt(progressionLength);
            int value = start + hiddenIndex * diff;

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

            if (userAnswer == value) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + value + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (score == corScore) {
            System.out.println("Congratulations, " + playerName + "!");
        }
        scanner.close();
    }
}
