package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Cli;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner = new Scanner(System.in);
            final int three = 3;
            final int fourth = 4;
            final int five = 5;
            final int six = 6;

            System.out.print("Please enter the game number and press Enter ");
            System.out.print("6 - Prime ");
            System.out.print("5 - Progression ");
            System.out.print("4 - GCD ");
            System.out.print("3 - Calculator ");
            System.out.print("2 - Even ");
            System.out.print("1 - Greet ");
            System.out.print("0 - Exit ");
            int gameNumber = scanner.nextInt();
            System.out.println("Your choice: " + gameNumber);


            switch (gameNumber) {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                case 1:
                    Cli.getName(args);
                    break;
                case 2:
                    Even.evenGame();
                    break;
                case three:
                    Calc.calcGame();
                    break;
                case fourth:
                    GCD.gcdGame();
                    break;
                case five:
                    Progression.progressionGame();
                    break;
                case six:
                    Prime.primeGame();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid game number.");

                    scanner.close();
            }
        }
    }
