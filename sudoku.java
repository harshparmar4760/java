public class Sudoku {

    public static boolean isValidSudoku(char[][] board) {
        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i)) {
                return false;
            }
        }

        // Check 3x3 sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int j = 0; j < 9; j++) {
            char current = board[row][j];
            if (current != '.' && seen[current - '1']) {
                return false; // Duplicate in the row
            }
            if (current != '.') {
                seen[current - '1'] = true;
            }
        }
        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            char current = board[i][col];
            if (current != '.' && seen[current - '1']) {
                return false; // Duplicate in the column
            }
            if (current != '.') {
                seen[current - '1'] = true;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int startRow, int startCol) {
        boolean[] seen = new boolean[9];
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char current = board[i][j];
                if (current != '.' && seen[current - '1']) {
                    return false; // Duplicate in the sub-box
                }
                if (current != '.') {
                    seen[current - '1'] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] sudokuBoard = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(sudokuBoard)); // Output: true
    }
}
