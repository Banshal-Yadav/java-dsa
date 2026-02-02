// Write a function to reverse an array in-place without using extra space for another array.
public class reverseArr {
    public static void reverse(int nums[]) {
        int start = 0, end = nums.length - 1;
        for(int i = 0; i < nums.length / 2; i++) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
