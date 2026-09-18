import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String word = scanner.next();
            int[] charCount = new int[26];
            int maxFrequency = 0;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = c - 'a';
                charCount[index]++;
                if (charCount[index] > maxFrequency) {
                    maxFrequency = charCount[index];
                }
            }

            System.out.println(maxFrequency);
        }
        scanner.close();
    }
}
