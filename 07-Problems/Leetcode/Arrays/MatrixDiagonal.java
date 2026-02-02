// Qs 1572 -  Matrix Diagonal Sum
package Leetcode.Arrays;

public class MatrixDiagonal {
    public int diagonalSum(int[][] mat) {
        
        int prim_diag = 0;
        int sec_diag = 0;
        int index = 0;

        // primary diagonal sum
        for(int row = 0; row < mat.length; row++){
            prim_diag += mat[row][row]; // start from [0,0] -> [1,1] -> [2,2]
        }

        // secondary diagonal sum
        for(int col = mat.length-1; col >= 0 ; col--){
            sec_diag += mat[index][col]; // start from [0,2] -> [1,1] -> [2,0]
            index++;
        }

        // both diagonal sum
        int diag_sum = 0;

        // get the middle number
        int mid_element = mat[mat.length/2][mat.length/2];

        // if single elemnt return [0,0] position
        // if matrix size even it means no common nims in either diagonal
        // if matrix size odd , there is common number which is mid_element
        if(mat.length < 2) {
            return mat[0][0];
        }
        else if(mat.length % 2 == 0) {
            diag_sum = prim_diag + sec_diag;
        } else {
            diag_sum = prim_diag + sec_diag - mid_element;
        }
        return diag_sum;
    }
}
