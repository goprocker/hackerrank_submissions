import java.io.*;
import java.util.*;

public class Solution {
    public static int detectPerfectNumber(int n) {
        if (n <= 1) return 0;
        int sum = 1;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) sum += other;
            }
        }
        return sum == n ? 1 : sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(detectPerfectNumber(n));
    }
}
