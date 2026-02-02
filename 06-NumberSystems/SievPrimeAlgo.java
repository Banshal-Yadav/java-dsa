//  this is the implementation of Sieve of Eratosthenes's prime algorithm 
public class SievPrimeAlgo {
    public static int primeNum(int n) {
        // if n=2 return 1, else 0
        if(n <= 2 ) { return 0;}

        boolean[] isPrime = new boolean[n];
        // assume all nums are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i < n; i++) {  // checking till root n
            if(isPrime[i]) {
                for (int j = i*i; j < n; j += i) { //j = i*i, eg.  7x7 -> as the previous multiples are covered by nums less than 7
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for( int i = 0; i < n; i++) {
            if(isPrime[i]) {count++;}
        }
        return count;
    }

    public static void main(String arg[]) {
        
        System.out.print(primeNum(10));
    }
} 
