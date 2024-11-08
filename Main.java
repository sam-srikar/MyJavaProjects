public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        int[] results = countGames(board);
        
        System.out.println("Total games: " + results[0]);
        System.out.println("Draws: " + results[1]);
        System.out.println("X wins: " + results[2]);
        System.out.println("O wins: " + results[3]);
    }

    // Recursive function to count games
    public static int[] countGames(Board board) {
        if (board.isGameOver()) {
            int[] result = new int[4];
            // Total games
            result[0] = 1; 

            int winner = board.getWinner();
            // X wins
            if (winner == 1) result[2] = 1; 
            // O wins
            else if (winner == -1) result[3] = 1; 
            // Draw
            else result[1] = 1; 
            return result;
        }

        int[] totals = new int[4];
        for (int move : board.getAvailableMoves()) {
            // Create a new board for the next move
            Board nextBoard = new Board(board); 
            nextBoard.doMove(move);
            
            int[] subResults = countGames(nextBoard);
            for (int i = 0; i < 4; i++) {
                totals[i] += subResults[i];
            }
        }
        return totals;
    }
}

