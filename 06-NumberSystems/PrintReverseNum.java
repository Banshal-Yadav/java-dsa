// print the reverse of a given integer
public class PrintReverseNum {
  public static void main(String args[]) {
    int n =128739;
    while(n > 0) {
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n /= 10;
    }
  }
}