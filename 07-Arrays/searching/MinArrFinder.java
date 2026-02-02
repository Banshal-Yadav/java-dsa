public class MinArrFinder {
    public static int maxFind(int arr[]) {
        int smallest = Integer.MAX_VALUE;  // MAX_VALUE for smallest integer comparison and MIN_VALUE for laegest   
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {    
                smallest = arr[i];      
            }
        }
        return smallest;
    }

    public static void main(String arg[]) {
        int num[] = { 1, 2, 3, 4, 5 };
        int max = maxFind(num);
        System.out.println(max);
    }
}

