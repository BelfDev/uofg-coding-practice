package compsci4039.week3.array_of_primitives;

import java.util.Random;

/*
 * Programming IT, Laboratory Exercises
 * 1 Arrays of primitives
 * Parts 1 - 5
 * https://docs.google.com/document/d/1A-rlXlmnchQN-3oM4X1lTSsz6Qs44Nl4uxaGfHAkNkE/
 */
public class Lab7Ex1 {


    public static void main(String[] args) {
        double[] myRandomArray = populateRandomArray();
        double myRandomAverage = computeAverage(myRandomArray);
        System.out.println(myRandomAverage);

        int[] someArray = {1, 2, 4, 5, 4, 3, 5};
        int result = findElementFirstOccurrence(5, someArray);
        System.out.println(result);

        System.out.println(findElementLastOccurrence(5, someArray));
        System.out.println(findAllElementOccurrences(5, someArray).length);
    }

    // Part 1
    public static double[] populateRandomArray() {
        double[] populatedArray = new double[100];
        Random randomGenerator = new Random();
        for (int i = 0; i < populatedArray.length; i++) {
            populatedArray[i] = randomGenerator.nextDouble();
        }
        return populatedArray;
    }

    // Part 2
    public static double computeAverage(double[] array) {
        double sum = 0;
        for (double element: array) {
            sum += element;
        }
        return sum / array.length;
    }

    // Part 3
    public static int findElementFirstOccurrence(int targetElement, int[] array) {
        int currentIndex = 0;
        for (int element: array) {
            if (element == targetElement) return currentIndex;
            currentIndex++;
        }
        return -1;
    }

    // Part 4
    public static int findElementLastOccurrence(int targetElement, int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == targetElement) return i;
        }
        return -1;
    }

    // Part 5
    public static int[] findAllElementOccurrences(int targetElement, int[] array) {
        int[] operationArray = new int[array.length];
        int counter = 0;

        // Populate operationArray with occurrences positions
        for(int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                operationArray[i] = i;
                counter++;
            } else {
                operationArray[i] = -1;
            }
        }

        int[] occurrencesArray = new int[counter];
        counter = 0;

        // Filter out the -1 values and populate occurrencesArray
        for(int i = 0; i < operationArray.length; i++) {
            if (operationArray[i] > -1) {
                occurrencesArray[counter] = operationArray[i];
                counter++;
            }
        }

        return occurrencesArray;
    }


}
