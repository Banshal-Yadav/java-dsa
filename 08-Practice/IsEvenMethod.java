// Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even, or false other wise.
public class IsEvenMethod {
    public static boolean isEven( int x) {
        boolean isEven = false;
        if(x % 2 == 0) { isEven = true; } 
        return (isEven);
    }
    public static void main(String arg[]) {
        int x = 9;
        System.out.println(isEven(x));
    }
}
