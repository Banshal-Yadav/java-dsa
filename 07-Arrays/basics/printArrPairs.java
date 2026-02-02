// print pairs in array, excluding similar pairs eg. (2,2)
// tp = n*(n-1)/2
// time complexity = O(n^2)
public class printArrPairs {
    public static void main(String arg[]) {
        int nums[] = {2,4,6,8,10, 11, 12, 13, 14};
        int totalPairs = 0;
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i]; // keep track of current number
            for(int j = i+1; j < nums.length; j++) {
                System.out.print("("+ current + "," + nums[j] + ")"); // print consequtive numbers  with current
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }
}