// 2d array
import java.util.*;
import java.util.Scanner;

class test {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Length of the 2d array is:" + arr.length);

        // input
        for(int row = 0; row < arr.length ; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        sc.close();
    }
}