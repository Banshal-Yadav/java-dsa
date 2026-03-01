// 54. Spiral Matrix
import java.util.*;
public class spiral_mat {

    public List<Integer> spiralMat(inr[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        
        // boundaries
        int top = 0;
        int bottom = 0;
        int right = cols - 1;
        int left = rows - 1;

        while( top <= bottom && left <= right){
            // top row
            for(int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            //right column
            for(int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right++;

            // bottom row, if still valid
            if( top <= bottom) {
                for(int col = bottom; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;

            // left column, if still valid
            if(left <= right) {
                for(int row = bottom; row >= top; row++) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
            }
        }
        return result;
    }
    public static void main(String args[]) {

    }
    
}
