package compsci4039.week3.multi_dimensional_arrays;

import java.util.Scanner;

public class TicTacToeGame {

    private int currentRound;
    private Player playerOne;
    private Player playerTwo;
    private Player roundPlayer;
    private char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    private enum Outcome {
        VICTORY, DRAW, CONTINUE
    }

    public TicTacToeGame(String playerOneName, String playerTwoName) {
        this.currentRound = 0;
        this.playerOne = new Player(playerOneName, 'x');
        this.playerTwo = new Player(playerTwoName, 'o');
    }

    public Player getNextPlayer() {
        return playerOne.isTurn() ? playerOne : playerTwo;
    }

    public void play() {
        // Game is initializing
        Scanner keyboard = new Scanner(System.in);
        boolean isGameOver = false;
        resetMatch();
        initializeTheGame(keyboard);

        // Game is on
        while (!isGameOver) {
            roundPlayer = getNextPlayer();
            requestPlayerMove(keyboard);
            updateGameBoard();
            printGameBoard();
            setNextPlayerTurn(playerOne.isTurn() ? 2 : 1);

            Outcome roundOutcome = checkRoundOutcome(roundPlayer);
            if (roundOutcome == Outcome.DRAW || roundOutcome == Outcome.VICTORY) {
                isGameOver = true;
            } else {
                currentRound++;
            }
        }

        // Game is over
        offerNewGame(keyboard);
    }

    private void resetMatch() {
        this.currentRound = 0;
        this.playerOne = new Player(playerOne.getName(), 'x');
        this.playerTwo = new Player(playerTwo.getName(), 'o');
        this.board = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    private void initializeTheGame(Scanner keyboard) {

        System.out.println("Welcome to the Tic-Tac-Toe GAME!");
        System.out.println("Let's get started. Please choose who is going to start in the first turn");
        System.out.printf("\nFor %s, type 1; for %s, type 2\n", playerOne.getName(), playerTwo.getName());

        int input = keyboard.nextInt();
        setNextPlayerTurn(input);
    }


    private void requestPlayerMove(Scanner keyboard) {
        System.out.printf("\nIt's %s's move. Remember, your symbol is: '%c'.", roundPlayer.getName(), roundPlayer.getSymbol());
        System.out.printf("\nType the row and column separated by '-'. Example: 1-1.\n", roundPlayer.getName());

        String input = keyboard.next();
        keyboard.nextLine();

        int row = Character.getNumericValue(input.charAt(0));
        int column = Character.getNumericValue(input.charAt(2));

        if (isLegalMove(row, column)) {
            roundPlayer.addMove(row, column);
        } else {
            System.out.printf("\nThis move has already been performed. %s, please choose another one.\n", roundPlayer.getName());
            requestPlayerMove(keyboard);
        }
    }

    private boolean isLegalMove(int row, int column) {
        if (row < 0 || row > 3 || column < 0 || column > 3) {
            return false;
        } else if (playerOne.checkIfMoveHasBeenPerformed(row, column) || playerTwo.checkIfMoveHasBeenPerformed(row, column)) {
            return false;
        } else {
            return true;
        }
    }


    private void updateGameBoard() {
        int[][] playerMoves = roundPlayer.getMoves();
        int row = playerMoves[playerMoves.length - 1][0];
        int column = playerMoves[playerMoves.length - 1][1];
        board[row][column] = roundPlayer.getSymbol();
    }

    private void printGameBoard() {
        System.out.println("\nCurrent Game Board:\n");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf(" %s ", board[i][j]);
                if (j == board[0].length - 1) {
                    System.out.println();
                } else {
                    System.out.print("|");
                }
            }
        }

    }

    private void setNextPlayerTurn(int playerNumber) {
        playerOne.setTurn(playerNumber == 1);
        playerTwo.setTurn(playerNumber == 2);
    }

    private Outcome checkRoundOutcome(Player roundPlayer) {
        if (currentRound == 8) {
            System.out.println("DRAW! :(");
            return Outcome.DRAW;
        } else {
            if (isVictorious(roundPlayer.getMoves())) {
                System.out.printf("\nCongratulations %s! You are Victorious!\n", roundPlayer.getName());
                return Outcome.VICTORY;
            }
            return Outcome.CONTINUE;
        }
    }

    private boolean isVictorious(int[][] playerMoves) {
        int[] horizontalCounter = new int[3];
        int[] verticalCounter = new int[3];
        int sameCoordinatesCounter = 0;

        // Evaluate all player moves
        for (int[] move : playerMoves) {
            int rowIndex = move[0];
            int columnIndex = move[1];
            verticalCounter[rowIndex]++;
            horizontalCounter[columnIndex]++;
            if (rowIndex == columnIndex) sameCoordinatesCounter++;
        }

        // Declare victory or not
        if (sameCoordinatesCounter == 3) {
            return true;
        }
        for (int i = 0; i < horizontalCounter.length; i++) {
            if (horizontalCounter[i] == 3 || verticalCounter[i] == 3)
                return true;
        }
        return false;
    }

    private void offerNewGame(Scanner keyboard) {
        System.out.println("The game is over. Would you like to continue?\nType 'y' for yes or 'n' for no.");

        String input = keyboard.next();
        keyboard.nextLine();

        if (input.equals("y")) {
            play();
        }
    }

}
