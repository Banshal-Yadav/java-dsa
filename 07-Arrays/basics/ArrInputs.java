import java.util.*;
public class ArrInputs {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();

        // update an array
        arr[2] = 10; // will overwrite user input
        arr[3] = arr[3] + 5; // will add 5 to user input value
        
        // print inputs along with empty values(0s)
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
