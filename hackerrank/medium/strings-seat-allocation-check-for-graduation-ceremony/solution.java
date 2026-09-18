import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String s = scanner.next();
            int correctCount = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = Character.toLowerCase(s.charAt(i));
                int expectedCharNum = i + 1; // 1-based index (1 for 'a', 2 for 'b', etc.)
                int actualCharNum = c - 'a' + 1;

                if (actualCharNum == expectedCharNum) {
                    correctCount++;
                }
            }

            System.out.println(correctCount);
        }
        scanner.close();
    }
}
