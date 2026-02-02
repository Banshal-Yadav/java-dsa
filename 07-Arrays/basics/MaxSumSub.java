// this program calculates subarray and max subarray sum 
public class MaxSumSub {
    public static void maxSum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += nums[k];
                    System.out.print(currentSum + " ");
                    
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println();
        System.out.println("Max sum: " + maxSum);
    }
    public static void main(String arg[]) {
        int nums[] = { 1, -2, 5, -1 };
        maxSum(nums);
    }
}
