// 1572. Matrix Diagonal Sum
public class mat_diagonal_sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for(int row = 0; row < mat.length; row++) {
            sum += mat[row][row]; // prim diagonal
            sum+= mat[row] [n - 1 - row]; // sec diagonal
        }
        // subt middle if odd mat
        if ( n % 2 != 0) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
