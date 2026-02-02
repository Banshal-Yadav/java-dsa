//  prime no. code

import java.util.*;
public class isPrimeNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if(n <= 1) {  // check for 1 and -ve no.
            isPrime = false;
        } else if (n == 2) { // 2 is only even prime
            isPrime = true;
        } else if (n%2 == 0) {  // check for even numbers
            isPrime = false;
        } else {
            for(int i = 3; i <= Math.sqrt(n); i += 2) { // iterate through odd no. only
                if(n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println("Is prime");
        } else {
            System.out.println("Is not prime");
        }
        sc.close();
    }
    
}