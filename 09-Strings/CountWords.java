// Count number of words in a string
// Words may be separated by multiple spaces
import java.util.Scanner;

public class CountWords {

    public static int countWords(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = countWords(s);
        System.out.println(res);
        sc.close();
    }
}
