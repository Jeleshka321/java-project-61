package hexlet.code;

import java.util.Scanner;

public class Pli {
    public static void getName(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
