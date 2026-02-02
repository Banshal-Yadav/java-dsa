import java.util.*;
public class BionomialCoeff {
    public static int fact(int a) {
        int facto = 1;
        for (int i = 1; i <= a; i++) { facto *= i;} 
        return facto;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Calculating Binomial coeffcient --- \nCondition n > r , n > 0, r > 0.");

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();

        int n_fact = fact(n);
        int r_fact = fact(r);
        int r_n_facto = fact(n-r);

        int result = n_fact / (r_fact * r_n_facto);
        
        System.out.println("Binomial coeffcient is " + result);
        sc.close();
    }
}
