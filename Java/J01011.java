import java.util.*;

public class Main {
    
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            long bcnn = lcm(a, b);
            long ucln = gcd(a, b);
            
            System.out.println(bcnn + " " + ucln);
        }
        
        scanner.close();
    }
}
