public class LinearSearchStr {
    public static int linear_srch_str(String str[], String key) {
        for(int i = 0; i < str.length; i++) {
            if(str[i] == key) {
                return i; // return index number
            }
        }
        return -1; 
    }    

    public static void main(String arg[]) {
        String str[] = { "idli", "dhosa", "wada"};
        String key = "wada";

        int index = linear_srch_str(str, key);

        if(index == -1) { // if function return -1 (false)
            System.out.println("Not found" );
        } else {
            System.out.println(key + " is at index "+index);
        }
        
    }
}
