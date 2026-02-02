public class MaxArrFinder {
    public static int maxFind(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {    // compare each num with -infinity
                largest = arr[i];      // update largest value each iteration
            }
        }
        return largest;
    }

    public static void main(String arg[]) {
        int num[] = { 1, 2, 3, 4, 5 };
        int max = maxFind(num);
        System.out.println(max);
    }
}
