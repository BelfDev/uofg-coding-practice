package compsci4039.week1.conditions;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/*
 * Programming IT, Laboratory Exercises
 * 4 Conditions
 * Parts 1 - 6
 * https://docs.google.com/document/d/1vnyQKYFAc0_70oGF3a0RgEl1BHRUGm9VwNuHV4iPnA8
 */

public class Lab2Ex3 {

    private static Map<String, Integer> months = new HashMap() {{
        put("Jan", 1);
        put("Feb", 2);
        put("Mar", 3);
        put("Apr", 4);
        put("May", 5);
        put("Jun", 6);
        put("Jul", 7);
        put("Aug", 8);
        put("Sep", 9);
        put("Oct", 10);
        put("Nov", 11);
        put("Dec", 12);
    }};

    public static void main(String args[]) {
        System.out.println(isLeapYear(1800));
        System.out.println(calculateNumberOfDays("Feb" , 2016));
        System.out.println(calculateWholeYears(27, 9, 1994));
    }

    // Part 1, 2, 3
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }

    // Part 4, 5

    public static int calculateNumberOfDays(int monthNumber, int year) {
        if (monthNumber <= 0 || monthNumber > 12) {
            return 0;
        } else if (monthNumber % 2 == 0 && monthNumber != 2) {
            return  30;
        } else if (monthNumber == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    public static int calculateNumberOfDays(String monthShortName, int year) {
        int month = months.get(monthShortName);
        return calculateNumberOfDays(month, year);
    }

    // Part 6
    public static int calculateWholeYears(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);

        int result = currentYear - year;

        if (currentDay - day == 0 && currentMonth - month == 0) {
            result += 1;
        }

        return result;
    }

}
