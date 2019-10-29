package compsci4039.week4.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import compsci4039.week2.people.Gender;

/*
 * Programming IT, Laboratory Exercises
 * 1 Exceptions
 * Parts 1 - 3
 * https://docs.google.com/document/d/1T1NmSZc0zJyHkJObpQz9PzRXvIv8aqZHQ659ZwhiFLc
 */
public class Lab8Ex1 {

    public static void main(String[] args) {
        executeInstructionOne();
        executeSecondInstruction();
        executeThirdInstruction();
    }

    // Part 1
    public static void executeInstructionOne() {
        try {
            int integer = requestIntegerInput();
            System.out.printf("You have provided the following integer: %d\n", integer);
        } catch (InputMismatchException error) {
            System.out.printf("It looks like an integer have not been provided.\nERROR: %s\n", error.getMessage());
        }
    }

    public static Integer requestIntegerInput() throws InputMismatchException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an Integer");

        String input = keyboard.nextLine();
        Scanner inputProcessor = new Scanner(input);

        return inputProcessor.nextInt();
    }

    // Part 2
    public static void executeSecondInstruction() {
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                int integer = requestIntegerInput();
                System.out.printf("You have provided the following integer: %d\n", integer);
                isValidInput = true;
            } catch (InputMismatchException error) {
                System.out.printf("It looks like an integer have not been provided.\nERROR: %s\n", error.getMessage());
            }
        }
    }

    // Part 3
    public static void executeThirdInstruction() {
        Lab8Person personTwo = new Lab8Person("Mary", 32, Gender.FEMALE);
        Lab8SavingsAccount savingsAccountTwo = new Lab8SavingsAccount(personTwo, 12);

        savingsAccountTwo.setBalance(0);

        try {
            savingsAccountTwo.withdrawFunds(100);
        } catch (OverdrawnException e) {
            System.out.printf("%s, try the lottery!", e.getMessage());
        }
    }

}
