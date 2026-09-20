import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next().replaceFirst("^[+-]", "");
        int k = sc.nextInt();
        int answer = -1;
        for (int i = 0; i < n.length(); i++) {
            if (i + 1 == k) { answer = n.charAt(i) - '0'; break; }
        }
        System.out.println(answer);
    }
}
