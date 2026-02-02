//convert decimal to binary

public class DecToBin {
    public static void main(String arg[]) {
    int num = 40; // given dec no.
    int myNum = num;
    int binNum = 0;
    int i = 0;
    while (num > 0) {
        int rem = num % 2;  // store rem after dividing by 2
        binNum = binNum + (rem * (int)Math.pow(10, i));  // calculate the dec value
        num /= 2;  // remove the processed digit
        i++;
    }
    System.out.print("binary of " + myNum +" is = "+ binNum);
    }
}
