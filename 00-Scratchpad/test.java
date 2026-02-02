public class test {
    public static int isprime(int n) {

        if(n == 2 ){ return 0;}

        boolean[] isPrime = new boolean[n];

        // assume all nums are prime
        for(int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // check till root i
        for(int i = 2; i*i < n; i++){
            if(isPrime[i]){
                for(int j = i*i; j < n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=0; i < n; i++) {
            if(isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 16;
        System.out.println(isprime(n));
    }
}
