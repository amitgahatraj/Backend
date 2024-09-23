package AssignmentOOP;

public class TicTacToe {
    private char[][] board; // 2D array for the board
    private int turns; // Tracks the number of turns played

    // Default constructor
    public TicTacToe() {
        board = new char[3][3]; // Initialize the board
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' '; // Fill with blank spaces
            }
        }
        turns = 0; // Initialize turns
    }

    // Accessor methods
    public boolean isWinner(char p) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == p && board[i][1] == p && board[i][2] == p) || // Check rows
                    (board[0][i] == p && board[1][i] == p && board[2][i] == p)) { // Check columns
                return true;
            }
        }
        // Check diagonals
        return (board[0][0] == p && board[1][1] == p && board[2][2] == p) ||
                (board[0][2] == p && board[1][1] == p && board[2][0] == p);
    }

    public boolean isFull() {
        return turns >= 9; // Returns true if 9 turns have been played
    }

    public boolean isCat() {
        return isFull() && !isWinner('X') && !isWinner('O'); // Cat's game condition
    }

    public boolean isValid(int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' '; // Check valid space
    }

    public int numTurns() {
        return turns; // Returns the number of turns played
    }

    public char playerAt(int r, int c) {
        return board[r][c]; // Returns the character at the given location
    }

    public void displayBoard() {
        // Display the current board
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c]);
                if (c < 2) System.out.print("|");
            }
            System.out.println();
            if (r < 2) System.out.println("-----"); // Row separator
        }
    }

    // Modifier method
    public void playMove(char p, int r, int c) {
        if (isValid(r, c)) {
            board[r][c] = p; // Place the move
            turns++; // Increment the turn count
        } else {
            System.out.println("Invalid move! Try again.");
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.displayBoard(); // Display initial board

        game.playMove('X', 0, 0);
        game.displayBoard();

        game.playMove('O', 1, 1);
        game.displayBoard();

        game.playMove('X', 0, 1);
        game.displayBoard();

        game.playMove('O', 0, 2);
        game.displayBoard();

        // Check winner
        if (game.isWinner('X')) {
            System.out.println("Player X wins!");
        } else if (game.isWinner('O')) {
            System.out.println("Player O wins!");
        } else if (game.isCat()) {
            System.out.println("It's a cat's game!");
        }
    }
}

