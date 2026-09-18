import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < m; i++) {
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            boolean sorted = true;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                count++;
            }
        }

        System.out.println(count);
    }
}
