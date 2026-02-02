// Kadens max sub array
public class Kadens {
    public static void kadens(int nums[]) {
        int ms = Integer.MIN_VALUE; // max sum
        int cs = 0; // common sum
        for(int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if( cs < 0) {
                cs = 0;
            }
            ms = Math.max( cs, ms);
        }
        System.out.println("Our max subarray is: " + ms);
    }
    public static void main(String args[]) {
        int num[] = {1, -2, 4, -3, -1, 7};
        kadens(num);
    }
}
