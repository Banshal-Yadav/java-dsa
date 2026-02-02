public class palindrome {

     public static boolean palindromeNum(int n) {
        int rev = 0;
        int originalNum = n;
        while (n != 0) {
            int ld = n%10;
            rev = (rev * 10) + ld;
            n /= 10;
        }
        return (originalNum == rev);
       }
    public static void main(String[] args) {
      System.out.println(palindromeNum(1111));
    }
    
}
