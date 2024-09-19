import java.util.Scanner;

public class Main {
	
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int step = 1;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped) {
                System.out.print("Buoc " + step + ": ");
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                step++;
            } else {
                break;
            }
        }
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);
        
        scanner.close();
    }

    
}
