import java.util.*;

public class Maxprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int current = sc.nextInt();
        int max = current;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            current = Math.max(x, current + x);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}