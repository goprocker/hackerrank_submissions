import java.io.*;
import java.util.*;

public class Solution {
    public static String replaceCharacter(String str, int n, char ch1, char ch2) {
        if (str == null || str.length() == 0) return null;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch1) chars[i] = ch2;
            else if (chars[i] == ch2) chars[i] = ch1;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.hasNext() ? sc.next() : "";
        char ch1 = sc.hasNext() ? sc.next().charAt(0) : '\0';
        char ch2 = sc.hasNext() ? sc.next().charAt(0) : '\0';
        String ans = replaceCharacter(str, str.length(), ch1, ch2);
        if (ans != null) System.out.print(ans);
    }
}
