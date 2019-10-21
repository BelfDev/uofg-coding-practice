package compsci4039.week1.string_formatting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab5Ex1Test {

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
    public void calculateTimeTable_NumberOutOfBounds_Void() {
        Lab5Ex1.calculateTimeTable(-10, 4);
        assertEquals("Number out of the lower bound. Should not return.", "" , outContent.toString());
        Lab5Ex1.calculateTimeTable(200, 4);
        assertEquals("Number out of the higher bound. Should not return.", "" , outContent.toString());
    }

    @Test
    public void calculateTimeTable_NumberFiveAndSixEntries_PrintFormattedTimeTable() {
        int baseNumber = 5;
        int numberOfEntries = 6;
        Lab5Ex1.calculateTimeTable(baseNumber, numberOfEntries);
        String expectedOutput = "05.000 x 01 = 00005.000\n" +
                "05.000 x 02 = 00010.000\n" +
                "05.000 x 03 = 00015.000\n" +
                "05.000 x 04 = 00020.000\n" +
                "05.000 x 05 = 00025.000\n" +
                "05.000 x 06 = 00030.000\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}
