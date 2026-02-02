// write a java method to compute the average of three numbers
public class AvgOfThreeFunc {
    public static int avgNum(int a, int b, int c) {
            return ((a+b+c)/3);
        }
    public static void main(String arg[]) {
        int x = 3, y = 8, z = 88;
        System.out.println(avgNum( x, y, z));
    }
}
