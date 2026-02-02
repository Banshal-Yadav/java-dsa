// Binary Search
// only works on sorted arrays 
// time complexity -> O(log N)

public class BinarySearch {
    public static int BSearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = ( start + end) / 2;

            // if mid == key
            if( num[mid] == key) {
                return mid;
            }
            // check right and left
            if( num[mid] < key) {  
                start = mid + 1;
            } else { 
                end = mid - 1;
            }
        }
        return -1; 
    }    

    public static void main(String arg[]) {
        int number[] = { 5, 6, 7, 8, 11, 55, 66, 99};
        int key = 19;
        int result = BSearch(number, key);
        if(result == -1) {
            System.out.println(key+" Not found in the array");
        } else {
            System.out.println(key + " is present at index:"+ result);
        }
        
    }
}
