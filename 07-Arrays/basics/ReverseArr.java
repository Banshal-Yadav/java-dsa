// reversing an array
public class ReverseArr {
    public static void reverseArr(int nums[]) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String arg[]) {
        int numbers[] = {1,2,3,4,5};
        reverseArr(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
