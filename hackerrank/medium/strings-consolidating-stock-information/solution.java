import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        int n = s.length();
        for (int i = 0; i < n; ) {
            char c = s.charAt(i);
            int count = 0;
            while (i < n && s.charAt(i) == c) {
                count++;
                i++;
            }
            System.out.print("" + c + count);
        }
    }
}
