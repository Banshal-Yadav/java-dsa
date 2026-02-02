// --- Binary to Decimal -- 
//  Converts a binary number to its decimal equivalent.

import java.util.*;
public class BinaryToDec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter binary digits (eg: 101): ");
        int n = sc.nextInt();  // get binary input

        String s = String.valueOf(n);  // convert int to string
        int dec = 0;  // dec result
        int ld = 0;

        for(int i = 0; i < s.length() ; i++) {  //
            ld = n%10; // extract last digit
            dec = dec +(ld * (int)Math.pow(2,i));  // add calculated ld value in formula
            n /= 10; // remove processed digit
        }
        
        System.out.println(dec);
        sc.close();
    }
}
