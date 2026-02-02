// Write a Java method to compute the sum of the digits in an integer.
public class SumOfDigits {
    public static int sumOfDigit(int x) {
        x = Math.abs(x); // convert -ve to +ve num
        int sum = 0;
        while (x != 0) {
            sum += x % 10; // extract last digit and stores in sum var
            x /= 10; // remove last digit after processing
        }
        return sum;
    }
    public static void main(String arg[]) {
        int x = -12345; // will output 1+2+3+4+5 = 15;
        int result = sumOfDigit(x);
        System.out.println(result);
    }
}
