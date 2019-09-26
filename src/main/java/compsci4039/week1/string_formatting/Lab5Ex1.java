package compsci4039.week1.string_formatting;

import java.text.DecimalFormat;

public class Lab5Ex1 {

    public static void main(String args[]) {
        calculateTimeTable(8.24579, 10);
    }

    // Part 1 & 2
    private static void calculateTimeTable(double number, int numberOfEntriesToShow) {
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
