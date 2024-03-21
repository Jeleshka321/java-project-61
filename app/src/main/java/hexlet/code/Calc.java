package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calcGame(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] operators = {"+", "-", "*"};
    int correctAnswers = 0;
    int maxNumber = 100;
    final int questions = 3;
    System.out.print("May I have your name? ");
    String name = scanner.next();
    System.out.println("Hello, " + name + "!");

    System.out.println("What is the result of the expression?");
    for (int i = 0; i < questions; i++) {
        int num1 = random.nextInt(maxNumber);
        int num2 = random.nextInt(maxNumber);
        String operator = operators[random.nextInt(operators.length)];

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Question: " + num1 + " " + operator + " " + num2);
        System.out.print("Your answer: ");
        int userAnswer = scanner.nextInt();

        if (userAnswer == result) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + name + "!");
            break;
        }
    }
        if (correctAnswers == questions) {
            System.out.println("Congratulations, " + name + "!");
        }
}
}
