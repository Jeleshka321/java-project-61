package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rounds = 3;
        int score = 0;

        for (int i = 0; i < rounds; i++) {
            int number = random.nextInt(100) + 1;

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            boolean isPrime = isPrime(number);
            if ((userAnswer.equals("yes") && isPrime) || (userAnswer.equals("no") && !isPrime)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + isPrime + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (score == 3) {
        System.out.println("Congratulations, " + playerName + "!");
        }
        scanner.close();
    }

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
}

