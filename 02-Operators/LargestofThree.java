public class LargestofThree {
    public static void main(String args[]) {
        int a = 10; 
        int b = 3;
        int c = 2;

        if((a >= b) && (a >= c)) {
            System.out.println("A is largest");
        } else if ( b >= c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
