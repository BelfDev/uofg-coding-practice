package compsci4039.week1.keyboard_input;

import java.util.Calendar;
import java.util.Scanner;

/*
 * Programming IT, Laboratory Exercises
 * 5 Keyboard input
 * Parts 1 - 6
 * https://docs.google.com/document/d/1vnyQKYFAc0_70oGF3a0RgEl1BHRUGm9VwNuHV4iPnA8
 */

public class Lab3Ex1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        executeFirstInstruction(keyboard);
        executeSecondInstruction(keyboard);
        executeThirdInstruction(keyboard);
        executeForthInstruction(keyboard);
        executeFifthInstruction(keyboard);
        executeSixthInstruction(keyboard);
    }

    private static void executeFirstInstruction(Scanner keyboard) {
        System.out.println("Please enter your name, followed by the return key.");
        String userEntry = keyboard.nextLine();
        System.out.println("Hello " + userEntry);
    }

    private static void executeSecondInstruction(Scanner keyboard) {
        System.out.println("Please enter your age");
        int userAge = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("You are " + userAge + " years old");
    }

    private static void executeThirdInstruction(Scanner keyboard) {
        System.out.println("Please enter your age");
        int userAge = keyboard.nextInt();
        // keyboard.nextLine();
        System.out.println("You are " + userAge + " years old");
    }

    public static double compCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double compCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void summariseCircle(double radius) {
        double area = compCircleArea(radius);
        double circumference = compCircleCircumference(radius);
        System.out.println("The circle area is " + area + " and its circumference is " + circumference);
    }

    private static void executeForthInstruction(Scanner keyboard) {
        System.out.println("Hello, please enter the circle radius");
        double radius = keyboard.nextDouble();
        keyboard.nextLine();
        summariseCircle(radius);
    }

    private static void executeFifthInstruction(Scanner keyboard) {
        System.out.println("Please write your firstname and age, separated by a space");
        String info = keyboard.nextLine();
        Scanner separatedKeyboard = new Scanner(info);
        String name = separatedKeyboard.next();

        if (separatedKeyboard.hasNextInt()) {
            int age = separatedKeyboard.nextInt();
            System.out.println("Name: " + name + "\nAge: " + age);
        } else {
            System.out.println("You have not quite followed the instruction");
        }
    }

    private static void executeSixthInstruction(Scanner keyboard) {
        System.out.println("Hello, let's calculate how many whole years old you are\nPlease enter your birthdate in this format: DAY MONTH YEAR\nExample: 3 3 1998");
        String info = keyboard.nextLine();
        Scanner caputredInfo = new Scanner(info);
        if (caputredInfo.hasNextInt()) {
            int day = caputredInfo.nextInt();
            int month = caputredInfo.nextInt();
            int year = caputredInfo.nextInt();
            calculateWholeYears(day, month, year);
        } else {
            System.out.println("You have not quite followed the instruction");
        }
    }

    public static void calculateWholeYears(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DATE);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);

        int dayDiff = currentDay - day;
        int monthDiff = currentMonth - month;
        int yearDiff = currentYear - year;
        int result = (dayDiff == 0 && monthDiff == 0) ? yearDiff + 1 : yearDiff;
        System.out.printf("You are %s whole years old", result);
    }

}
