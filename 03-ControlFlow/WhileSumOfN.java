// sum of n natural number
import java.util.*;
public class WhileSumOfN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        // print sum from while loop
         System.out.println(sum);
         sc.close();
    }
    
}
