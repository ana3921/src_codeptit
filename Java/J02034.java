import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i)
            a.add(scanner.nextInt());
        if (a.size() == n && a.get(n - 1) == n)
            System.out.println("Excellent!");
        else
        {
            boolean[] f = new boolean[a.get(n - 1) + 5];
            for (int i : a)
                f[i] = true;
            for (int i = 1; i <= a.get(n - 1); ++i)
                if (!f[i])
                    System.out.println(i);
        }
        scanner.close();
    }

}
