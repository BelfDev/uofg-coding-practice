package compsci4039.week1.string_formatting;

import java.text.DecimalFormat;

/*
 * Programming IT, Laboratory Exercises
 * 7 Loops
 * Parts 1 - 2
 * https://docs.google.com/document/d/1vnyQKYFAc0_70oGF3a0RgEl1BHRUGm9VwNuHV4iPnA8
 */

public class Lab5Ex1 {

    public static void main(String args[]) {
        calculateTimeTable(8.24579, 10);
    }

    // Part 1 & 2
    public static void calculateTimeTable(double number, int numberOfEntriesToShow) {
        if (number < 0 || number > 99) {
            return;
        }

        int i = 1;
        while(i <= numberOfEntriesToShow) {
            double result = number * i ;
            DecimalFormat originalNumberFormatter = new DecimalFormat("00.000");
            DecimalFormat productFormatter = new DecimalFormat("00000.000");
            System.out.printf("%s x %02d = %s\n", originalNumberFormatter.format(number), i, productFormatter.format(result));
            i++;
        }
    }

}
