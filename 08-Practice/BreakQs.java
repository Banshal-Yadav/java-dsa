// Keep entering numbers till user enters a multiple of 10.
import java.util.*;
public class BreakQs {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter any number: ");

        while(true) {
            int n = sc.nextInt();
            if(n%10 == 0 ) {
                break;
            }
            System.err.println("not a multiple of 10");
         }
        System.err.println("multiple of 10");
        sc.close();
    }    
}
