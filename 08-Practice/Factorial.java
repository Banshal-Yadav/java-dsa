//  find factorial of n.
import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int facto = 1;
        if( (n == 0 ) || ( n == 1) ) {
            System.out.println("Factorial is 1.");
        } else {
            for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
      }
       System.out.println(facto);
       sc.close();
    }
}
