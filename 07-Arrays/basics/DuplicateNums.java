// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class DuplicateNums {
    public static boolean duplicateNum(int[] nums) {
      boolean isSame = false;
      int count = 0;
      for(int i = 0; i < nums.length; i++) {
        for(int j = i+1; j < nums.length; j++) {
          if(nums[i] == nums[j]) {
            isSame = true;
          }
        }
        if(isSame) {count++;}
      }
      return (count >= 2) ? true : false;
    }

    public static void main(String[] args) {
        int[] data = {0,1, 2, 3, 8,0};
        System.out.println(duplicateNum(data));
    }
}
