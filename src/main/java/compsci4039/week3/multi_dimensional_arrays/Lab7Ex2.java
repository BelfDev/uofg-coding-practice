package compsci4039.week3.multi_dimensional_arrays;

/*
 * Programming IT, Laboratory Exercises
 * 2 Multi-dimensional arrays
 * Parts 1 - 2
 * https://docs.google.com/document/d/1A-rlXlmnchQN-3oM4X1lTSsz6Qs44Nl4uxaGfHAkNkE
 */
public class Lab7Ex2 {

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame("Pedro", "Catarina");
        game.play();
    }

    // Part 1
    public static int[][] createTwoDimensionalArray(int value) {
        int[][] resultArray = new int[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                if (j < i) {
                    resultArray[i][j] = 0;
                } else if (i == j) {
                    resultArray[i][j] = 1;
                } else {
                    resultArray[i][j] = j - i + 1;
                }
            }
        }
        return resultArray;
    }



}
