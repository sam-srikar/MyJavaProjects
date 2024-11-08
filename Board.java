public class Board {
    // The 3x3 TicTacToe board
    private char[][] board; 
    // Tracks the current player ('X' or 'O')
    private char currentPlayer; 

    public Board() {
        board = new char[3][3];
        // X starts the game
        currentPlayer = 'X'; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Initialize empty board
                board[i][j] = ' '; 
            }
        }
    }

    // Deep copy constructor
    public Board(Board copyMe) {
        board = new char[3][3];
        currentPlayer = copyMe.currentPlayer;
        for (int i = 0; i < 3; i++) {
            System.arraycopy(copyMe.board[i], 0, this.board[i], 0, 3);
        }
    }

    // Display the board as a String
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(board[i][j]);
                if (j < 2) sb.append("|");
            }
            sb.append("\n");
            if (i < 2) sb.append("-----\n");
        }
        return sb.toString();
    }

    // Place a piece on the board
    public void doMove(int move) {
        int row = move / 3;
        int col = move % 3;
        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    // Get available moves as an array of integers
    public int[] getAvailableMoves() {
        int[] moves = new int[9];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    moves[count++] = i * 3 + j;
                }
            }
        }
        int[] result = new int[count];
        System.arraycopy(moves, 0, result, 0, count);
        return result;
    }

    // Check if the game is over
    public boolean isGameOver() {
        return getWinner() != 0 || getAvailableMoves().length == 0;
    }

    // Determine the winner: 1 for X, -1 for O, 0 for no winner yet
    public int getWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0] == 'X' ? 1 : -1;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i] == 'X' ? 1 : -1;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0] == 'X' ? 1 : -1;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2] == 'X' ? 1 : -1;
        }
        // No winner
        return 0; 
    }

    // Getter for current player
    public char getCurrentPlayer() {
        return currentPlayer;
    }
}

