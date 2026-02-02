// print sub arrays
public class SubArray {
    public static void subArrays(int nums[]) {
        int ts = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public static void main(String arg[]) {
        int numbers[] = {2,3,4,5,6,7};
        subArrays(numbers);
    }
}
