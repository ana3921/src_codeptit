import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		long temp = scanner.nextInt();
    		System.out.println((temp*(temp+1))/2);
    	}
    	
    	scanner.close();
    }
	
}
