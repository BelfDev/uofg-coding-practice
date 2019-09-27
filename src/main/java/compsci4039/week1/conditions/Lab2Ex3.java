package compsci4039.week1.conditions;

import java.util.Calendar;

public class Lab2Ex3 {

    public static void main(String args[]) {
        System.out.println(isLeapYear(1800));
        System.out.println(calculateNumberOfDays(1 , 2016));
        System.out.println(calculateWholeYears(27, 9, 1994));
    }

    // Part 1, 2, 3
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }

    // Part 4, 5
    private static int calculateNumberOfDays(int month, int year) {
        if (month < 0 || month > 12) {
            return 0;
        } else if (month % 2 == 0 && month != 2) {
            return  30;
        } else if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return 31;
        }
    }

    // Part 6
    private static int calculateWholeYears(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear= calendar.get(Calendar.YEAR);

        int result = currentYear - year;

        if (currentDay - day == 0 && currentMonth - month == 0) {
            result += 1;
        }

        return result;
    }

}
