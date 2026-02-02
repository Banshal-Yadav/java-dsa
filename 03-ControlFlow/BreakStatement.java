// 'break' exits the for loop as soon as it meets the condition
public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3) {
                break;
            }
            System.err.println(i);
        }
        System.err.println("Im out of the loop");
    }
}
