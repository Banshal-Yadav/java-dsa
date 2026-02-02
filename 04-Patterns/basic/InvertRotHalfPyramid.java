
public class InvertRotHalfPyramid {

    // print inverted rotated half pyramid with stars
    // number of spaces = n - i, number of stars = i;
    // *
    // **
    // ***
    // ****
    // *****
    public static void half_py(int n) {
        // outer loop -> lines
        for (int i = 1; i <= n; i++) {
            // add spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inverted half pyramid with nums
    // x = 5
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void half_py_nums(int x) {
        for (int i = 1; i <= x; i++) {
            // inner loop for numbers
            for (int j = 1; j <= x - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        half_py(5);
        half_py_nums(5);
    }
}
