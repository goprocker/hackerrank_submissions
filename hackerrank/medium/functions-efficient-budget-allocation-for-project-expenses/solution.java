import java.io.*;
import java.util.*;

public class Solution {
    public static int OddEvenSum(int num) {
        int odd = 0;
        int even = 0;
        if (num == 0) return 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) even += digit;
            else odd += digit;
            num /= 10;
        }
        return odd >= even ? odd : even;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(OddEvenSum(num));
    }
}
