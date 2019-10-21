package compsci4039.week1.keyboard_input;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab3Ex1Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void compCircleArea_RadiusEqualsTwo_4PI() {
        int radius = 2;
        double result = Lab3Ex1.compCircleArea(radius);
        assertEquals("Circle with radius of 2 should have 4π area", result, 4 * Math.PI, 0.001);
    }

    @Test
    public void compCircleCircumference_RadiusEqualsFour_8PI() {
        int radius = 4;
        double result = Lab3Ex1.compCircleCircumference(radius);
        assertEquals("Circle with radius of 4 should have 8π circumference", result, 8 * Math.PI, 0.001);
    }

    @Test
    public void summariseCircle_RadiusEqualsThree_PrintSummaryMessage() {
        double area = 3 * 3 * Math.PI;
        double circumference = 2 * 3 * Math.PI;
        String desiredOutput = "The circle area is " + area + " and its circumference is " + circumference + "\n";
        Lab3Ex1.summariseCircle(3);
        assertEquals(desiredOutput, outContent.toString());
    }

    @Test
    public void calculateWholeYears_ThirtyYearsAgo_PrintYearsOldMessage() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR) - 29;
        String desiredOutput = "You are 30 whole years old";
        Lab3Ex1.calculateWholeYears(day, month, year);
        assertEquals(desiredOutput, outContent.toString());
    }

}
