package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the Brain Games!");
    System.out.print("May I have your name? ");
    String name = scanner.next();
    System.out.println("Hello, " + name + "!");

    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    Random random = new Random();
    int correctAnswers = 0;
    while (correctAnswers < 3) {
        int number = random.nextInt(100);
        System.out.println("Question: " + number);

        String answer = scanner.next().toLowerCase();
        System.out.println("Your answer: " + answer);
        if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println( answer + " is wrong answer, Correct answer was" +(number % 2 == 0 ? "yes" : "no"));
            break;
            }
        }

    if (correctAnswers ==3) {
    System.out.println("Congratulations! " + name);
    } else {
        System.out.println("Let's try again " + name);
    }

    }
}
