import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i > 0) result.append(" ");
            result.append(a);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        System.out.println(result);
    }
}
