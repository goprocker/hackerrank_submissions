import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long factorSum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factorSum += i;
                }
            }

            System.out.println(factorSum);
        }
        scanner.close();
    }
}
