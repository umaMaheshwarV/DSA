class Solution {
    public boolean isSafe(int row, int col, char[][] board, char val) {
        for (int i = 0; i < 9; i++) {
            // Check in row
            if (board[row][i] == val) return false;
            // Check in column
            if (board[i][col] == val) return false;
            // Check in 3x3 grid
            if (board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)] == val) return false;
        }
        return true;
    }

    public boolean solveSudoku(char[][] board) {   
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        char val = (char) ('0' + k); // Convert integer to character
                        if (isSafe(i, j, board, val)) {
                            board[i][j] = val; // Place the number
                            if (solveSudoku(board)) { // Recursive call
                                return true; // If solved, return true
                            }
                            board[i][j] = '.'; // Backtrack
                        }
                    }
                    return false; // If no number can be placed, return false
                }
            }
        }
        return true; // If the board is completely filled
    }
}