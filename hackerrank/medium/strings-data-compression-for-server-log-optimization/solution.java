import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String s = scanner.next();
            StringBuilder compressed = new StringBuilder();
            
            if (s.length() > 0) {
                compressed.append(s.charAt(0));
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) != s.charAt(i - 1)) {
                        compressed.append(s.charAt(i));
                    }
                }
            }
            System.out.println(compressed.reverse().toString());
        }
        scanner.close();
    }
}
