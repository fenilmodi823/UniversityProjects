public class NQueens {

    private int size;
    private int[] board;

    public NQueens(int size) {
        this.size = size;
        this.board = new int[size];
    }

    public boolean solve() {
        return placeQueen(0);
    }

    private boolean placeQueen(int row) {
        if (row == size) {
            return true;
        }
        for (int col = 0; col < size; col++) {
            if (isSafe(row, col)) {
                board[row] = col;
                if (placeQueen(row + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            int queenCol = board[i];
            if (queenCol == col || Math.abs(queenCol - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public void printSolution() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 8;
        NQueens queens = new NQueens(size);
        if (queens.solve()) {
            queens.printSolution();
        } else {
            System.out.println("No solution exists");
        }
    }
}