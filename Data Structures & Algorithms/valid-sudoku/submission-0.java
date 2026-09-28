class Solution {
    public boolean isValidSudoku(char[][] board) {
        // boolean arrays to keep track of seen numbers (indices 0-8 represent digits '1'-'9')
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] squares = new boolean[9][9];
        
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                
                // Convert char '1'-'9' to integer index 0-8
                int val = board[r][c] - '1';
                
                // Calculate which of the 9 squares we are currently in
                int sqIndex = (r / 3) * 3 + (c / 3);
                
                // If we've already seen this value in the current row, col, or square, it's invalid
                if (rows[r][val] || cols[c][val] || squares[sqIndex][val]) {
                    return false;
                }
                
                // Mark the value as seen
                rows[r][val] = true;
                cols[c][val] = true;
                squares[sqIndex][val] = true;
            }
        }
        
        return true;
    }
}