// write a program that reads a set of integers,
// and then prints the sum of the even and odd integers. 
import java.util.*;

public class SumOddEven {
    public static void main(String aegs[]) {
        System.out.println("Enter numbers : ");
        Scanner sc =  new Scanner(System.in);
        int odd = 0;
        int even = 0;
        while(true) {
            int n = sc.nextInt();
            if(n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
            if(n == 0) { // exit loop
                break;
            }
        }
        System.out.print("sum of even : " + even + "\n");
        System.out.print("sum of odd : " + odd + "\n");
        sc.close();
    }    
}
