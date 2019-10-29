package compsci4039.week3.multi_dimensional_arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * Naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class Lab7Ex2Test {

    @Test
    public void createTwoDimensionalArray_6_TwoDimensionalArrayWith6RowsAnd6Columns() {
        int[][] expectedResult = {{1, 2, 3, 4, 5, 6}, {0, 1, 2, 3, 4, 5}, {0, 0, 1, 2, 3, 4}, {0, 0, 0, 1, 2, 3}, {0, 0, 0, 0, 1, 2}, {0, 0, 0, 0, 0, 1}};
        int[][] result = Lab7Ex2.createTwoDimensionalArray(6);
        Assert.assertArrayEquals("Should generate 6x6 array", expectedResult, result);
    }

    @Test
    public void createTwoDimensionalArray_4_TwoDimensionalArrayWithSpecificFormat() {
        int[][] expectedResult = {{1, 2, 3, 4}, {0, 1, 2, 3}, {0, 0, 1, 2}, {0, 0, 0, 1}};
        int[][] result = Lab7Ex2.createTwoDimensionalArray(4);
        Assert.assertArrayEquals("Should generate 4x4 array with an specific format", expectedResult, result);
    }

}
