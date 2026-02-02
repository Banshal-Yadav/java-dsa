// 'continue' is used to skip an iteration
public class ContinueStatement {
    public static void main(String args[]) {
        for(int i = 0; i < 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("kipped 3");
    }
}
