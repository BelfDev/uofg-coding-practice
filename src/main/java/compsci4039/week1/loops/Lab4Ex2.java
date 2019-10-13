package compsci4039.week1.loops;

import java.util.Random;
import java.util.Scanner;

/*
 * Programming IT, Laboratory Exercises
 * 6 Loops
 * Parts 3 - 9
 * https://docs.google.com/document/d/1vnyQKYFAc0_70oGF3a0RgEl1BHRUGm9VwNuHV4iPnA8
 */

public class Lab4Ex2 {

    public static void main(String[] args) {
        calculatePrimeNumbersUntil(61);
        calculateOtherPrimeNumbersUntil(61);
        executeGuessingGame();
        produceTriangle(8);
        calculateFit(4.2, 1.6);
        padStringValue("Simon", '@', 10);
        playPaperScissorsAndStone();
    }



    // Part 3
    public static void calculatePrimeNumbersUntil(int number) {
        int i = 2;
        while (i <= number) {
            if (isPrime(i)) {
                System.out.printf("%s \n", i);
            }
            i++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Part 4
    private static void calculateOtherPrimeNumbersUntil(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.printf("%s \n", i);
            }
        }
    }


    // Part 5
    private static void executeGuessingGame() {
        Scanner keyboard = new Scanner(System.in);
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100);
        int numberOfAttempts = 10;
        int currentAttemptIndex = 0;

        System.out.println("Hello! Welcome to my awesome guessing game.\nGuess which number I've picked. You can choose between from 0 - 99");

        while (currentAttemptIndex < numberOfAttempts) {
            int input = keyboard.nextInt();

            if (input == randomNumber) {
                System.out.printf("\nWow, you are pretty good. You've guessed the number right: %s", input);
                break;
            }
            System.out.println("\nWrong guess... try it again!");
            currentAttemptIndex++;
        }

        System.out.println("\nGame Over");
    }

    // Part 6
    public static void produceTriangle(int numberOfRows) {
        for (int i = 0; i <= numberOfRows; i++) {
            int numberOfMarginSpaces = numberOfRows - i;
            String margin = "";
            int k = 0;
            while (k < numberOfMarginSpaces) {
                margin += " ";
                k++;
            }
            System.out.print(margin);
            for (int j = 0; j < i; j ++) {
                System.out.printf("%s ", i);
            }
            System.out.println();
        }
    }

    // Part 7
    private static void calculateFit(double a, double b) {
        int result = (int) (a / b);
        double remainder = a % b;
        System.out.printf("Result: %s, Remainder: %s", result, remainder);
    }

    // Part 8
    public static void padStringValue(String value, char paddingCharacter, int totalLength) {
        int numberOfPaddings = totalLength - value.length();
        String padding = "";
        int counter = 1;
        do {
            padding += paddingCharacter;
        } while (numberOfPaddings > counter++ );

        String result = padding + value;
        System.out.printf("New value: %s", result);
    }

    // Part 9
    private static void playPaperScissorsAndStone() {
        Scanner keyboard = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Hello! Welcome to the Paper, Scissors, and Stone game.");

        for (int i = 0; i < 3; i++) {
            int computerChoice = randomGenerator.nextInt(2) + 1;
            System.out.println("Ready? I've made my move. Choose yours!");
            System.out.println("1 - Paper | 2 - Scissors | 3 - Stone");
            int userChoice = keyboard.nextInt();
            keyboard.nextLine();

            if (computerChoice == userChoice) {
                System.out.println("\nDraw! Going to next round...");
                continue;
            } else if (computerChoice == 3 && userChoice != 1) {
                System.out.println("\nAha! I've won!");
                break;
            } else if (computerChoice == 2 && userChoice != 3) {
                System.out.println("\nAha! I've won!");
                break;
            } else {
                System.out.println("\nSeems like you've won this one... Congrats!");
                break;
            }
        }

        System.out.println("GAME OVER");
    }

}
