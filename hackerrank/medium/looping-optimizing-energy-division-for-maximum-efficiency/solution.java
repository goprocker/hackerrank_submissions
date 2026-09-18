import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 2) {
                System.out.println(1);
            } else if (n == 3) {
                System.out.println(2);
            } else {
                long product = 1;
                while (n > 4) {
                    product *= 3;
                    n -= 3;
                }
                product *= n;
                System.out.println(product);
            }
        }
        scanner.close();
    }
}
