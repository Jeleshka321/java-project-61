package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcdGame(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int score = 0;
    int rounds = 3;
    String playerName;

    System.out.println("Enter your name:");
    playerName = scanner.nextLine();
    System.out.println("Hello, " + playerName);

    System.out.println("Find the greatest common divisor of given numbers.");

    for (int i = 0; i < rounds; i++) {
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;
        int correctAnswer = gcd(num1, num2);

        System.out.println("Question: " + num1 + " " + num2);
        System.out.print("Your answer: ");
        int userAnswer = scanner.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            break;
        }
    }
    if (score == 3) {
        System.out.println("Congratulations, " + playerName + "!");
    }
    scanner.close();
}

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
