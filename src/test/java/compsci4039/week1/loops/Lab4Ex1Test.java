package compsci4039.week1.loops;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab4Ex1Test {

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
    public void calculateTimeTable_12_PrintFirstTenTimeTableTerms() {
        int input = 12;
        StringBuilder desiredOutput = new StringBuilder();
        for(int i = 10; i > 0; i--) {
            int result = input * i;
            desiredOutput.append(String.format("%s --> %s\n", i, result));
        }
        Lab4Ex1.calculateTimeTable(input);
        assertEquals(desiredOutput.toString(), outContent.toString());
    }

    @Test
    public void calculateTimeTable_NumberFourteenAndSevenEntries_PrintFirstSevenTimeTableTerms() {
        int input = 14;
        int entries = 7;
        StringBuilder desiredOutput = new StringBuilder();
        for(int i = 1; i <= entries; i++) {
            int result = input * i;
            desiredOutput.append(String.format("%s --> %s\n", i, result));
        }
        Lab4Ex1.calculateTimeTable(input, entries);
        assertEquals(desiredOutput.toString(), outContent.toString());
    }

    @Test
    public void calculateTimeTable_NumberTwentyAndFiveEntriesAscending_PrintFirstFiveTimeTableTermsInAscendingOrder() {
        int input = 20;
        int entries = 5;
        StringBuilder desiredOutput = new StringBuilder();
        for(int i = 1; i <= entries; i++) {
            int result = input * i;
            desiredOutput.append(String.format("%s --> %s\n", i, result));
        }
        Lab4Ex1.calculateTimeTable(input, entries, true);
        assertEquals(desiredOutput.toString(), outContent.toString());
    }

}
