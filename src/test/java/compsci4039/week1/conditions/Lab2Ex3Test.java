package compsci4039.week1.conditions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab2Ex3Test {

    @Test
    public final void isLeapYear_ValidLeapYear_True() {
        int[] leapYears = {1600, 2000, 2400};

        for (int year: leapYears) {
            boolean result = Lab2Ex3.isLeapYear(year);
            Assert.assertTrue("Should return true if valid leap year", result);
        }
    }

    @Test
    public final void isLeapYear_InvalidLeapYear_False() {
        int[] nonLeapYears = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600};

        for (int year: nonLeapYears) {
            boolean result = Lab2Ex3.isLeapYear(year);
            Assert.assertFalse("Should return false if invalid leap year", result);
        }
    }

    @Test
    public final void calculateNumberOfDays_MonthIsFebruaryAndYearIsLeapYear_29() {
        int month = 2;
        int year = 2000;

        int numberOfDays = Lab2Ex3.calculateNumberOfDays(month, year);
        assertEquals("February should have 29 days if year input is leap year", numberOfDays, 29);
    }

    @Test
    public final void calculateNumberOfDays_OutOfBoundsMonth_0() {
        int year = 2000;
        assertEquals("Months should be between 1 and 12", Lab2Ex3.calculateNumberOfDays(0, year), 0);
        assertEquals("Months should be between 1 and 12", Lab2Ex3.calculateNumberOfDays(13, year), 0);
    }

    @Test
    public final void calculateNumberOfDays_MonthIsOdd_31() {
        int year = 2000;

        for (int month = 1; month <= 12; month+=2) {
            int numberOfDays = Lab2Ex3.calculateNumberOfDays(month, year);
            assertEquals("All even months should have 31 days", numberOfDays, 31);
        }
    }

    @Test
    public final void calculateNumberOfDays_MonthIsEvenAndNotFebruary_30() {
        int year = 2000;

        for (int month = 4; month <= 12; month+=2) {
            int numberOfDays = Lab2Ex3.calculateNumberOfDays(month, year);
            assertEquals("All even months but February should have 30 days", numberOfDays, 30);
        }
    }

    @Test(expected=NullPointerException.class)
    public final void calculateNumberOfDays_UnknownMonthString_NullPointerException() {
        String monthShortName = "SomeUnknownName";
        int year = 2000;

        Lab2Ex3.calculateNumberOfDays(monthShortName, year);
    }

    @Test
    public final void calculateWholeYears_TwentyYearsOldInput_20() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int nineteenYearsAgo = currentYear - 19;

        String message = String.format("The input date %d/%d/%d should return 20", currentDay, currentMonth, nineteenYearsAgo);
        assertEquals(message, Lab2Ex3.calculateWholeYears(currentDay, currentMonth, nineteenYearsAgo), 20);

    }

}
