// 867. Transpose Matrix
public class transpose_matrix {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // reverse row to col in new matrix and copy old values
        int [][] newMat = new int[cols][rows];

        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                
                newMat[col][row] = matrix[row][col];
            }
        }
        return newMat;
        }
}
