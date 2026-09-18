import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int original = n;
            int sumOfFactorials = 0;

            while (n > 0) {
                int digit = n % 10;
                sumOfFactorials += factorial(digit);
                n /= 10;
            }

            if (sumOfFactorials == original) {
                System.out.println("Rare Item");
            } else {
                System.out.println("Common Item");
            }
        }
        scanner.close();
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
