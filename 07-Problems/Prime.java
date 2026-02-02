import java.util.*;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) { // 2 is prime number
            System.out.println("n is prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) { // two multiples start repeating half way to the given n so sqrt it
                if (n % i == 0) { // i is not equal to 1 or n
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        sc.close();
    }
}
