// 2d arrays (stored in heap memory)
// initialized as arr[][] -> row,col
// can also be called arrays of array
// time Complexity: O(N * M) 
// space Complexity: O(N * M) - to store the array
//  N = rows, M = columns

import java.util.*;

public class _2d_arrays {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 2d array initialization
        // here row -> 3, col size varies (can be different for each row)
        // arr.length gives us the number of rows
        int[][] arr = new int[3][3]; 

        // 2d array structure example
        /*
            {
                {1, 2, 3},   // index -> 0
                {4, 5},      // index -> 1
                {6, 7, 8, 9} // index -> 2
            }
        */
        
        // array length
        // arr.length gives the number of rows, not total elements
        // in this case it will print 3 because we have 3 rows
        System.out.println("Length of the 2d arrray is: " + arr.length);

        // accessing elements
        // syntax: arr[row_index][col_index]
        // example: arr[2][0] gives us 6 (3rd row, 1st element)
        // example: arr[1][1] gives us 5 (2nd row, 2nd element)

        // taking inputs
        // outer loop runs through each row
        // inner loop runs through each column of that row
        for(int row = 0; row < arr.length; row++){
            // arr[row].length gives the number of columns in current row
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // output method 1: using Arrays.toString()
        // this is cleaner than manually printing each element
        // we dont need col size to be fixed in manual way
        for(int row = 0; row < arr.length; row++){
            // manual way :
            // for(int col = 0; col < arr[row].length; col++){
            //     System.out.print(arr[row][col] + " ");
            // }
            
            // Arrays.toString() automatically formats the row nicely
            // prints each row in format: [element1, element2, element3]
            System.out.println(Arrays.toString(arr[row]));
        }

        // output method 2: using enhanced for loop
        // this is the shortest way to print a 2d array
        // 'a' represents each row (which is itself an array)
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
         
        sc.close();
    }
}