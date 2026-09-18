import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int height1 = scanner.nextInt();
            int height2 = scanner.nextInt();
            int height3 = scanner.nextInt();
            
            int tallest = Math.max(height1, Math.max(height2, height3));
            
            System.out.println(tallest);
        }
        scanner.close();
    }
}
