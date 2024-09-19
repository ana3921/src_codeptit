import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
      
        long[] arr;
        arr = new long[92];
        arr[0] = 0;
        arr[1] = 1;
      
        for(int i=2;i<92;i++)
            arr[i] = arr[i-1] + arr[i-2];   
      
        while(t-->0){
            long n = scanner.nextLong();
            boolean isFibonacci = false;
            for(int i=0;i<92;i++){
                if(arr[i] == n){
                    isFibonacci = true;
                    break;
                }
            }
          
            if(isFibonacci == true)
                System.out.println("YES");           
            else
                System.out.println("NO");
        }
        
        scanner.close();
    }
}
