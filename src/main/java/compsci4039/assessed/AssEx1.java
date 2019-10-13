package compsci4039.assessed;

import java.util.Scanner;

/*
    Instructions - Assessed Exercise 1
    - This exercise tests the things you've learnt in week 1.
    - Add your code to this file, leaving the main method unchanged (except for task 3).
    - Add all of your methods *below* the main method, in question order.
    - Each of the tasks involves writing a single method.
    - Total number of marks is 22.
    - Read the instructions for each task *carefully*.
    - Submit a single .java file on moodle by the deadline (details on moodle).
    - Do not change the name of the Java file, but ensure you add your name and
        matric as requested below...
    - You do not need to add any additional import lines.
    - Everything you need to do these tasks is covered in the week 1 slides.
*/

/*
    Non task-specific marks:
     - Add a comment with your name and matric here - [1 mark]
     - Clear code commenting [1 mark]
     - Use of correct Java variable naming conventions [1 mark]
*/

/**
 * NAME: Pedro Henrique Belfort Fernandes
 * <br>
 * MATRICULE: 2456943B
 */
public class AssEx1 {
    public static void main(String[] args) {
        String name = "Fred";

        /* Task 1 [2 marks]
            Create a method called welcome that prints the word "Hello" followed by whatever
            is stored in the variable 'name'. It will be called by the line below.
        */
        welcome(name);

        /* Task 2 [3 marks]
            Write a method called multiples that prints out all multiples of some integer m between m and
            another intger max in individual lines.
            For example multiples(3,11) should print:
            3
            6
            9
            Your method *must* use a loop
        */
        int m = 3;
        int max = 11;
        multiples(m, max);

        /* Task 3 [3 marks]
            Write a method called check that takes an integer as an argument and
            returns a boolean value that is true if the integer is greater
            than 5 and less than 10. Call the method three times with the integers
            1, 6 and 12 respectively, printing the output each time on a new line.
        */
        // Call the method and print the output three times below...
        int[] testValues = {1, 6, 12};
        for (int value : testValues) {
            System.out.printf("%2d -> %b\n", value, check(value));
        }

        /* Task 4 [6 marks]
            Write a method called calculator that prompts the user to input
            an integer, an operator ('+' or '-') and finally another integer.
            The method should then perform the calculation and print the answer using
            String.format. The result of the claculation should be padded with
            zeros to make it length 4. E.g. if the user enters:
            4
            -
            3
            The program should output:
            "Calculation: 4 - 3 = 0001"
            The inputs should be on separate lines.
            You don't need to do any error checking on the user input.
        */
        calculator();

        /* Task 5 [5 marks]
            Write a method called table that takes two integers as arguments that correspond to
            a number of rows and a number of columns respectively.
            If either integer is <0 or >= 10, the program should print:
            "Error, rows and columns must be >0 and <10"
            and return.
            If the number of rows and columns is between >=0 and <=9 the method
            should print a table with the table co-ordinates in each position. For example, if
            the number of rows is 2 and the number of columns 4:
              (0,0)  (0,1)  (0,2)  (0,3)
              (1,0)  (1,1)  (1,2)  (1,3)
            Important:
             - You *must* only use System.out.print and *not* System.out.println...
             - Separate each co-ordinate pair with a tab ('\t')
             - You may *not* use for loops! I.e. you *must* use a do or a while loop.
        */
        table(13, 5);
        table(-2, 7);
        table(3, 6);
    }


    /**
     * Prints a greeting message which includes the provided someone's name.
     *
     * @param someone the <code>string</code> to represent someone's name.
     */
    private static void welcome(String someone) {
        System.out.printf("Hello %s\n", someone);
    }


