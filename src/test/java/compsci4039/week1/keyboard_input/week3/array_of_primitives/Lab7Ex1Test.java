package compsci4039.week1.keyboard_input.week3.array_of_primitives;

import compsci4039.week3.array_of_primitives.Lab7Ex1;
import org.junit.Assert;
import org.junit.Test;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab7Ex1Test {

    @Test
    public void populateRandomArray_PopulatedArrayWith100ElementsBetween0And1() {
        double[] populatedArray = Lab7Ex1.populateRandomArray();
        for(double element: populatedArray) {
            boolean isGreaterThanOne = element > 1;
            boolean isLessThanZero = element < 0;
            Assert.assertFalse("Element in randomArray cannot be greater than 1", isGreaterThanOne);
            Assert.assertFalse("Element in randomArray cannot be less than 1", isLessThanZero);
        }
        Assert.assertEquals("The random array should have 100 elements", 100, populatedArray.length);
    }

    @Test
    public void computeAverage_DoubleArray_SumDividedByLength() {
        double[] inputArray = {0.3, 0.5, 0.6, 0.3, 0.5, 0.1, 0.4};
        double average = 2.7 / 7;
        double result = Lab7Ex1.computeAverage(inputArray);
        Assert.assertEquals("The average of the input array should be 0.3857", average, result, 0.00001);
    }

    @Test
    public void findElementFirstOccurrence_ExistentElementAndArray_ElementPosition() {
        int[] inputArray = {1, 3, 4, 5, 1, 3, 4, 7, 3, 445, 544, 32, 23, 23, 23, 45};
        int expectedResult = 12;
        int result = Lab7Ex1.findElementFirstOccurrence(23, inputArray);
        Assert.assertEquals("The first element position should be " + expectedResult, expectedResult, result);
    }

    @Test
    public void findElementFirstOccurrence_NonExistentElementAndArray_Negative1() {
        int[] inputArray = {4, 52, 12};
        int nonExistentElement = 1;
        int result = Lab7Ex1.findElementFirstOccurrence(nonExistentElement, inputArray);
        Assert.assertEquals("In case of non existent element, should return -1", -1, result);
    }

    @Test
    public void findElementLastOccurrence_IntegerArrayWithFiveRepeatedElements_4() {
        int[] inputArray = {2, 2, 2, 2, 2};
        int expectedResult = 4;
        int result = Lab7Ex1.findElementLastOccurrence(2, inputArray);
        Assert.assertEquals("The last element position should be " + expectedResult, expectedResult, result);
    }

    @Test
    public void findElementLastOccurrence_NonExistentElementAndArray_Negative1() {
        int[] inputArray = {3, 2, 5, 3, 2, 2, 3};
        int expectedResult = -1;
        int result = Lab7Ex1.findElementLastOccurrence(8, inputArray);
        Assert.assertEquals("In case of non existent element, should return -1", expectedResult, result);
    }

    @Test
    public void findAllElementOccurrences_ExistentElementAndArray_ElementPositions() {
        int[] inputArray = {2, 1, 4, 5, 3, 2, 4, 4, 3, 2};
        int targetElement = 2;
        int[] expectedResult = {0, 5, 9};
        int[] result = Lab7Ex1.findAllElementOccurrences(targetElement, inputArray);
        Assert.assertArrayEquals("Should return array with elements 0, 5, 9", expectedResult, result);
    }

    @Test
    public void findAllElementOccurrences_NonExistentElementAndArray_EmptyArray() {
        int[] inputArray = {2, 1, 4, 5, 3, 2, 4, 4, 3, 2};
        int targetElement = 8;
        int[] expectedResult = {};
        int[] result = Lab7Ex1.findAllElementOccurrences(targetElement, inputArray);
        Assert.assertArrayEquals("Should return empty array", expectedResult, result);
    }

}
