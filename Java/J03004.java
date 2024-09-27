import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t-->0) {
			String s = scanner.nextLine().trim().toLowerCase();
			String[] a = s.split("\\s+");
			for (String i : a) {
				System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
			}
			 System.out.println();
		}
		scanner.close();
	}
}
