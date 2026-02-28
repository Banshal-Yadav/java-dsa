// 2d array

import java.util.*;

class test {
    public static void main(String args[]) {
        int[][] arr = new int[2][3];

        Scanner sc = new Scanner(System.in);

        // 2d array input
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        
        // 2d output
        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // enchanced array
        for(int[] n : arr){
            System.out.println(Arrays.toString(n));
        }
    }
}