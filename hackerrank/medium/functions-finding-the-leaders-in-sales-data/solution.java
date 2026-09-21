import java.io.*;
import java.util.*;

public class Solution {
    public static int SumOfLeaders(int[] arr, int n) {
        if (arr == null || n <= 0) return -1;
        int maxRight = arr[n - 1];
        int sum = maxRight;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                sum += arr[i];
                maxRight = arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print(SumOfLeaders(arr, n));
    }
}
