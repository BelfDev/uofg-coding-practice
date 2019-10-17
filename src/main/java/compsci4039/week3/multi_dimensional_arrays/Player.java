package compsci4039.week3.multi_dimensional_arrays;

import java.util.Arrays;

public class Player {

    private String name;
    private int[][] moves;
    private char symbol;
    private boolean isTurn;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.moves =  new int[0][2];
        this.isTurn = false;
    }

    public String getName() {
        return name;
    }

    public int[][] getMoves() {
        return moves;
    }

    public char getSymbol() {
        return symbol;
    }

    public void addMove(int row, int column) {
        int[][] expandedMoves = new int[moves.length + 1][2];

        for(int i=0; i<moves.length; i++)
            for(int j=0; j<moves[i].length; j++)
                expandedMoves[i][j] = moves[i][j];

        expandedMoves[moves.length][0] = row;
        expandedMoves[moves.length][1] = column;
        moves = expandedMoves;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public boolean checkIfMoveHasBeenPerformed(int row, int column) {
        for(int[] roundMove: moves) {
            if (roundMove[0] == row && roundMove[1] == column) {
                return true;
            }
        }
        return false;
    }

}
