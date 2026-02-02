// display all numbers entered by user except multiple of 10.
import java.util.*;

public class ContinueQs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if(n == 0) { // to exit loop with '0'
                break;
            }

            if(n%10 == 0) {
                continue;
            }
            System.out.println("Your number was:" + n);
        }
     sc.close();   
    }
}
