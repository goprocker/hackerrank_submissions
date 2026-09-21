import java.io.*;
import java.util.*;

public class Solution {
    public static int CheckPassword(char[] str, int n) {
        if (str == null || n < 4) return 0;
        if (Character.isDigit(str[0])) return 0;
        boolean hasDigit = false;
        boolean hasUpper = false;
        for (int i = 0; i < n; i++) {
            char c = str[i];
            if (c == ' ' || c == '/') return 0;
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpper = true;
        }
        return hasDigit && hasUpper ? 1 : 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) s = "";
        System.out.print(CheckPassword(s.toCharArray(), s.length()));
    }
}
