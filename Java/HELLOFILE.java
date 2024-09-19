import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("Hello.txt"));
        while(scanner.hasNextLine())
            System.out.println(scanner.nextLine());
        
        scanner.close();
    }
	
}
