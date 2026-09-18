import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read string S
        String s = scanner.next();
        
        // Read integer N (length of string)
        int n = scanner.nextInt();
        
        // Read character C
        char c = scanner.next().charAt(0);
        
        int count = 0;
        
        // Count occurrences of character c in string s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        
        // Print the final count
        System.out.println(count);
        
        scanner.close();
    }
}
