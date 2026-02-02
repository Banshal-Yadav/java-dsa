// simple sum fun and func call
public class SumFunc {
    public static int sum(int a, int b) {
        int prod = a*b;
        return prod;
    }
    public static void main(String args[]) {
        int x = 5;
        int y= 55;
        int result = sum(x,y);
        System.out.println(" x + y = " + result);
    }    
}
