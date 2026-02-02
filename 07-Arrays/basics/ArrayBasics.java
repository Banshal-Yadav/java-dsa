
public class ArrayBasics {
    public static void main(String arg[]) {
        // array of size 40  (index starts from 0)
        int arr[] = new int[40]; // empty array store 0s by default and " space " if string array
        // array to store numbers
        int num[] = {1, 2, 3, 4, 5};

        // array to store string
        String fruit[] = {"apple", "mango", "banana"};
        

        // update array
        num[0] = 6; // at 0 index replaces 1 -> 6
        
        // print all arrays
        for(int i = 0; i < num.length; i++) {
            System.err.println("Numbers:" + num[i] + "\n" + fruit[i] + arr[i] );
        }
        // --- cant update string arrays as they are unmutable --
        // fruit[1] = {"grapes"};
    }
}
