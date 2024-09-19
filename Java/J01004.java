import java.util.*;

public class Main {
    
    public static String isPrime(long n) {
        if (n <= 1) {
            return "NO";
        }
        if (n == 2) {
            return "YES";
        }
        if (n % 2 == 0) {
            return "NO";
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            long temp = scanner.nextLong();
            System.out.println(isPrime(temp));
        }
        scanner.close();
    }    
}
