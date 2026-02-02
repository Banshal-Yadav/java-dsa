public class HollowRec {
    public static void hollow_rect(int t_row, int t_col) {
        // outer loop -> row
        for(int i = 1; i <= t_row; i++) {
            // inner loop -> col
            for(int j = 1; j <= t_col; j++) {
                if ( i == 1 || i == t_row || j == 1 || j == t_col) {
                    System.out.print(" * "); 
                } else {
                    System.out.print("   "); // blank cell
                }
            }
            System.out.println(); // next line
        }   
    }
    public static void main(String arg[]) {
        hollow_rect(5, 5);
    }
}
