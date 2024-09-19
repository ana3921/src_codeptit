import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            long first = 1;
            long second = 1;
            long next = 0;
            
            if (n == 1) {
                System.out.println(first);
            } else if (n == 2) {
                System.out.println(second);
            } else {
                for (int i = 3; i <= n; i++) {
                    next = first + second;
                    first = second;
                    second = next;
                }
                System.out.println(next);
            }
        }
        
        scanner.close();
    }   
}