    /**
     * Prints out all multiples of a base <code>integer</code> between the base <code>integer</code> and a superior limit (inclusive).
     *
     * @param baseNumber    the <code>integer</code> to use as the base value for generating multiples.
     * @param superiorLimit the <code>integer</code> to consider as the superior threshold.
     */
    private static void multiples(int baseNumber, int superiorLimit) {
        // Input validation: only proceed if the superior limit is greater than the base number provided
        if (superiorLimit < baseNumber) {
            System.out.printf("Seems like the superior limit %d is less than the base number %d provided.\nPlease, try again providing a superior limit which is greater than the base number value\n", superiorLimit, baseNumber);
        } else {
            // Generate and print multiples between the base number and the superior limit
            for (int i = 1; i * baseNumber < superiorLimit; i++) {
                int multiple = i * baseNumber;
                System.out.println(multiple);
            }
        }
    }


    /**
     * Checks if the provided <code>integer</code> is greater than 5 and less than 10.
     *
     * @param value the <code>integer</code> to compare with 5 and 10.
     * @return <code>true</code> if the value is greater than 5 and less than 10; <code>false</code> otherwise.
     */
    private static boolean check(int value) {
        return value > 5 && value < 10;
    }


    /**
     * Prompts the user to input an <code>integer</code>, an operator ('+' or '-'),
     * and finally another <code>integer</code>. Performs a calculation with the given inputs
     * and prints the output.
     */
    private static void calculator() {
        Scanner keyboard = new Scanner(System.in);
        int[] integerInputs = new int[2];
        String operator;

        // Asks for and captures all input values
        integerInputs[0] = requestIntegerInput(keyboard);
        keyboard.nextLine();
        operator = requestOperatorInput(keyboard);
        keyboard.nextLine();
        integerInputs[1] = requestIntegerInput(keyboard);

        // Performs the calculation based on the operator; '+' results in a addition; '-' results in subtraction
        int result = operator.equals('+') ? integerInputs[0] + integerInputs[1] : integerInputs[0] - integerInputs[1];

        // Formats and outputs the result
        String output = String.format("%d %s %d = %04d", integerInputs[0], operator, integerInputs[1], result);
        System.out.println(output);
    }


    /**
     * Prompts a message to the user asking for an <code>integer</code> input.
     * Captures the <code>integer</code> input from the keyboard and returns it.
     *
     * @param keyboard <code>Scanner</code> instance configured to capture the user's keyboard input.
     * @return the captured <code>integer</code>.
     */
    private static int requestIntegerInput(Scanner keyboard) {
        System.out.println("Please provide an integer");
        return keyboard.nextInt();
    }


    /**
     * Prompts a message to the user asking for a <code>String</code> operator input.
     * Captures the <code>integer</code> input from the keyboard and returns it.
     *
     * @param keyboard <code>Scanner</code> instance configured to capture the user's keyboard input.
     * @return the captured <code>String</code>.
     */
    private static String requestOperatorInput(Scanner keyboard) {
        System.out.println("Please provide an operator ('+' or '-')");
        return keyboard.next();
    }


    /**
     * Prints out a table with coordinates based on the number of rows and columns provided.
     * Input values should be equal or greater than 0 and less than 10.
     *
     * @param rows    the maximum <code>integer</code> value of rows for the table
     * @param columns the maximum <code>integer</code> value of columns of the table
     */
    private static void table(int rows, int columns) {
        // Error handling: Checks input values are <0 or >= 10 and prompts an error message
        if (rows < 0 || rows >= 10 || columns < 0 || columns >= 10) {
            System.out.print("Error, rows and columns must be >0 and <10\n");
            return;
        }

        int i = 0;
        int j = 0;

        // Iterates until it reaches the provided number of rows and columns
        while (i <= rows && j <= columns) {
            // Formats and prints coordinates
            String coordinate = String.format("(%d, %d)", i, j);
            System.out.print(coordinate);

            // Advances on the table, filling the first row columns and moving to next row
            // Note: tabs are used to separate coordinates in the same row
            if (j == columns - 1 && i <= rows) {
                System.out.print("\n");
                j = 0;
                i++;
            } else {
                System.out.print("\t");
                j++;
            }
        }
    }

}
