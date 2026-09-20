import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long low = sc.nextLong(), high = sc.nextLong(), count = 0;
        for (long n = low; n <= high; n++) {
            long x = n;
            int mask = 0;
            boolean unique = true;
            do {
                int digit = (int)(x % 10);
                if ((mask & (1 << digit)) != 0) { unique = false; break; }
                mask |= 1 << digit;
                x /= 10;
            } while (x > 0);
            if (unique) count++;
            if (n == high) break;
        }
        System.out.println(count);
    }
}
