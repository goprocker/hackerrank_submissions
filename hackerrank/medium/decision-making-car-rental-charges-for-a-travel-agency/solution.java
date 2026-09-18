import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int r1 = scanner.nextInt();
            int n = scanner.nextInt();
            int r2 = scanner.nextInt();
            int x = scanner.nextInt();

            // Convert total minutes to hours using ceiling division
            int totalHours = (x + 59) / 60;
            int totalCost = 0;

            if (totalHours <= n) {
                totalCost = totalHours * r1;
            } else {
                totalCost = (n * r1) + ((totalHours - n) * r2);
            }

            System.out.println(totalCost);
        }
        scanner.close();
    }
}
