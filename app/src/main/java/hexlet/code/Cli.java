package hexlet.code;
import java.util.Scanner;

public class Cli {
        public static void startGame(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter ");
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
                        Pli.getName(args);
                        break;
                case 2:
                        Even.evenGame(args);
                        break;
                case 3 :
                        Calc.calcGame(args);
                        break;
                default:
                        System.out.println("Invalid choice. Please enter a valid game number.");

        scanner.close();
    }
}
}
