import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        StringBuilder lowerCaseStr = new StringBuilder();
        int count = 0;
        for (int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowerCaseStr.append(ch);
                count++;
                
            }
        }
        System.out.println(lowerCaseStr.toString() + " " + count);
       scanner.close(); 
    }
}
