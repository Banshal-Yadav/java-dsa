public class LinearSearch {
    public static int linearsearch(int num[], int key) {
        for(int i = 0; i < num.length; i++) {
            if(num[i] == key) {
                return 1;  // true
            }
        }
        return -1; // false
    }    

    public static void main(String arg[]) {
        int numbers[] = {1,2,3,4,5,6,7,8};
        int key = 99;
        int index = linearsearch(numbers, key);
        System.out.println(index);
    }
}
