// write a java program to check if a number is palindrome or not
public class Palindrome {
    public static boolean isPalindrome(int x) {
        int originalNum = x;
        int rev = 0;
        int ld = 0;
        while(x != 0) {
            ld = x % 10;
            rev = (rev * 10) + ld;
            x /= 10;
        }
        return originalNum == rev; // will compare and return T/F
    }
    public static void main(String arg[]) {
        int a = 1221;
        System.out.print(isPalindrome(a));
    }
}
