import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        String xStr = scanner.nextLine();
        char x = xStr.charAt(0);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != x) {
                result.append(ch);
            }
        }
        
        System.out.println(result.toString());
        
        scanner.close();
    }
}
