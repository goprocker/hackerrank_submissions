import java.io.*;
import java.util.*;

public class Solution {
    public static int SumUniqueElements(int[] arr, int length) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < length; i++) count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        int sum = 0;
        for (int i = 0; i < length; i++) if (count.get(arr[i]) == 1) sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print(SumUniqueElements(arr, n));
    }
}
