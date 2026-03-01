public class srch_2d_matrix {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        
        // treat the 2D matrix as a sorted 1D array of size rows * cols
        int high  = rows * cols - 1;

        while( low <=  high) {
            int mid  =  low + (high - low) /2;

            // convert 1D index back to 2D coordinates
            int row = mid / cols; // number of full rows
            int col = mid % cols; // posi inside row

            if(matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) { 
                low = mid +1 ;
            } else {
                high = mid -1;
            }
        }
        return false;
    }
}
}
