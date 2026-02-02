
// for 0-1 Triangle pattern if (row + col) = even, then print '1' 
// if odd print '0'
public class ZeroOneTri {
    public static void zero_One(int n) {
        // row
        for(int i = 1; i <= n; i++) {
            // col
            for (int j = 1; j <= i; j++) {
                if( (i+j) % 2 == 0) {  
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]) {
        zero_One(3);
    }
}
