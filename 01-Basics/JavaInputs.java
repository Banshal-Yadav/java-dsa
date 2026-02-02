// inputs in java
import java.util.*;
public class JavaInputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       // String input = sc.next(); // next() -> process string till space
       // System.out.println(input);

        String name = sc.nextLine(); // nextline -> process whole string including space
        System.out.println(name);

        int num = sc.nextInt(); // nextInt -> take integer as input
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);
        sc.close();
    }
}
