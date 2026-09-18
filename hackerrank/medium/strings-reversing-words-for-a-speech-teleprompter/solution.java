import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            
            int n = s.length();
            int i = n - 1;
            
            while (i >= 0) {
               
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }
                if (i < 0) break;
                
               
                int right = i;
                
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                int left = i + 1;
                
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(s.substring(left, right + 1));
            }
            
            System.out.println(result.toString());
        }
        scanner.close();
    }
}
