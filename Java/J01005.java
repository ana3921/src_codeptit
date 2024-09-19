import java.util.*;

public class Main{
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	int t = scanner.nextInt();
    	
    	while(t-->0) {
    		double n = scanner.nextDouble();
    		double h = scanner.nextDouble();
    		for(int i = 1;i<n;i++) {
    			double h_i = Math.sqrt(i/n)*h;
    			System.out.printf("%.6f ", h_i);
    		}
    		System.out.println();
    	}
    	
    	scanner.close();
    }	
}
