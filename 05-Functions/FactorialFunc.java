// factorial function 
// int = factorial upto 12! only
// for larger input we can use Long ( upto 20!) or biginteger (Memory is the limit)
import java.util.*;
public class FactorialFunc {
    public static int fact(int a) {
        int facto = 1;
        for (int i = 1; i <= a; i++) {
            facto *= i;
        } 
        return facto;
    }
    public static void main(String args[]) {
        System.out.println("Enter numbers to get factorial: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = fact(x);
        System.out.println("Factorial of " + x + " is " + result);
        sc.close();
    }
}
