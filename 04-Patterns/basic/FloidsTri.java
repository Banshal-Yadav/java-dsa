public class FloidsTri {
    public static void floyds_triangle( int n) {
        int count = 1;
        // lines
        for(int i = 1; i <= n; i++) {
            // print num and count++
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String arg[]) {
        floyds_triangle(11);
    }
}
