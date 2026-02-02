// Given an array, reverse only the elements between indices left and right (inclusive).
public class reverseArray2 {
    public static void reverse(int nums[], int left, int right) {
        while( left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
    public static void main(String arg[]) {
        int nums[] = { 1,2,3,4,5,6,7,8,9};
        int left = 1, right = 4;
        reverse(nums, left, right);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
