package compsci4039.week1.loops;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab4Ex2Test {

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
    public void calculatePrimeNumbersUntil_19_PrintPrimeNumbersUntilNineteen() {
        int limit = 19;
        Lab4Ex2.calculatePrimeNumbersUntil(limit);
        String expectedOutput = "2 \n" +
                "3 \n" +
                "5 \n" +
                "7 \n" +
                "11 \n" +
                "13 \n" +
                "17 \n" +
                "19 \n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void isPrime_FivePrimeNumbers_True() {
        Assert.assertTrue("2 is a prime number. Should return true.", Lab4Ex2.isPrime(2));
        Assert.assertTrue("19 is a prime number. Should return true.", Lab4Ex2.isPrime(19));
        Assert.assertTrue("61 is a prime number. Should return true.", Lab4Ex2.isPrime(61));
        Assert.assertTrue("103 is a prime number. Should return true.", Lab4Ex2.isPrime(103));
        Assert.assertTrue("149 is a prime number. Should return true.", Lab4Ex2.isPrime(149));
        Assert.assertTrue("149 is a prime number. Should return true.", Lab4Ex2.isPrime(149));
    }

    @Test
    public void isPrime_NegativeTwentyThree_False() {
        Assert.assertFalse("Negative integers are not prime numbers. Should return false.", Lab4Ex2.isPrime(-23));
    }

    @Test
    public void produceTriangle_4_PrintFourRowsTriangle() {
        int numberOfRows = 4;
        String expectedOutput = "    \n   1 \n" +
                "  2 2 \n" +
                " 3 3 3 \n" +
                "4 4 4 4 \n";
        Lab4Ex2.produceTriangle(numberOfRows);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void padStringValue_ValueIsSimonPaddingIsAtAndLengthIsTen_PrintPaddedValue() {
        int length = 10;
        Lab4Ex2.padStringValue("Simon", '@', 10);
        assertEquals("New value: @@@@@Simon", outContent.toString());
    }

}
