import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextLong();
            }
        }
        
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int r = Math.max(0, i - 1); r <= Math.min(n - 1, i + 1); r++) {
                for (int c = Math.max(0, i - 1); c <= Math.min(n - 1, i + 1); c++) {
                    if (r != i || c != i) {
                        sum += a[r][c];
                    }
                }
            }
            a[i][i] = sum;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a[i][j]);
            }
            if (i + 1 < n) {
                System.out.println();
            }
        }
    }
}
