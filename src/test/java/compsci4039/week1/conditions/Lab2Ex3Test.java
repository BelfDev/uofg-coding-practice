package compsci4039.week1.conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lab2Ex3Tests {

    @Test
    public void Given_Year_When_IsLeapYear_Then_True() {
        int[] leapYears = {1600, 2000, 2400};
        int[] notLeapYears = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600};

        for (int year: leapYears) {
            boolean result = Lab2Ex3.isLeapYear(year);
            assertEquals(result, true);
        }

        for (int year: notLeapYears) {
            boolean result = Lab2Ex3.isLeapYear(year);
            assertEquals(result, false);
        }
    }

}
