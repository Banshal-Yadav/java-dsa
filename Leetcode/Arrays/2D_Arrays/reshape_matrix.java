// 566. Reshape the Matrix
public class reshape_matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        // check if reshape is possible
        if( rows * cols != r * c) {return mat;}

        // new matrix
        int[][] matrix = new int[r][c];

        for(int i = 0; i < rows * cols; i++) {
            // division gives row index, modulo gives column index
            // row = i / cols
            // col = i % cols
            matrix[i/c][i%c] = mat[i/cols][i%cols];
        }
    return matrix;
    }
}
