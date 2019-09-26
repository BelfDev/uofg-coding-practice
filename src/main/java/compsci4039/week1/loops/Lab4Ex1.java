package compsci4039.week1.loops;

public class Lab4Ex1 {

    public static void main(String[] args) {
        calculateTimeTable(8);
        calculateTimeTable(12, 10, false);
        calculateTimeTable(12, 10);
    }

    // Part 1
    private static void calculateTimeTable(int number) {
        int i = 10;

        while(i > 0) {
            int result = number * i;
            System.out.printf("%s --> %s\n", i, result);
            i--;
        }
    }

    // Part 2
    private static void calculateTimeTable(int number, int numberOfEntriesToShow) {
        int i = 1;
        while(i <= numberOfEntriesToShow) {
            int result = number * i;
            System.out.printf("%s --> %s\n", i, result);
            i++;
        }
    }


    private static void calculateTimeTable(int number, int numberOfEntriesToShow, boolean printAscending) {
        int i = 0;

        while(i < numberOfEntriesToShow) {
            int currentIndex = printAscending ? i + 1 : numberOfEntriesToShow - (i);
            int result = number * currentIndex;
            System.out.printf("%s --> %s\n", currentIndex, result);
            i++;
        }
    }

}
