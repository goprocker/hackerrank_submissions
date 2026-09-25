import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long b = sc.nextLong();
        long h = sc.nextLong();
        long r = sc.nextLong();

        long result = (l * b * h) / r;

        System.out.println(result);

        sc.close();
    }
}
