public class ArrArgumentInFunc {
    public static void update(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] += 1; // add 1 to every element
        }
    }

    public static void main(String arg[]) {
        // array is primitive data type -> 'method'
        int arr[] = {90, 95, 99};
        update(arr);
        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        
    }
}
